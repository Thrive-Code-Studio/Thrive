package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;


/**
 * @apiNote this class represent the HTTP session
 * data type, contains all the data that will be
 * stored both in a in-memory cache and a distributed cache
 * like Redis, or Riak.
 * */	
public class SessionData {
	private long sessionId;
	private String actionUser;
	private ThriveOperations opCode;
	private byte[] rawData;

	public SessionData(final long sessionId, final String userResponsible, final ThriveOperations operationCode, byte[] raw) {
		this.sessionId = sessionId;
		this.actionUser = userResponsible;
		this.opCode = operationCode;
		this.rawData = raw;
	}

	// getters
	public long getSessionId() {
		return this.sessionId;
	}

	public String getActionUser() {
		return this.actionUser;
	}

	public byte[] getRawData() {
		return this.rawData;
	}

	public void parseRawData() {
		// TODO
	}

	private void setRawData() {
		// TODO
	}
}

