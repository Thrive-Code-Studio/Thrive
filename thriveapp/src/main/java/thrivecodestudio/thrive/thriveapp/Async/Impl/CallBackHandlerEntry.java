package thrivecodestudio.thrive.thriveapp.Async.Impl;

import java.util.function.BiFunction;
import jakarta.servlet.http.HttpServletResponse;

public class CallBackHandlerEntry {
	private BiFunction callback;
	private HttpServletResponse w;
	private int operationCode;
	private final static long TTL_ENTRY_TIME = 3;
	// TODO => add data input

	public CallBackHandlerEntry(final HttpServletResponse w, final int opCode) {
		this.w = w;
		this.operationCode = opCode;
	}

	public void executeCallBackFunction() {
	
	}

	public static BiFunction selectCorrectCallbackFunction() {
		return null;
	}
}
