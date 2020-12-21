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

public class TripItemCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression announcementId;
	public final AssociationExpression announcement;
	public final IntegerExpression categoryId;
	public final AssociationExpression category;
	public final StringExpression description;
	public final DoubleExpression price;
	public final TimestampExpression date;
	public final StringExpression coordinates;
	public final StringExpression title;
	public final StringExpression type;
	public final CollectionExpression tripPlanList;
	public final CollectionExpression admin;
	public final CollectionExpression trip_review;
	
	public TripItemCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		announcementId = new IntegerExpression("announcement.id", this);
		announcement = new AssociationExpression("announcement", this);
		categoryId = new IntegerExpression("category.id", this);
		category = new AssociationExpression("category", this);
		description = new StringExpression("description", this);
		price = new DoubleExpression("price", this);
		date = new TimestampExpression("date", this);
		coordinates = new StringExpression("coordinates", this);
		title = new StringExpression("title", this);
		type = new StringExpression("type", this);
		tripPlanList = new CollectionExpression("ORM_tripPlanList", this);
		admin = new CollectionExpression("ORM_admin", this);
		trip_review = new CollectionExpression("ORM_trip_review", this);
	}
	
	public TripItemCriteria(PersistentSession session) {
		this(session.createCriteria(TripItem.class));
	}
	
	public TripItemCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public PrioritizedAnnouncementCriteria createAnnouncementCriteria() {
		return new PrioritizedAnnouncementCriteria(createCriteria("announcement"));
	}
	
	public CategoryCriteria createCategoryCriteria() {
		return new CategoryCriteria(createCriteria("category"));
	}
	
	public TripCriteria createTripPlanListCriteria() {
		return new TripCriteria(createCriteria("ORM_tripPlanList"));
	}
	
	public AdminCriteria createAdminCriteria() {
		return new AdminCriteria(createCriteria("ORM_admin"));
	}
	
	public ReviewCriteria createTrip_reviewCriteria() {
		return new ReviewCriteria(createCriteria("ORM_trip_review"));
	}
	
	public TripItem uniqueTripItem() {
		return (TripItem) super.uniqueResult();
	}
	
	public TripItem[] listTripItem() {
		java.util.List list = super.list();
		return (TripItem[]) list.toArray(new TripItem[list.size()]);
	}
}

