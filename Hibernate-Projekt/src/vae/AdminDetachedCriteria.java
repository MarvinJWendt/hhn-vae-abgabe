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

public class AdminDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final StringExpression role;
	public final StringExpression eMail;
	public final CollectionExpression product;
	public final CollectionExpression tripItem;
	
	public AdminDetachedCriteria() {
		super(vae.Admin.class, vae.AdminCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		eMail = new StringExpression("eMail", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_product", this.getDetachedCriteria());
		tripItem = new CollectionExpression("ORM_tripItem", this.getDetachedCriteria());
	}
	
	public AdminDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, vae.AdminCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		eMail = new StringExpression("eMail", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_product", this.getDetachedCriteria());
		tripItem = new CollectionExpression("ORM_tripItem", this.getDetachedCriteria());
	}
	
	public PrioritizedAnnouncementDetachedCriteria createProductCriteria() {
		return new PrioritizedAnnouncementDetachedCriteria(createCriteria("ORM_product"));
	}
	
	public TripItemDetachedCriteria createTripItemCriteria() {
		return new TripItemDetachedCriteria(createCriteria("ORM_tripItem"));
	}
	
	public Admin uniqueAdmin(PersistentSession session) {
		return (Admin) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Admin[] listAdmin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Admin[]) list.toArray(new Admin[list.size()]);
	}
}

