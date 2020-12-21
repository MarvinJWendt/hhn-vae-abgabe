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
@MappedSuperclass
public class User implements Serializable {
	public User() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VAE_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VAE_USER_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Role", nullable=true, length=255)	
	private String role;
	
	@Column(name="EMail", nullable=true, length=255)	
	private String eMail;
	
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
	
	public void setRole(String value) {
		this.role = value;
	}
	
	public String getRole() {
		return role;
	}
	
	public void seteMail(String value) {
		this.eMail = value;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
