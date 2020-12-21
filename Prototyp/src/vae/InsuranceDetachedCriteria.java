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

public class InsuranceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final CollectionExpression traveler;
	
	public InsuranceDetachedCriteria() {
		super(Insurance.class, InsuranceCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		traveler = new CollectionExpression("ORM_traveler", this.getDetachedCriteria());
	}
	
	public InsuranceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, InsuranceCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		traveler = new CollectionExpression("ORM_traveler", this.getDetachedCriteria());
	}
	
	public TravelerDetachedCriteria createTravelerCriteria() {
		return new TravelerDetachedCriteria(createCriteria("ORM_traveler"));
	}
	
	public Insurance uniqueInsurance(PersistentSession session) {
		return (Insurance) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Insurance[] listInsurance(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Insurance[]) list.toArray(new Insurance[list.size()]);
	}
}

