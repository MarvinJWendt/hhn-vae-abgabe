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
@Table(name="Admin")
public class Admin extends User implements Serializable {
	public Admin() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMIN_PRODUCT) {
			return ORM_product;
		}
		else if (key == ORMConstants.KEY_ADMIN_TRIPITEM) {
			return ORM_tripItem;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(mappedBy="ORM_seller", targetEntity= PrioritizedAnnouncement.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_admin", targetEntity= TripItem.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tripItem = new java.util.HashSet();
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}
	
	@Transient	
	public final PrioritizedAnnouncementSetCollection product = new PrioritizedAnnouncementSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMIN_PRODUCT, ORMConstants.KEY_PRIORITIZEDANNOUNCEMENT_SELLER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_TripItem(java.util.Set value) {
		this.ORM_tripItem = value;
	}
	
	private java.util.Set getORM_TripItem() {
		return ORM_tripItem;
	}
	
	@Transient	
	public final TripItemSetCollection tripItem = new TripItemSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMIN_TRIPITEM, ORMConstants.KEY_TRIPITEM_ADMIN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
