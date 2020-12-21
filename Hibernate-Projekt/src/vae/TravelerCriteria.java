/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Marvin Wendt(Hochschule Heilbronn)
 * License Type: Academic
 */
package vae;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TravelerCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final StringExpression role;
	public final StringExpression eMail;
	public final IntegerExpression travel_serviceId;
	public final AssociationExpression travel_service;
	public final CollectionExpression trip;
	public final CollectionExpression review;
	public final CollectionExpression medical_provider;
	
	public TravelerCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
		role = new StringExpression("role", this);
		eMail = new StringExpression("eMail", this);
		travel_serviceId = new IntegerExpression("travel_service.id", this);
		travel_service = new AssociationExpression("travel_service", this);
		trip = new CollectionExpression("ORM_trip", this);
		review = new CollectionExpression("ORM_review", this);
		medical_provider = new CollectionExpression("ORM_medical_provider", this);
	}
	
	public TravelerCriteria(PersistentSession session) {
		this(session.createCriteria(Traveler.class));
	}
	
	public TravelerCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public InsuranceCriteria createTravel_serviceCriteria() {
		return new InsuranceCriteria(createCriteria("travel_service"));
	}
	
	public TripCriteria createTripCriteria() {
		return new TripCriteria(createCriteria("ORM_trip"));
	}
	
	public ReviewCriteria createReviewCriteria() {
		return new ReviewCriteria(createCriteria("ORM_review"));
	}
	
	public MedicalHelpCriteria createMedical_providerCriteria() {
		return new MedicalHelpCriteria(createCriteria("ORM_medical_provider"));
	}
	
	public Traveler uniqueTraveler() {
		return (Traveler) super.uniqueResult();
	}
	
	public Traveler[] listTraveler() {
		java.util.List list = super.list();
		return (Traveler[]) list.toArray(new Traveler[list.size()]);
	}
}

