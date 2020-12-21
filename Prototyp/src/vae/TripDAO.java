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

public class TripDAO {
	public static Trip loadTripByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip getTripByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTripByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip getTripByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTripByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Trip) session.load(Trip.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip getTripByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Trip) session.get(Trip.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Trip) session.load(Trip.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip getTripByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Trip) session.get(Trip.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrip(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTrip(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrip(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTrip(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip[] listTripByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTripByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip[] listTripByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTripByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrip(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Trip as Trip");
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
	
	public static List queryTrip(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Trip as Trip");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Trip", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip[] listTripByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTrip(session, condition, orderBy);
			return (Trip[]) list.toArray(new Trip[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip[] listTripByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTrip(session, condition, orderBy, lockMode);
			return (Trip[]) list.toArray(new Trip[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Trip[] trips = listTripByQuery(session, condition, orderBy);
		if (trips != null && trips.length > 0)
			return trips[0];
		else
			return null;
	}
	
	public static Trip loadTripByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Trip[] trips = listTripByQuery(session, condition, orderBy, lockMode);
		if (trips != null && trips.length > 0)
			return trips[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTripByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTripByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTripByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTripByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTripByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Trip as Trip");
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
	
	public static java.util.Iterator iterateTripByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Trip as Trip");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Trip", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip createTrip() {
		return new Trip();
	}
	
	public static boolean save(Trip trip) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(trip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Trip trip) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(trip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Trip trip)throws PersistentException {
		try {
			if (trip.getTraveler() != null) {
				trip.getTraveler().trip.remove(trip);
			}
			
			TripItem[] lTripItems = trip.tripItem.toArray();
			for(int i = 0; i < lTripItems.length; i++) {
				lTripItems[i].tripPlanList.remove(trip);
			}
			return delete(trip);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Trip trip, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (trip.getTraveler() != null) {
				trip.getTraveler().trip.remove(trip);
			}
			
			TripItem[] lTripItems = trip.tripItem.toArray();
			for(int i = 0; i < lTripItems.length; i++) {
				lTripItems[i].tripPlanList.remove(trip);
			}
			try {
				session.delete(trip);
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
	
	public static boolean refresh(Trip trip) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(trip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Trip trip) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(trip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trip loadTripByCriteria(TripCriteria tripCriteria) {
		Trip[] trips = listTripByCriteria(tripCriteria);
		if(trips == null || trips.length == 0) {
			return null;
		}
		return trips[0];
	}
	
	public static Trip[] listTripByCriteria(TripCriteria tripCriteria) {
		return tripCriteria.listTrip();
	}
}
