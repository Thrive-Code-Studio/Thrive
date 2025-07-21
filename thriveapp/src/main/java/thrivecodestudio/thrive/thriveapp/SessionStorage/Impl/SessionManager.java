package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import thrivecodestudio.thrive.thriveapp.SessionStorage.ISessionManager;
import java.util.concurrent.BlockingQueue;

public class SessionManager implements ISessionManager {
    private BlockingQueue<SessionData> inMemorySessionChannel;

    public SessionManager() {
	    this.inMemorySessionChannel = new BlockingQueue<SessionData>();
    }

    @Override
    public void forwardToChannel() {
    
    }

    @Override
    public void removeFromChannel() {
    
    }

    @Override
    public boolean isSessionPresentInChannel() {
    
    }

    @Override
    public boolean isSessionAlreadyPerformed() {
    
    }

}
