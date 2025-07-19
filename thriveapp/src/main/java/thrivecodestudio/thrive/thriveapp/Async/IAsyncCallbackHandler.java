package thrivecodestudio.thrive.thriveapp.Async;

public interface IAsyncCallbackHandler {
    void addCallBack();
    void removeCallBack();
    boolean isCallBackExpired();
    boolean isCallBackDone();
}
