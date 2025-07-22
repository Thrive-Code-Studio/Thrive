package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;


/**
 * @apiNote this class represent the HTTP session
 * data type, contains all the data that will be
 * stored both in a in-memory cache and a distributed cache
 * like Redis, or Riak.
 * */	
public class SessionData {
	// the session id is represented by
	// the username added to an incremental
	// integer that acts as a logical clock
	private byte[] sessionId;
	private String actionUser;
	private ThriveOperations opCode;

	// this field contains the ID data of each 
	// cards in the app. 
	private byte[] rawData;

	public SessionData(final byte[] sessionId, final String userResponsible, final ThriveOperations operationCode, byte[] raw) {
		this.sessionId = sessionId;
		this.actionUser = userResponsible;
		this.opCode = operationCode;
		this.rawData = raw;
	}

	// getters
	public byte[] getSessionId() {
		return this.sessionId;
	}

	public String getActionUser() {
		return this.actionUser;
	}

	public byte[] getRawData() {
		return this.rawData;
	}
}

