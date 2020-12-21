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

public class TripItemDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TripItemDetachedCriteria() {
		super(vae.TripItem.class, vae.TripItemCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		announcementId = new IntegerExpression("announcement.id", this.getDetachedCriteria());
		announcement = new AssociationExpression("announcement", this.getDetachedCriteria());
		categoryId = new IntegerExpression("category.id", this.getDetachedCriteria());
		category = new AssociationExpression("category", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		date = new TimestampExpression("date", this.getDetachedCriteria());
		coordinates = new StringExpression("coordinates", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		tripPlanList = new CollectionExpression("ORM_tripPlanList", this.getDetachedCriteria());
		admin = new CollectionExpression("ORM_admin", this.getDetachedCriteria());
		trip_review = new CollectionExpression("ORM_trip_review", this.getDetachedCriteria());
	}
	
	public TripItemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, vae.TripItemCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		announcementId = new IntegerExpression("announcement.id", this.getDetachedCriteria());
		announcement = new AssociationExpression("announcement", this.getDetachedCriteria());
		categoryId = new IntegerExpression("category.id", this.getDetachedCriteria());
		category = new AssociationExpression("category", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		date = new TimestampExpression("date", this.getDetachedCriteria());
		coordinates = new StringExpression("coordinates", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		tripPlanList = new CollectionExpression("ORM_tripPlanList", this.getDetachedCriteria());
		admin = new CollectionExpression("ORM_admin", this.getDetachedCriteria());
		trip_review = new CollectionExpression("ORM_trip_review", this.getDetachedCriteria());
	}
	
	public PrioritizedAnnouncementDetachedCriteria createAnnouncementCriteria() {
		return new PrioritizedAnnouncementDetachedCriteria(createCriteria("announcement"));
	}
	
	public CategoryDetachedCriteria createCategoryCriteria() {
		return new CategoryDetachedCriteria(createCriteria("category"));
	}
	
	public TripDetachedCriteria createTripPlanListCriteria() {
		return new TripDetachedCriteria(createCriteria("ORM_tripPlanList"));
	}
	
	public AdminDetachedCriteria createAdminCriteria() {
		return new AdminDetachedCriteria(createCriteria("ORM_admin"));
	}
	
	public ReviewDetachedCriteria createTrip_reviewCriteria() {
		return new ReviewDetachedCriteria(createCriteria("ORM_trip_review"));
	}
	
	public TripItem uniqueTripItem(PersistentSession session) {
		return (TripItem) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TripItem[] listTripItem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TripItem[]) list.toArray(new TripItem[list.size()]);
	}
}

