package thrivecodestudio.thrive.thriveapp.SessionStorage;

public interface ISessionManager {
	void forwardToChannel();
	void removeFromChannel();
	boolean isSessionPresentInChannel();
	boolean isSessionAlreadyPerformed();
}
