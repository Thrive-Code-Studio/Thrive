package thrivecodestudio.thrive.thriveapp.Endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import thrivecodestudio.thrive.thriveapp.SessionStorage.ISessionManager;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping(path = "/thrive")
public class OutboundAdapter {
    /**
     * this feld is responsible of managing the sessions
     * in order to provide a low-latency indepotency 
     * system when the clients retry HTTP requests
     * in case of network failures
     * */ 
    @Autowired
    private ISessionManager sessionM;

    @PostMapping(path = "/cbt-new-card")
    public void handleCBTCardCreation() {

    }

    @PostMapping(path = "/new-patient-account")
    public void handlePatientAccountCreation() {

    }

    @PostMapping(path = "/journal-new-card")
    public void handleNewJournalCreation(HttpRequest r, HttpResponse w) {

    }

    @PostMapping(path = "/task-new-card")
    public void handleTaskCreation() {
    
    }

    @DeleteMapping(path = "/cbt-card-delete/{cardId}")
    public void handleCBTCardDeletion() {
    	
    }

    @DeleteMapping(path= "/cbt-journal-delete/{journalId}")
    public void handleJournalDeletion() {
    
    }

    @DeleteMapping(path = "/task-delete/{taskId}")
    public void handleTaskDeletion() {
    }

    @GetMapping(path="/cbt-cards/{userId}")
    public void handleCBTCardsFetch() {
    
    }

    @GetMapping(path = "/journal/{userId}")
    public void handleJournalsFetch() {
    
    }

    @GetMapping(path = "/task/{userId}")
    public void handleTasksFetch() {
    
    }

}
