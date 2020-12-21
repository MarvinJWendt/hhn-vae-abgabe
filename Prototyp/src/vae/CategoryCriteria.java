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

public class CategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final CollectionExpression tripItems;
	
	public CategoryCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
		tripItems = new CollectionExpression("ORM_tripItems", this);
	}
	
	public CategoryCriteria(PersistentSession session) {
		this(session.createCriteria(Category.class));
	}
	
	public CategoryCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public TripItemCriteria createTripItemsCriteria() {
		return new TripItemCriteria(createCriteria("ORM_tripItems"));
	}
	
	public Category uniqueCategory() {
		return (Category) super.uniqueResult();
	}
	
	public Category[] listCategory() {
		java.util.List list = super.list();
		return (Category[]) list.toArray(new Category[list.size()]);
	}
}

