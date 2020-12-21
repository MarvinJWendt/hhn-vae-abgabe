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

public class CategoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final CollectionExpression tripItems;
	
	public CategoryDetachedCriteria() {
		super(Category.class, CategoryCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		tripItems = new CollectionExpression("ORM_tripItems", this.getDetachedCriteria());
	}
	
	public CategoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CategoryCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		tripItems = new CollectionExpression("ORM_tripItems", this.getDetachedCriteria());
	}
	
	public TripItemDetachedCriteria createTripItemsCriteria() {
		return new TripItemDetachedCriteria(createCriteria("ORM_tripItems"));
	}
	
	public Category uniqueCategory(PersistentSession session) {
		return (Category) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Category[] listCategory(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Category[]) list.toArray(new Category[list.size()]);
	}
}

