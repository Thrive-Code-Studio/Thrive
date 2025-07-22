package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import thrivecodestudio.thrive.thriveapp.SessionStorage.ISessionManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

import org.springframework.context.annotation.Scope;

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
    public boolean isSessionAlreadyPerformed(final byte[] key) {
	   Iterator<SessionData> d =  this.inMemorySessionChannel.iterator();
	   while (d.hasNext()) {
	   	final SessionData session = d.next();
		final byte[] sessionId = session.getSessionId();

		if (sessionId.equals(key))
			return true;
	   }
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
