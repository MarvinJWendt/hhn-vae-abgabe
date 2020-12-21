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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class MedicalHelpDAO {
	public static MedicalHelp loadMedicalHelpByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadMedicalHelpByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp getMedicalHelpByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getMedicalHelpByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadMedicalHelpByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp getMedicalHelpByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getMedicalHelpByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (MedicalHelp) session.load(MedicalHelp.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp getMedicalHelpByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (MedicalHelp) session.get(MedicalHelp.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MedicalHelp) session.load(MedicalHelp.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp getMedicalHelpByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MedicalHelp) session.get(MedicalHelp.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedicalHelp(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryMedicalHelp(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedicalHelp(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryMedicalHelp(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp[] listMedicalHelpByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listMedicalHelpByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp[] listMedicalHelpByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listMedicalHelpByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedicalHelp(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.MedicalHelp as MedicalHelp");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedicalHelp(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.MedicalHelp as MedicalHelp");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MedicalHelp", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp[] listMedicalHelpByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedicalHelp(session, condition, orderBy);
			return (MedicalHelp[]) list.toArray(new MedicalHelp[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp[] listMedicalHelpByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedicalHelp(session, condition, orderBy, lockMode);
			return (MedicalHelp[]) list.toArray(new MedicalHelp[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadMedicalHelpByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadMedicalHelpByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MedicalHelp[] medicalHelps = listMedicalHelpByQuery(session, condition, orderBy);
		if (medicalHelps != null && medicalHelps.length > 0)
			return medicalHelps[0];
		else
			return null;
	}
	
	public static MedicalHelp loadMedicalHelpByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MedicalHelp[] medicalHelps = listMedicalHelpByQuery(session, condition, orderBy, lockMode);
		if (medicalHelps != null && medicalHelps.length > 0)
			return medicalHelps[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicalHelpByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateMedicalHelpByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicalHelpByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateMedicalHelpByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicalHelpByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.MedicalHelp as MedicalHelp");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicalHelpByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.MedicalHelp as MedicalHelp");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MedicalHelp", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp createMedicalHelp() {
		return new MedicalHelp();
	}
	
	public static boolean save(MedicalHelp medicalHelp) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(medicalHelp);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(MedicalHelp medicalHelp) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(medicalHelp);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MedicalHelp medicalHelp)throws PersistentException {
		try {
			Traveler[] lPatients = medicalHelp.patient.toArray();
			for(int i = 0; i < lPatients.length; i++) {
				lPatients[i].medical_provider.remove(medicalHelp);
			}
			return delete(medicalHelp);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MedicalHelp medicalHelp, org.orm.PersistentSession session)throws PersistentException {
		try {
			Traveler[] lPatients = medicalHelp.patient.toArray();
			for(int i = 0; i < lPatients.length; i++) {
				lPatients[i].medical_provider.remove(medicalHelp);
			}
			try {
				session.delete(medicalHelp);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(MedicalHelp medicalHelp) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(medicalHelp);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(MedicalHelp medicalHelp) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(medicalHelp);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MedicalHelp loadMedicalHelpByCriteria(MedicalHelpCriteria medicalHelpCriteria) {
		MedicalHelp[] medicalHelps = listMedicalHelpByCriteria(medicalHelpCriteria);
		if(medicalHelps == null || medicalHelps.length == 0) {
			return null;
		}
		return medicalHelps[0];
	}
	
	public static MedicalHelp[] listMedicalHelpByCriteria(MedicalHelpCriteria medicalHelpCriteria) {
		return medicalHelpCriteria.listMedicalHelp();
	}
}
