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

public class ReviewCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression tripItemId;
	public final AssociationExpression tripItem;
	public final IntegerExpression rating;
	public final StringExpression description;
	public final TimestampExpression createdAt;
	public final CollectionExpression evaluator;
	
	public ReviewCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		tripItemId = new IntegerExpression("tripItem.id", this);
		tripItem = new AssociationExpression("tripItem", this);
		rating = new IntegerExpression("rating", this);
		description = new StringExpression("description", this);
		createdAt = new TimestampExpression("createdAt", this);
		evaluator = new CollectionExpression("ORM_evaluator", this);
	}
	
	public ReviewCriteria(PersistentSession session) {
		this(session.createCriteria(Review.class));
	}
	
	public ReviewCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public TripItemCriteria createTripItemCriteria() {
		return new TripItemCriteria(createCriteria("tripItem"));
	}
	
	public TravelerCriteria createEvaluatorCriteria() {
		return new TravelerCriteria(createCriteria("ORM_evaluator"));
	}
	
	public Review uniqueReview() {
		return (Review) super.uniqueResult();
	}
	
	public Review[] listReview() {
		java.util.List list = super.list();
		return (Review[]) list.toArray(new Review[list.size()]);
	}
}

