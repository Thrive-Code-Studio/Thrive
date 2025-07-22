package thrivecodestudio.thrive.thriveapp.Endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import thrivecodestudio.thrive.thriveapp.SessionStorage.ISessionManager;
import thrivecodestudio.thrive.thriveapp.SessionStorage.Impl.SessionData;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/thrive")
public class OutboundAdapter {
    /**
     * this feld is responsible of managing the sessions
     * in order to provide a low-latency deduplication
     * system when the clients retry HTTP requests
     * in case of network failures
     * */ 
    @Autowired
    private ISessionManager sessionM;

    @PostMapping(path = "/cbt-new-card")
    public void handleCBTCardCreation(HttpServletResponse res) {
	  final SessionData data = new SessionData();
	  this.sessionM.forwardToChannel(data); 

    }

    @PostMapping(path = "/new-patient-account")
    public void handlePatientAccountCreation(HttpServletResponse res) {
	    final SessionData sessionAccountCreation = new SessionData(); 
	    this.sessionM.forwardToChannel(sessionAccountCreation);

    }

    @PostMapping(path = "/journal-new-card")
    public void handleNewJournalCreation(HttpServletResponse res) {
	    final SessionData sessionJournalCreation = new SessionData(); 
	    this.sessionM.forwardToChannel(sessionJournalCreation);

    }

    @PostMapping(path = "/task-new-card")
    public void handleTaskCreation(HttpServletResponse res) {
	    final SessionData sessionTaskCreation = new SessionData();
	    this.sessionM.forwardToChannel(sessionTaskCreation);
    
    }

    @DeleteMapping(path = "/cbt-card-delete/{cardId}")
    public void handleCBTCardDeletion(HttpServletResponse res) {
	    final SessionData sessionCBTCardElim = new SessionData();
	    this.sessionM.forwardToChannel(sessionCBTCardElim);
    	
    }

    @DeleteMapping(path= "/cbt-journal-delete/{journalId}")
    public void handleJournalDeletion(HttpServletResponse res) {
	    final SessionData sessionJournalDeletion = new SessionData();
	    this.sessionM.forwardToChannel(sessionJournalDeletion);
    
    }

    @DeleteMapping(path = "/task-delete/{taskId}")
    public void handleTaskDeletion(HttpServletResponse res) {
	    final SessionData sessionTaskDeletion = new SessionData(); 
	    this.sessionM.forwardToChannel(sessionTaskDeletion);
    }

    @GetMapping(path="/cbt-cards/{userId}")
    public void handleCBTCardsFetch(HttpServletResponse res) {
    
    }

    @GetMapping(path = "/journal/{userId}")
    public void handleJournalsFetch(HttpServletResponse res) {
    
    }

    @GetMapping(path = "/task/{userId}")
    public void handleTasksFetch(HttpServletResponse res) {
    
    }
}
