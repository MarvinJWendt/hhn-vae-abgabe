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

public class MedicalHelpDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression hospitalList;
	public final IntegerExpression clinicList;
	public final CollectionExpression patient;
	
	public MedicalHelpDetachedCriteria() {
		super(vae.MedicalHelp.class, vae.MedicalHelpCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		hospitalList = new IntegerExpression("hospitalList", this.getDetachedCriteria());
		clinicList = new IntegerExpression("clinicList", this.getDetachedCriteria());
		patient = new CollectionExpression("ORM_patient", this.getDetachedCriteria());
	}
	
	public MedicalHelpDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, vae.MedicalHelpCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		hospitalList = new IntegerExpression("hospitalList", this.getDetachedCriteria());
		clinicList = new IntegerExpression("clinicList", this.getDetachedCriteria());
		patient = new CollectionExpression("ORM_patient", this.getDetachedCriteria());
	}
	
	public TravelerDetachedCriteria createPatientCriteria() {
		return new TravelerDetachedCriteria(createCriteria("ORM_patient"));
	}
	
	public MedicalHelp uniqueMedicalHelp(PersistentSession session) {
		return (MedicalHelp) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MedicalHelp[] listMedicalHelp(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MedicalHelp[]) list.toArray(new MedicalHelp[list.size()]);
	}
}

