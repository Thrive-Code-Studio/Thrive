package thrivecodestudio.thrive.thriveapp.Async.Impl;


import thrivecodestudio.thrive.thriveapp.Async.IAsyncCallbackHandler;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;


public class AsyncCallbackHandler implements IAsyncCallbackHandler {
    private ConcurrentLinkedQueue<HttpServletResponse> callbackHandler;

    public AsyncCallbackHandler() {
	    this.callbackHandler = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void addCallBack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCallBack'");
    }

    @Override
    public void removeCallBack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCallBack'");
    }

    @Override
    public boolean isCallBackExpired() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCallBackExpired'");
    }

    @Override
    public boolean isCallBackDone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCallBackDone'");
    }
    
}
