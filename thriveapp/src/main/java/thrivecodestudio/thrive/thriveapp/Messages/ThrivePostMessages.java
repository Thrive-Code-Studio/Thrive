package thrivecodestudio.thrive.thriveapp.Messages;


public class ThrivePostMessages {

	/**
	 *@apiNote this static class is a wrapper
	 *that contains the deserialized content of 
	 *the creation of a new CBT card
	 * */ 
	public static class CBTCardCreationMessage {
		private String cardTitle;
		private String cardDescription;
		private String cardAnticipationMoment;
		private String cardThough;
		private String cardConseguences;
		//private Session sessionData;

		@JsonCreator
		public CBTCardCreationMessage createMessage(@jsonProperty("tile") final String title,
				                            @JsonProperty("description") final String desc,
							    @JsonProperty("anticipation") final String ant,
							    @JsonProperty("though") final String t,
							    @JsonProperty("conseguences") final String cons) {
			return new CBTCardCreationMessage(title, desc, ant, t cons);
		}

		private CBTCardCreationMessage(final String title, 
				               final String desc, 
					       final String ant, 
					       final String t, 
					       final String cons) {
			this.cardTitle = title;
			this.cardDescription = desc; 
			this.cardAnticipationMoment = ant; 
			this.cardThough = t;
			this.cardConseguences = cons;
		}

		public String getCardTitle() {
			return cardTitle;
		}

		public String getCardDescription() {
			return cardDescription;
		}

		public String getCardAntincipationMoment() {
			return cardAnticipationMoment;
		}

		public String getCardThough() {
			return cardThough;
		}

		public String getCardConseguences() {
			return cardConseguences;
		}
	}

	/**
	 *@apiNote this static class acts as a wrapper
	 *that contains the deserialized content of the
	 *JSON-based message responsible of creating
	 *a new Journal Card
	 * */
	public static class JournalCardCreationMessage {
	
	}

	/** 
	 *@apiNote this static class acts as a wrapper
	 *for the JSON-based decoded message containing
	 *the informations about the creation of a new
	 *CBT Task.
	 **/
	public static class TaskCardCreationMessage {
	
	}

	public static class TherapistAccountCreationMessage {
		// TODO
	}

	public static class PatientAccountCreationMessage {
	
	}
}
