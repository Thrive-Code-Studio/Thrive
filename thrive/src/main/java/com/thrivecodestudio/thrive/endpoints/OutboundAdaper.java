
package com.thrivecodestudio.thrive;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * This class provide a single entry point for the application
 * Every HTTP requests made by clients will enter in this spot
 * and will be routed to the correct controller.
 * */
@Controller
@RequestMapping("/thrive")
public class OutboundAdaper {

	/**
	 *@apiNote this method is responsible of handling
	 *the creation of a new CBT card by users.
	 *is responsible of updating the set of CBT cards held
	 *by the given user
	 */
	@PostMapping(path="/cbt-new", consumes="application/json")
	public ResponseEntity<Void> handleAddCBTCard() {
		// TODO
	}

	/**
	 *@apiNote this method is responsible of handling the
	 *creation of a new account performed by a user, its update
	 *the database with the new account informations
	 */ 
	@PostMapping(path="/patient-new", consumes="application/json")
	public ResponseEntity<Void> handlePatientAccountCreation() {
		// TODO
	}

	/**
	 *@apiNote this method is responsible of handling the
	 *creation of a new account performed by a psychologist.
	 *this method will update the database with the new account
	 *informations
	 */
	@PostMapping(path="/psy-new", consumes="application/json")
	public ResponseEntity<Void> handlePsychologistAccountCreation() {
		// TODO
	}

	/**
	 *@apiNote this method is responsible of handling the 
	 *creation of a new link between a given user and a 
	 *psychologist, in this way they can both communicate with
	 *each other
	 */
	@PostMapping(path="/connect-pps", consumes="application/json")
	public ResponseEntity<Void> hanldePatientPsyRelationshipCreation() {
		// TODO
	}

	/**
	 *@apiNote this method will handle the search of a
	 *given therapist
	 *{@value} the path-based paramter contains the nickname of
	 *the therapist
	 *@return therapist account
	 */
	@GetMapping(value="/search-psy/{psy-nick}")
	public ResponseEntity<Void> handlePsychologistSearch() {
		// TODO
	}

	/**
	 *@apiNote this method will handle the search of a
	 *patient performed by a therapist
	 *@return patient account
	 */ 
	@GetMapping(path="/search-patient/{patient-nick}")
	public ResponseEntity<Void> handlePatientSearch() {
		// TODO
	}
}
