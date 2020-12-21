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

public class PrioritizedAnnouncementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DoubleExpression price;
	public final CollectionExpression seller;
	public final IntegerExpression tripItemId;
	public final AssociationExpression tripItem;
	
	public PrioritizedAnnouncementDetachedCriteria() {
		super(PrioritizedAnnouncement.class, PrioritizedAnnouncementCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		seller = new CollectionExpression("ORM_seller", this.getDetachedCriteria());
		tripItemId = new IntegerExpression("tripItem.id", this.getDetachedCriteria());
		tripItem = new AssociationExpression("tripItem", this.getDetachedCriteria());
	}
	
	public PrioritizedAnnouncementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PrioritizedAnnouncementCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		seller = new CollectionExpression("ORM_seller", this.getDetachedCriteria());
		tripItemId = new IntegerExpression("tripItem.id", this.getDetachedCriteria());
		tripItem = new AssociationExpression("tripItem", this.getDetachedCriteria());
	}
	
	public AdminDetachedCriteria createSellerCriteria() {
		return new AdminDetachedCriteria(createCriteria("ORM_seller"));
	}
	
	public TripItemDetachedCriteria createTripItemCriteria() {
		return new TripItemDetachedCriteria(createCriteria("tripItem"));
	}
	
	public PrioritizedAnnouncement uniquePrioritizedAnnouncement(PersistentSession session) {
		return (PrioritizedAnnouncement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PrioritizedAnnouncement[] listPrioritizedAnnouncement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PrioritizedAnnouncement[]) list.toArray(new PrioritizedAnnouncement[list.size()]);
	}
}

