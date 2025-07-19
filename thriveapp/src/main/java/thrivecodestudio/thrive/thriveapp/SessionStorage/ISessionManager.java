package thrivecodestudio.thrive.thriveapp.SessionStorage;

public interface ISessionManager {
    void addSocketSessionToInMemoryStorage();
    void removeSocketSessionFromInMemoryStorage();
    void addSocketSessionToRemoteStorage();
    void removeSocketSessionFromRemoteStorage();
}
