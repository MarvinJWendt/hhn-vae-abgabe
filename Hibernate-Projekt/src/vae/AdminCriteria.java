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

public class AdminCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final StringExpression role;
	public final StringExpression eMail;
	public final CollectionExpression product;
	public final CollectionExpression tripItem;
	
	public AdminCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
		role = new StringExpression("role", this);
		eMail = new StringExpression("eMail", this);
		product = new CollectionExpression("ORM_product", this);
		tripItem = new CollectionExpression("ORM_tripItem", this);
	}
	
	public AdminCriteria(PersistentSession session) {
		this(session.createCriteria(Admin.class));
	}
	
	public AdminCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public PrioritizedAnnouncementCriteria createProductCriteria() {
		return new PrioritizedAnnouncementCriteria(createCriteria("ORM_product"));
	}
	
	public TripItemCriteria createTripItemCriteria() {
		return new TripItemCriteria(createCriteria("ORM_tripItem"));
	}
	
	public Admin uniqueAdmin() {
		return (Admin) super.uniqueResult();
	}
	
	public Admin[] listAdmin() {
		java.util.List list = super.list();
		return (Admin[]) list.toArray(new Admin[list.size()]);
	}
}

