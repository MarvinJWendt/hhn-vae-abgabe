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

public class TravelerDAO {
	public static Traveler loadTravelerByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTravelerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler getTravelerByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTravelerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTravelerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler getTravelerByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTravelerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Traveler) session.load(Traveler.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler getTravelerByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Traveler) session.get(Traveler.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Traveler) session.load(Traveler.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler getTravelerByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Traveler) session.get(Traveler.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraveler(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTraveler(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraveler(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTraveler(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler[] listTravelerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTravelerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler[] listTravelerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTravelerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTraveler(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Traveler as Traveler");
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
	
	public static List queryTraveler(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Traveler as Traveler");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Traveler", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler[] listTravelerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTraveler(session, condition, orderBy);
			return (Traveler[]) list.toArray(new Traveler[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler[] listTravelerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTraveler(session, condition, orderBy, lockMode);
			return (Traveler[]) list.toArray(new Traveler[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTravelerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTravelerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Traveler[] travelers = listTravelerByQuery(session, condition, orderBy);
		if (travelers != null && travelers.length > 0)
			return travelers[0];
		else
			return null;
	}
	
	public static Traveler loadTravelerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Traveler[] travelers = listTravelerByQuery(session, condition, orderBy, lockMode);
		if (travelers != null && travelers.length > 0)
			return travelers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTravelerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTravelerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTravelerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTravelerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTravelerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Traveler as Traveler");
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
	
	public static java.util.Iterator iterateTravelerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Traveler as Traveler");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Traveler", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler createTraveler() {
		return new Traveler();
	}
	
	public static boolean save(Traveler traveler) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(traveler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Traveler traveler) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(traveler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Traveler traveler)throws PersistentException {
		try {
			if (traveler.getTravel_service() != null) {
				traveler.getTravel_service().traveler.remove(traveler);
			}
			
			Trip[] lTrips = traveler.trip.toArray();
			for(int i = 0; i < lTrips.length; i++) {
				lTrips[i].setTraveler(null);
			}
			Review[] lReviews = traveler.review.toArray();
			for(int i = 0; i < lReviews.length; i++) {
				lReviews[i].evaluator.remove(traveler);
			}
			MedicalHelp[] lMedical_providers = traveler.medical_provider.toArray();
			for(int i = 0; i < lMedical_providers.length; i++) {
				lMedical_providers[i].patient.remove(traveler);
			}
			return delete(traveler);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Traveler traveler, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (traveler.getTravel_service() != null) {
				traveler.getTravel_service().traveler.remove(traveler);
			}
			
			Trip[] lTrips = traveler.trip.toArray();
			for(int i = 0; i < lTrips.length; i++) {
				lTrips[i].setTraveler(null);
			}
			Review[] lReviews = traveler.review.toArray();
			for(int i = 0; i < lReviews.length; i++) {
				lReviews[i].evaluator.remove(traveler);
			}
			MedicalHelp[] lMedical_providers = traveler.medical_provider.toArray();
			for(int i = 0; i < lMedical_providers.length; i++) {
				lMedical_providers[i].patient.remove(traveler);
			}
			try {
				session.delete(traveler);
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
	
	public static boolean refresh(Traveler traveler) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(traveler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Traveler traveler) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(traveler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Traveler loadTravelerByCriteria(TravelerCriteria travelerCriteria) {
		Traveler[] travelers = listTravelerByCriteria(travelerCriteria);
		if(travelers == null || travelers.length == 0) {
			return null;
		}
		return travelers[0];
	}
	
	public static Traveler[] listTravelerByCriteria(TravelerCriteria travelerCriteria) {
		return travelerCriteria.listTraveler();
	}
}
