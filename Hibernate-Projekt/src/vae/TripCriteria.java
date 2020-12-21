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

public class TripCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression travelerId;
	public final AssociationExpression traveler;
	public final StringExpression name;
	public final TimestampExpression beginDate;
	public final TimestampExpression endDate;
	public final StringExpression destination;
	public final CollectionExpression tripItem;
	
	public TripCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		travelerId = new IntegerExpression("traveler.id", this);
		traveler = new AssociationExpression("traveler", this);
		name = new StringExpression("name", this);
		beginDate = new TimestampExpression("beginDate", this);
		endDate = new TimestampExpression("endDate", this);
		destination = new StringExpression("destination", this);
		tripItem = new CollectionExpression("ORM_tripItem", this);
	}
	
	public TripCriteria(PersistentSession session) {
		this(session.createCriteria(Trip.class));
	}
	
	public TripCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public TravelerCriteria createTravelerCriteria() {
		return new TravelerCriteria(createCriteria("traveler"));
	}
	
	public TripItemCriteria createTripItemCriteria() {
		return new TripItemCriteria(createCriteria("ORM_tripItem"));
	}
	
	public Trip uniqueTrip() {
		return (Trip) super.uniqueResult();
	}
	
	public Trip[] listTrip() {
		java.util.List list = super.list();
		return (Trip[]) list.toArray(new Trip[list.size()]);
	}
}

