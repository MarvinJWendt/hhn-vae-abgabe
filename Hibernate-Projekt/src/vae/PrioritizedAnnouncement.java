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
@Table(name="PrioritizedAnnouncement")
public class PrioritizedAnnouncement implements Serializable {
	public PrioritizedAnnouncement() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRIORITIZEDANNOUNCEMENT_SELLER) {
			return ORM_seller;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRIORITIZEDANNOUNCEMENT_TRIPITEM) {
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
	@GeneratedValue(generator="VAE_PRIORITIZEDANNOUNCEMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_PRIORITIZEDANNOUNCEMENT_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Price", nullable=false)	
	private double price;
	
	@ManyToMany(targetEntity=vae.Admin.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Admin_PrioritizedAnnouncement", joinColumns={ @JoinColumn(name="PrioritizedAnnouncementId") }, inverseJoinColumns={ @JoinColumn(name="AdminId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seller = new java.util.HashSet();
	
	@OneToOne(mappedBy="announcement", targetEntity=vae.TripItem.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private vae.TripItem tripItem;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	private void setORM_Seller(java.util.Set value) {
		this.ORM_seller = value;
	}
	
	private java.util.Set getORM_Seller() {
		return ORM_seller;
	}
	
	@Transient	
	public final vae.AdminSetCollection seller = new vae.AdminSetCollection(this, _ormAdapter, ORMConstants.KEY_PRIORITIZEDANNOUNCEMENT_SELLER, ORMConstants.KEY_ADMIN_PRODUCT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTripItem(vae.TripItem value) {
		if (this.tripItem != value) {
			vae.TripItem ltripItem = this.tripItem;
			this.tripItem = value;
			if (value != null) {
				tripItem.setAnnouncement(this);
			}
			if (ltripItem != null && ltripItem.getAnnouncement() == this) {
				ltripItem.setAnnouncement(null);
			}
		}
	}
	
	public vae.TripItem getTripItem() {
		return tripItem;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
