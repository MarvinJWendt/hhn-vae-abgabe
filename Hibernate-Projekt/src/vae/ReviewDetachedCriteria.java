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

public class ReviewDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression tripItemId;
	public final AssociationExpression tripItem;
	public final IntegerExpression rating;
	public final StringExpression description;
	public final TimestampExpression createdAt;
	public final CollectionExpression evaluator;
	
	public ReviewDetachedCriteria() {
		super(vae.Review.class, vae.ReviewCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tripItemId = new IntegerExpression("tripItem.id", this.getDetachedCriteria());
		tripItem = new AssociationExpression("tripItem", this.getDetachedCriteria());
		rating = new IntegerExpression("rating", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		createdAt = new TimestampExpression("createdAt", this.getDetachedCriteria());
		evaluator = new CollectionExpression("ORM_evaluator", this.getDetachedCriteria());
	}
	
	public ReviewDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, vae.ReviewCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tripItemId = new IntegerExpression("tripItem.id", this.getDetachedCriteria());
		tripItem = new AssociationExpression("tripItem", this.getDetachedCriteria());
		rating = new IntegerExpression("rating", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		createdAt = new TimestampExpression("createdAt", this.getDetachedCriteria());
		evaluator = new CollectionExpression("ORM_evaluator", this.getDetachedCriteria());
	}
	
	public TripItemDetachedCriteria createTripItemCriteria() {
		return new TripItemDetachedCriteria(createCriteria("tripItem"));
	}
	
	public TravelerDetachedCriteria createEvaluatorCriteria() {
		return new TravelerDetachedCriteria(createCriteria("ORM_evaluator"));
	}
	
	public Review uniqueReview(PersistentSession session) {
		return (Review) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Review[] listReview(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Review[]) list.toArray(new Review[list.size()]);
	}
}

