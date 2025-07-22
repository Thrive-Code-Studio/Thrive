package thrivecodestudio.thrive.thriveapp.SessionStorage;

import thrivecodestudio.thrive.thriveapp.SessionStorage.Impl.SessionData;

public interface ISessionManager {
	void forwardToChannel(final SessionData data);
	void removeFromChannel(final SessionData dataToRemove);
	boolean isSessionPresentInChannel(final int sessionId);
	boolean isSessionAlreadyPerformed(final int sessionId);
}
