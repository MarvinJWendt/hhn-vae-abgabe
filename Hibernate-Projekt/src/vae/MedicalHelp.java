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
@Table(name="MedicalHelp")
public class MedicalHelp implements Serializable {
	public MedicalHelp() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MEDICALHELP_PATIENT) {
			return ORM_patient;
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
	@GeneratedValue(generator="VAE_MEDICALHELP_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_MEDICALHELP_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="HospitalList", nullable=true, length=10)	
	private int hospitalList;
	
	@Column(name="ClinicList", nullable=true, length=10)	
	private int clinicList;
	
	@ManyToMany(targetEntity=vae.Traveler.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Traveler_MedicalHelp", joinColumns={ @JoinColumn(name="MedicalHelpId") }, inverseJoinColumns={ @JoinColumn(name="TravelerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_patient = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setHospitalList(int value) {
		this.hospitalList = value;
	}
	
	public int getHospitalList() {
		return hospitalList;
	}
	
	public void setClinicList(int value) {
		this.clinicList = value;
	}
	
	public int getClinicList() {
		return clinicList;
	}
	
	private void setORM_Patient(java.util.Set value) {
		this.ORM_patient = value;
	}
	
	private java.util.Set getORM_Patient() {
		return ORM_patient;
	}
	
	@Transient	
	public final vae.TravelerSetCollection patient = new vae.TravelerSetCollection(this, _ormAdapter, ORMConstants.KEY_MEDICALHELP_PATIENT, ORMConstants.KEY_TRAVELER_MEDICAL_PROVIDER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
