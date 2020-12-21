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

public class PrioritizedAnnouncementCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final DoubleExpression price;
	public final CollectionExpression seller;
	public final IntegerExpression tripItemId;
	public final AssociationExpression tripItem;
	
	public PrioritizedAnnouncementCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		price = new DoubleExpression("price", this);
		seller = new CollectionExpression("ORM_seller", this);
		tripItemId = new IntegerExpression("tripItem.id", this);
		tripItem = new AssociationExpression("tripItem", this);
	}
	
	public PrioritizedAnnouncementCriteria(PersistentSession session) {
		this(session.createCriteria(PrioritizedAnnouncement.class));
	}
	
	public PrioritizedAnnouncementCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public AdminCriteria createSellerCriteria() {
		return new AdminCriteria(createCriteria("ORM_seller"));
	}
	
	public TripItemCriteria createTripItemCriteria() {
		return new TripItemCriteria(createCriteria("tripItem"));
	}
	
	public PrioritizedAnnouncement uniquePrioritizedAnnouncement() {
		return (PrioritizedAnnouncement) super.uniqueResult();
	}
	
	public PrioritizedAnnouncement[] listPrioritizedAnnouncement() {
		java.util.List list = super.list();
		return (PrioritizedAnnouncement[]) list.toArray(new PrioritizedAnnouncement[list.size()]);
	}
}

