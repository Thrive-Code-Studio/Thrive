package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import thrivecodestudio.thrive.thriveapp.SessionStorage.ISessionManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
public class SessionManager implements ISessionManager {
    private BlockingQueue<SessionData> inMemorySessionChannel;

    public SessionManager() {
        this.inMemorySessionChannel = new LinkedBlockingQueue<SessionData>();
    }

    @Override
    public void forwardToChannel(final SessionData data) {
        try {
            this.inMemorySessionChannel.put(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeFromChannel(final SessionData data) {
    
    }

    @Override
    public boolean isSessionPresentInChannel(final int key) {
        return false;
    }

    @Override
    public boolean isSessionAlreadyPerformed(final int key) {
        return false;
    }

    /**
     * @see SessionDispatcher
     * @return
     */
    public BlockingQueue<SessionData> getUnboundedSessionDataChannel() {
        return this.inMemorySessionChannel;
    }
}
