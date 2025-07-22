package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *@apiNote this class represents the consumer thread
 *that will read from the blocking queue the session datas
 * and will store them to a distributed cache and an in-memory cache
 * */ 
@Configuration
@EnableAsync
public class SessionDispatcher {
    @Autowired
    private SessionManager sessionPublisher;
    @Autowired
    private AbstractInMemoryCacheAdapter inMemoryCacheAdpt;
    @Autowired
    private AbstractDistributedCacheAdapter distributedCacheAdpt;
    private SessionData dataRetreived;


    @Bean
    public SessionDispatcher dispatcherObjCreator() {
        return new SessionDispatcher();
    }


    @Async
    public void takeSessionData() {
        LinkedBlockingQueue<SessionData> channel = (LinkedBlockingQueue<SessionData>) this.getQueue();

        do {
            if (!(channel.isEmpty())) {
             try {
                this.dataRetreived = channel.take();
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
             
             this.inMemoryCacheAdpt.storeData(this.dataRetreived.getSessionId(), this.dataRetreived);
            }
             
        } while (true);
    }


    private BlockingQueue<SessionData> getQueue() {
        return this.sessionPublisher.getUnboundedSessionDataChannel();
    }
}
