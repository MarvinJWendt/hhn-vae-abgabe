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

public class TripDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression travelerId;
	public final AssociationExpression traveler;
	public final StringExpression name;
	public final TimestampExpression beginDate;
	public final TimestampExpression endDate;
	public final StringExpression destination;
	public final CollectionExpression tripItem;
	
	public TripDetachedCriteria() {
		super(Trip.class, TripCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		travelerId = new IntegerExpression("traveler.id", this.getDetachedCriteria());
		traveler = new AssociationExpression("traveler", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		beginDate = new TimestampExpression("beginDate", this.getDetachedCriteria());
		endDate = new TimestampExpression("endDate", this.getDetachedCriteria());
		destination = new StringExpression("destination", this.getDetachedCriteria());
		tripItem = new CollectionExpression("ORM_tripItem", this.getDetachedCriteria());
	}
	
	public TripDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TripCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		travelerId = new IntegerExpression("traveler.id", this.getDetachedCriteria());
		traveler = new AssociationExpression("traveler", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		beginDate = new TimestampExpression("beginDate", this.getDetachedCriteria());
		endDate = new TimestampExpression("endDate", this.getDetachedCriteria());
		destination = new StringExpression("destination", this.getDetachedCriteria());
		tripItem = new CollectionExpression("ORM_tripItem", this.getDetachedCriteria());
	}
	
	public TravelerDetachedCriteria createTravelerCriteria() {
		return new TravelerDetachedCriteria(createCriteria("traveler"));
	}
	
	public TripItemDetachedCriteria createTripItemCriteria() {
		return new TripItemDetachedCriteria(createCriteria("ORM_tripItem"));
	}
	
	public Trip uniqueTrip(PersistentSession session) {
		return (Trip) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Trip[] listTrip(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Trip[]) list.toArray(new Trip[list.size()]);
	}
}

