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
@Table(name="Trip")
public class Trip implements Serializable {
	public Trip() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TRIP_TRIPITEM) {
			return ORM_tripItem;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TRIP_TRAVELER) {
			this.traveler = (Traveler) owner;
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
	@GeneratedValue(generator="VAE_TRIP_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_TRIP_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity= Traveler.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TravelerId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="plans"))	
	private Traveler traveler;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="BeginDate", nullable=true)	
	private java.sql.Timestamp beginDate;
	
	@Column(name="EndDate", nullable=true)	
	private java.sql.Timestamp endDate;
	
	@Column(name="Destination", nullable=true, length=255)	
	private String destination;
	
	@ManyToMany(mappedBy="ORM_tripPlanList", targetEntity= TripItem.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tripItem = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBeginDate(java.sql.Timestamp value) {
		this.beginDate = value;
	}
	
	public java.sql.Timestamp getBeginDate() {
		return beginDate;
	}
	
	public void setEndDate(java.sql.Timestamp value) {
		this.endDate = value;
	}
	
	public java.sql.Timestamp getEndDate() {
		return endDate;
	}
	
	public void setDestination(String value) {
		this.destination = value;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setTraveler(Traveler value) {
		if (traveler != null) {
			traveler.trip.remove(this);
		}
		if (value != null) {
			value.trip.add(this);
		}
	}
	
	public Traveler getTraveler() {
		return traveler;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Traveler(Traveler value) {
		this.traveler = value;
	}
	
	private Traveler getORM_Traveler() {
		return traveler;
	}
	
	private void setORM_TripItem(java.util.Set value) {
		this.ORM_tripItem = value;
	}
	
	private java.util.Set getORM_TripItem() {
		return ORM_tripItem;
	}
	
	@Transient	
	public final TripItemSetCollection tripItem = new TripItemSetCollection(this, _ormAdapter, ORMConstants.KEY_TRIP_TRIPITEM, ORMConstants.KEY_TRIPITEM_TRIPPLANLIST, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void add(TripItem tripItem) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void remove(int itemId) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
