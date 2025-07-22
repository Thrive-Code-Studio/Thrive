package thrivecodestudio.thrive.thriveapp.SessionStorage;

import thrivecodestudio.thrive.thriveapp.SessionStorage.Impl.SessionData;

public interface ISessionManager {
	void forwardToChannel(final SessionData data);
	boolean isSessionAlreadyPerformed(final byte[] sessionId);
}
