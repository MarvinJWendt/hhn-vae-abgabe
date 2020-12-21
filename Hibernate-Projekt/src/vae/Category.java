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
@Table(name="Category")
public class Category implements Serializable {
	public Category() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORY_TRIPITEMS) {
			return ORM_tripItems;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VAE_CATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_CATEGORY_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@OneToMany(mappedBy="category", targetEntity=vae.TripItem.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tripItems = new java.util.HashSet();
	
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
	
	private void setORM_TripItems(java.util.Set value) {
		this.ORM_tripItems = value;
	}
	
	private java.util.Set getORM_TripItems() {
		return ORM_tripItems;
	}
	
	@Transient	
	public final vae.TripItemSetCollection tripItems = new vae.TripItemSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORY_TRIPITEMS, ORMConstants.KEY_TRIPITEM_CATEGORY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
