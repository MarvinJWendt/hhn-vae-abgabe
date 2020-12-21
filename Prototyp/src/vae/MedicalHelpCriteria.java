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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MedicalHelpCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression hospitalList;
	public final IntegerExpression clinicList;
	public final CollectionExpression patient;
	
	public MedicalHelpCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		hospitalList = new IntegerExpression("hospitalList", this);
		clinicList = new IntegerExpression("clinicList", this);
		patient = new CollectionExpression("ORM_patient", this);
	}
	
	public MedicalHelpCriteria(PersistentSession session) {
		this(session.createCriteria(MedicalHelp.class));
	}
	
	public MedicalHelpCriteria() throws PersistentException {
		this(VAEPersistentManager.instance().getSession());
	}
	
	public TravelerCriteria createPatientCriteria() {
		return new TravelerCriteria(createCriteria("ORM_patient"));
	}
	
	public MedicalHelp uniqueMedicalHelp() {
		return (MedicalHelp) super.uniqueResult();
	}
	
	public MedicalHelp[] listMedicalHelp() {
		java.util.List list = super.list();
		return (MedicalHelp[]) list.toArray(new MedicalHelp[list.size()]);
	}
}

