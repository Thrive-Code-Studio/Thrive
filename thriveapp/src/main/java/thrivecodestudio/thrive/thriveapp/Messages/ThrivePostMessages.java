package thrivecodestudio.thrive.thriveapp.Messages;

import java.text.DateFormat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
		public CBTCardCreationMessage createMessage(@JsonProperty("tile") final String title,
				                            @JsonProperty("description") final String desc,
							    @JsonProperty("anticipation") final String ant,
							    @JsonProperty("though") final String t,
							    @JsonProperty("conseguences") final String cons) {
			return new CBTCardCreationMessage(title, desc, ant, t, cons);
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
		private String journalCardTitle;
		private DateFormat journalCardCreationDate;
		private String journalCardContent;
		//private Session sessionData;

		@JsonCreator
		public JournalCardCreationMessage createJournalCard(@JsonProperty("title") final String jTitle,
															@JsonProperty("timestamp") final DateFormat timestamp,
															@JsonProperty("text") final String jContent) {

			return new JournalCardCreationMessage(jTitle, timestamp, jContent);											

		}

		private JournalCardCreationMessage(final String title, final DateFormat timestamp, final String text) {
			this.journalCardContent = title;
			this.journalCardCreationDate = timestamp;
			this.journalCardContent = text;
		}

		public String getJournalCardTitle() {
			return this.journalCardContent;
		}

		public String getJournalCardText() {
			return this.journalCardContent;
		}

		public DateFormat getDateTimestamp() {
			return this.journalCardCreationDate;
		}

	}

	/** 
	 *@apiNote this static class acts as a wrapper
	 *for the JSON-based decoded message containing
	 *the informations about the creation of a new
	 *CBT Task.
	 **/
	public static class TaskCardCreationMessage {
		private String taskTitle;
		private String taskDescription;
		private DateFormat notificationDate;
		// private SessionContext sessionData;

		@JsonCreator
		public TaskCardCreationMessage createTaskMessage(@JsonProperty("title") final String tTitle,
														@JsonProperty("description") final String tDescription,
														@JsonProperty("notification") final DateFormat tDate) {
			return new TaskCardCreationMessage(tTitle, tDescription, tDate);
		}

		private TaskCardCreationMessage(final String taskTitle, final String taskDesc, final DateFormat expiration) {
			this.taskTitle = taskTitle;
			this.taskDescription = taskDesc;
			this.notificationDate = expiration;
		}

		public String getTaskTitle() {
			return this.taskTitle;
		}

		public String getTaskDescription() {
			return this.taskDescription;
		}

		public DateFormat getTaskNotificationDate() {
			return this.notificationDate;
		}
	
	}

	public static class TherapistAccountCreationMessage {
		private String therapistName;
		private String therapistSurname;
		private String therapistUsername;
		private String therapistEmail;
		private String therapistPassword;

		@JsonCreator
		public TherapistAccountCreationMessage createTherapistAccountMessage(@JsonProperty("name") final String name,
																			 @JsonProperty("surname") final String surname,
																			 @JsonProperty("username") final String username,
																			 @JsonProperty("email") final String email,
																			 @JsonProperty("password") final String password) {
			return new TherapistAccountCreationMessage(name, surname, username, email, password);
		}

		private TherapistAccountCreationMessage(final String name, final String surname, 
												final String username, final String email,
											    final String password) {
			this.therapistName = name;
			this.therapistSurname = surname;
			this.therapistEmail = email;
			this.therapistPassword = password;
			this.therapistUsername = username;
		}

		public String getTherapistName() {
			return this.therapistName;
		}

		public String getTherapistSurname() {
			return this.therapistSurname;
		}

		public String getTherapistUsername() {
			return this.therapistUsername;
		}

		public String getTherapistEmail() {
			return this.therapistEmail;
		}

	}

	public static class PatientAccountCreationMessage {
		private String patientName;
		private String patientSurname;
		private String patientUsername;
		private String patientEmail;
		private String patientPassword;
		private String patientMentalIssue;
		// private SessionContext sessionData;

		@JsonCreator
		public PatientAccountCreationMessage createPatientAccountCreationMessage(@JsonProperty("name") final String pName,
																				 @JsonProperty("surname") final String pSurname,
																				 @JsonProperty("username") final String pUsername,
																				 @JsonProperty("email") final String pEmail,
																				 @JsonProperty("password") final String pPassword,
																				 @JsonProperty("issue") final String mentalIssue) {

			return new PatientAccountCreationMessage(pName, pSurname, pUsername, pEmail, pPassword, patientMentalIssue);
		}

		private PatientAccountCreationMessage(final String name, final String surname,
											  final String username, final String email,
											  final String password, final String mentalIssue) {
			this.patientName = name;
			this.patientSurname = surname;
			this.patientUsername = username;
			this.patientEmail = email;
			this.patientPassword = password;
			this.patientMentalIssue = mentalIssue;
		}

		public String getPatientName() {
			return this.patientName;
		} 

		public String getPatientSurname() {
			return this.patientSurname;
		}

		public String getPatientEmail() {
			return this.patientEmail;
		}

		public String getPatientPassword() {
			return this.patientPassword;
		}

		public String getPatientMentalIssue() {
			return this.patientMentalIssue;
		}

		public String getPatientUsername() {
			return this.patientUsername;
		}
	}
}
