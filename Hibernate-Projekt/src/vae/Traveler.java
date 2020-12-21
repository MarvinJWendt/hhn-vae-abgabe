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
@Table(name="Traveler")
public class Traveler extends vae.User implements Serializable {
	public Traveler() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TRAVELER_TRIP) {
			return ORM_trip;
		}
		else if (key == ORMConstants.KEY_TRAVELER_REVIEW) {
			return ORM_review;
		}
		else if (key == ORMConstants.KEY_TRAVELER_MEDICAL_PROVIDER) {
			return ORM_medical_provider;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TRAVELER_TRAVEL_SERVICE) {
			this.travel_service = (vae.Insurance) owner;
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
	
	@ManyToOne(targetEntity=vae.Insurance.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="InsuranceId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="buy"))	
	private vae.Insurance travel_service;
	
	@OneToMany(mappedBy="traveler", targetEntity=vae.Trip.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_trip = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_evaluator", targetEntity=vae.Review.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_review = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_patient", targetEntity=vae.MedicalHelp.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_medical_provider = new java.util.HashSet();
	
	private void setORM_Trip(java.util.Set value) {
		this.ORM_trip = value;
	}
	
	private java.util.Set getORM_Trip() {
		return ORM_trip;
	}
	
	@Transient	
	public final vae.TripSetCollection trip = new vae.TripSetCollection(this, _ormAdapter, ORMConstants.KEY_TRAVELER_TRIP, ORMConstants.KEY_TRIP_TRAVELER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Review(java.util.Set value) {
		this.ORM_review = value;
	}
	
	private java.util.Set getORM_Review() {
		return ORM_review;
	}
	
	@Transient	
	public final vae.ReviewSetCollection review = new vae.ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_TRAVELER_REVIEW, ORMConstants.KEY_REVIEW_EVALUATOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Medical_provider(java.util.Set value) {
		this.ORM_medical_provider = value;
	}
	
	private java.util.Set getORM_Medical_provider() {
		return ORM_medical_provider;
	}
	
	@Transient	
	public final vae.MedicalHelpSetCollection medical_provider = new vae.MedicalHelpSetCollection(this, _ormAdapter, ORMConstants.KEY_TRAVELER_MEDICAL_PROVIDER, ORMConstants.KEY_MEDICALHELP_PATIENT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTravel_service(vae.Insurance value) {
		if (travel_service != null) {
			travel_service.traveler.remove(this);
		}
		if (value != null) {
			value.traveler.add(this);
		}
	}
	
	public vae.Insurance getTravel_service() {
		return travel_service;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Travel_service(vae.Insurance value) {
		this.travel_service = value;
	}
	
	private vae.Insurance getORM_Travel_service() {
		return travel_service;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
