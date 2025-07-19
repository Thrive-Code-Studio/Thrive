package thrivecodestudio.thrive.thriveapp.Endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/thrive")
public class OutboundAdapter {

    @PostMapping(path = "/cbt-new-card")
    public void handleCBTCardCreation() {

    }

    @PostMapping(path = "/new-therapist-account")
    public void handleTherapistAccounCreation() {

    }

    @PostMapping(path = "/new-patient-account")
    public void handlePatientAccountCreation() {

    }

    @PostMapping(path = "/new-relation")
    public void handlePatientAndTherapistRelation() {

    }   
}
