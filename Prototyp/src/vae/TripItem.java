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
@Table(name="TripItem")
public class TripItem implements Serializable {
	public TripItem() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TRIPITEM_TRIPPLANLIST) {
			return ORM_tripPlanList;
		}
		else if (key == ORMConstants.KEY_TRIPITEM_ADMIN) {
			return ORM_admin;
		}
		else if (key == ORMConstants.KEY_TRIPITEM_TRIP_REVIEW) {
			return ORM_trip_review;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TRIPITEM_ANNOUNCEMENT) {
			this.announcement = (PrioritizedAnnouncement) owner;
		}
		
		else if (key == ORMConstants.KEY_TRIPITEM_CATEGORY) {
			this.category = (Category) owner;
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
	@GeneratedValue(generator="VAE_TRIPITEM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_TRIPITEM_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity= PrioritizedAnnouncement.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PrioritizedAnnouncementId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="prioritize"))	
	private PrioritizedAnnouncement announcement;
	
	@ManyToOne(targetEntity= Category.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoryId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="part_of"))	
	private Category category;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="Price", nullable=false)	
	private double price;
	
	@Column(name="`Date`", nullable=true)	
	private java.sql.Timestamp date;
	
	@Column(name="Coordinates", nullable=false, length=255)	
	private String coordinates;
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Type", nullable=true, length=255)	
	private String type;
	
	@ManyToMany(targetEntity= Trip.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Trip_TripItem", joinColumns={ @JoinColumn(name="TripItemId") }, inverseJoinColumns={ @JoinColumn(name="TripId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tripPlanList = new java.util.HashSet();
	
	@ManyToMany(targetEntity= Admin.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Admin_TripItem", joinColumns={ @JoinColumn(name="TripItemId") }, inverseJoinColumns={ @JoinColumn(name="AdminId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_admin = new java.util.HashSet();
	
	@OneToMany(mappedBy="tripItem", targetEntity= Review.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_trip_review = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setDate(java.sql.Timestamp value) {
		this.date = value;
	}
	
	public java.sql.Timestamp getDate() {
		return date;
	}
	
	public void setCoordinates(String value) {
		this.coordinates = value;
	}
	
	public String getCoordinates() {
		return coordinates;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	private void setORM_TripPlanList(java.util.Set value) {
		this.ORM_tripPlanList = value;
	}
	
	private java.util.Set getORM_TripPlanList() {
		return ORM_tripPlanList;
	}
	
	@Transient	
	public final TripSetCollection tripPlanList = new TripSetCollection(this, _ormAdapter, ORMConstants.KEY_TRIPITEM_TRIPPLANLIST, ORMConstants.KEY_TRIP_TRIPITEM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAnnouncement(PrioritizedAnnouncement value) {
		if (this.announcement != value) {
			PrioritizedAnnouncement lannouncement = this.announcement;
			this.announcement = value;
			if (value != null) {
				announcement.setTripItem(this);
			}
			if (lannouncement != null && lannouncement.getTripItem() == this) {
				lannouncement.setTripItem(null);
			}
		}
	}
	
	public PrioritizedAnnouncement getAnnouncement() {
		return announcement;
	}
	
	private void setORM_Admin(java.util.Set value) {
		this.ORM_admin = value;
	}
	
	private java.util.Set getORM_Admin() {
		return ORM_admin;
	}
	
	@Transient	
	public final AdminSetCollection admin = new AdminSetCollection(this, _ormAdapter, ORMConstants.KEY_TRIPITEM_ADMIN, ORMConstants.KEY_ADMIN_TRIPITEM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Trip_review(java.util.Set value) {
		this.ORM_trip_review = value;
	}
	
	private java.util.Set getORM_Trip_review() {
		return ORM_trip_review;
	}
	
	@Transient	
	public final ReviewSetCollection trip_review = new ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_TRIPITEM_TRIP_REVIEW, ORMConstants.KEY_REVIEW_TRIPITEM, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCategory(Category value) {
		if (category != null) {
			category.tripItems.remove(this);
		}
		if (value != null) {
			value.tripItems.add(this);
		}
	}
	
	public Category getCategory() {
		return category;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Category(Category value) {
		this.category = value;
	}
	
	private Category getORM_Category() {
		return category;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
