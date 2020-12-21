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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TravelerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final StringExpression role;
	public final StringExpression eMail;
	public final IntegerExpression travel_serviceId;
	public final AssociationExpression travel_service;
	public final CollectionExpression trip;
	public final CollectionExpression review;
	public final CollectionExpression medical_provider;
	
	public TravelerDetachedCriteria() {
		super(Traveler.class, TravelerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		eMail = new StringExpression("eMail", this.getDetachedCriteria());
		travel_serviceId = new IntegerExpression("travel_service.id", this.getDetachedCriteria());
		travel_service = new AssociationExpression("travel_service", this.getDetachedCriteria());
		trip = new CollectionExpression("ORM_trip", this.getDetachedCriteria());
		review = new CollectionExpression("ORM_review", this.getDetachedCriteria());
		medical_provider = new CollectionExpression("ORM_medical_provider", this.getDetachedCriteria());
	}
	
	public TravelerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TravelerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		eMail = new StringExpression("eMail", this.getDetachedCriteria());
		travel_serviceId = new IntegerExpression("travel_service.id", this.getDetachedCriteria());
		travel_service = new AssociationExpression("travel_service", this.getDetachedCriteria());
		trip = new CollectionExpression("ORM_trip", this.getDetachedCriteria());
		review = new CollectionExpression("ORM_review", this.getDetachedCriteria());
		medical_provider = new CollectionExpression("ORM_medical_provider", this.getDetachedCriteria());
	}
	
	public InsuranceDetachedCriteria createTravel_serviceCriteria() {
		return new InsuranceDetachedCriteria(createCriteria("travel_service"));
	}
	
	public TripDetachedCriteria createTripCriteria() {
		return new TripDetachedCriteria(createCriteria("ORM_trip"));
	}
	
	public ReviewDetachedCriteria createReviewCriteria() {
		return new ReviewDetachedCriteria(createCriteria("ORM_review"));
	}
	
	public MedicalHelpDetachedCriteria createMedical_providerCriteria() {
		return new MedicalHelpDetachedCriteria(createCriteria("ORM_medical_provider"));
	}
	
	public Traveler uniqueTraveler(PersistentSession session) {
		return (Traveler) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Traveler[] listTraveler(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Traveler[]) list.toArray(new Traveler[list.size()]);
	}
}

