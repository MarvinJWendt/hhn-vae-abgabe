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

public class InsuranceCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final CollectionExpression traveler;
	
	public InsuranceCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
		traveler = new CollectionExpression("ORM_traveler", this);
	}
	
	public InsuranceCriteria(PersistentSession session) {
		this(session.createCriteria(Insurance.class));
	}
	
	public InsuranceCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public TravelerCriteria createTravelerCriteria() {
		return new TravelerCriteria(createCriteria("ORM_traveler"));
	}
	
	public Insurance uniqueInsurance() {
		return (Insurance) super.uniqueResult();
	}
	
	public Insurance[] listInsurance() {
		java.util.List list = super.list();
		return (Insurance[]) list.toArray(new Insurance[list.size()]);
	}
}

