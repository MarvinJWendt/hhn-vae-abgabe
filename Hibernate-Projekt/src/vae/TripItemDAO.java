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

public class TripItemDAO {
	public static TripItem loadTripItemByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripItemByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem getTripItemByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTripItemByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripItemByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem getTripItemByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getTripItemByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (TripItem) session.load(vae.TripItem.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem getTripItemByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (TripItem) session.get(vae.TripItem.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TripItem) session.load(vae.TripItem.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem getTripItemByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TripItem) session.get(vae.TripItem.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTripItem(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTripItem(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTripItem(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryTripItem(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem[] listTripItemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTripItemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem[] listTripItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listTripItemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTripItem(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.TripItem as TripItem");
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
	
	public static List queryTripItem(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.TripItem as TripItem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TripItem", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem[] listTripItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTripItem(session, condition, orderBy);
			return (TripItem[]) list.toArray(new TripItem[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem[] listTripItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTripItem(session, condition, orderBy, lockMode);
			return (TripItem[]) list.toArray(new TripItem[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripItemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadTripItemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TripItem[] tripItems = listTripItemByQuery(session, condition, orderBy);
		if (tripItems != null && tripItems.length > 0)
			return tripItems[0];
		else
			return null;
	}
	
	public static TripItem loadTripItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TripItem[] tripItems = listTripItemByQuery(session, condition, orderBy, lockMode);
		if (tripItems != null && tripItems.length > 0)
			return tripItems[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTripItemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTripItemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTripItemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateTripItemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTripItemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.TripItem as TripItem");
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
	
	public static java.util.Iterator iterateTripItemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.TripItem as TripItem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TripItem", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem createTripItem() {
		return new vae.TripItem();
	}
	
	public static boolean save(vae.TripItem tripItem) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(tripItem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(vae.TripItem tripItem) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(tripItem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(vae.TripItem tripItem)throws PersistentException {
		try {
			if (tripItem.getAnnouncement() != null) {
				tripItem.getAnnouncement().setTripItem(null);
			}
			
			if (tripItem.getCategory() != null) {
				tripItem.getCategory().tripItems.remove(tripItem);
			}
			
			vae.Trip[] lTripPlanLists = tripItem.tripPlanList.toArray();
			for(int i = 0; i < lTripPlanLists.length; i++) {
				lTripPlanLists[i].tripItem.remove(tripItem);
			}
			vae.Admin[] lAdmins = tripItem.admin.toArray();
			for(int i = 0; i < lAdmins.length; i++) {
				lAdmins[i].tripItem.remove(tripItem);
			}
			vae.Review[] lTrip_reviews = tripItem.trip_review.toArray();
			for(int i = 0; i < lTrip_reviews.length; i++) {
				lTrip_reviews[i].setTripItem(null);
			}
			return delete(tripItem);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(vae.TripItem tripItem, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tripItem.getAnnouncement() != null) {
				tripItem.getAnnouncement().setTripItem(null);
			}
			
			if (tripItem.getCategory() != null) {
				tripItem.getCategory().tripItems.remove(tripItem);
			}
			
			vae.Trip[] lTripPlanLists = tripItem.tripPlanList.toArray();
			for(int i = 0; i < lTripPlanLists.length; i++) {
				lTripPlanLists[i].tripItem.remove(tripItem);
			}
			vae.Admin[] lAdmins = tripItem.admin.toArray();
			for(int i = 0; i < lAdmins.length; i++) {
				lAdmins[i].tripItem.remove(tripItem);
			}
			vae.Review[] lTrip_reviews = tripItem.trip_review.toArray();
			for(int i = 0; i < lTrip_reviews.length; i++) {
				lTrip_reviews[i].setTripItem(null);
			}
			try {
				session.delete(tripItem);
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
	
	public static boolean refresh(vae.TripItem tripItem) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(tripItem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(vae.TripItem tripItem) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(tripItem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TripItem loadTripItemByCriteria(TripItemCriteria tripItemCriteria) {
		TripItem[] tripItems = listTripItemByCriteria(tripItemCriteria);
		if(tripItems == null || tripItems.length == 0) {
			return null;
		}
		return tripItems[0];
	}
	
	public static TripItem[] listTripItemByCriteria(TripItemCriteria tripItemCriteria) {
		return tripItemCriteria.listTripItem();
	}
}
