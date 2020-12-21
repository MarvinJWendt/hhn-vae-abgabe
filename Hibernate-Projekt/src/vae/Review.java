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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Review")
public class Review implements Serializable {
	public Review() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_REVIEW_EVALUATOR) {
			return ORM_evaluator;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REVIEW_TRIPITEM) {
			this.tripItem = (vae.TripItem) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VAE_REVIEW_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_REVIEW_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=vae.TripItem.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TripItemId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="has"))	
	private vae.TripItem tripItem;
	
	@Column(name="Rating", nullable=false, length=10)	
	private int rating;
	
	@Column(name="Description", nullable=false, length=255)	
	private String description;
	
	@Column(name="CreatedAt", nullable=false)	
	private java.sql.Timestamp createdAt;
	
	@ManyToMany(targetEntity=vae.Traveler.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Traveler_Review", joinColumns={ @JoinColumn(name="ReviewId") }, inverseJoinColumns={ @JoinColumn(name="TravelerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_evaluator = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setRating(int value) {
		this.rating = value;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setCreatedAt(java.sql.Timestamp value) {
		this.createdAt = value;
	}
	
	public java.sql.Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setTripItem(vae.TripItem value) {
		if (tripItem != null) {
			tripItem.trip_review.remove(this);
		}
		if (value != null) {
			value.trip_review.add(this);
		}
	}
	
	public vae.TripItem getTripItem() {
		return tripItem;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TripItem(vae.TripItem value) {
		this.tripItem = value;
	}
	
	private vae.TripItem getORM_TripItem() {
		return tripItem;
	}
	
	private void setORM_Evaluator(java.util.Set value) {
		this.ORM_evaluator = value;
	}
	
	private java.util.Set getORM_Evaluator() {
		return ORM_evaluator;
	}
	
	@Transient	
	public final vae.TravelerSetCollection evaluator = new vae.TravelerSetCollection(this, _ormAdapter, ORMConstants.KEY_REVIEW_EVALUATOR, ORMConstants.KEY_TRAVELER_REVIEW, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void editReview() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void deleteReview() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void rateReview() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void reportReview() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
