package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;


public enum ThriveOperations {
	CBT_CARD(0),
	JOURNAL_CARD(1),
	TASK_CARD(2);

	private int operationId;

	private ThriveOperations(final int id) {
		this.operationId = id;	
	}

	public int getOperationId() {
		return this.operationId;
	}
}
