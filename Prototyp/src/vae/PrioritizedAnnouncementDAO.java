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

public class PrioritizedAnnouncementDAO {
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadPrioritizedAnnouncementByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement getPrioritizedAnnouncementByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getPrioritizedAnnouncementByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadPrioritizedAnnouncementByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement getPrioritizedAnnouncementByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getPrioritizedAnnouncementByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (PrioritizedAnnouncement) session.load(PrioritizedAnnouncement.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement getPrioritizedAnnouncementByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (PrioritizedAnnouncement) session.get(PrioritizedAnnouncement.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrioritizedAnnouncement) session.load(PrioritizedAnnouncement.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement getPrioritizedAnnouncementByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrioritizedAnnouncement) session.get(PrioritizedAnnouncement.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrioritizedAnnouncement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryPrioritizedAnnouncement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrioritizedAnnouncement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryPrioritizedAnnouncement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement[] listPrioritizedAnnouncementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listPrioritizedAnnouncementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement[] listPrioritizedAnnouncementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listPrioritizedAnnouncementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrioritizedAnnouncement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.PrioritizedAnnouncement as PrioritizedAnnouncement");
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
	
	public static List queryPrioritizedAnnouncement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.PrioritizedAnnouncement as PrioritizedAnnouncement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrioritizedAnnouncement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement[] listPrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPrioritizedAnnouncement(session, condition, orderBy);
			return (PrioritizedAnnouncement[]) list.toArray(new PrioritizedAnnouncement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement[] listPrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPrioritizedAnnouncement(session, condition, orderBy, lockMode);
			return (PrioritizedAnnouncement[]) list.toArray(new PrioritizedAnnouncement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadPrioritizedAnnouncementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadPrioritizedAnnouncementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PrioritizedAnnouncement[] prioritizedAnnouncements = listPrioritizedAnnouncementByQuery(session, condition, orderBy);
		if (prioritizedAnnouncements != null && prioritizedAnnouncements.length > 0)
			return prioritizedAnnouncements[0];
		else
			return null;
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PrioritizedAnnouncement[] prioritizedAnnouncements = listPrioritizedAnnouncementByQuery(session, condition, orderBy, lockMode);
		if (prioritizedAnnouncements != null && prioritizedAnnouncements.length > 0)
			return prioritizedAnnouncements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePrioritizedAnnouncementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iteratePrioritizedAnnouncementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrioritizedAnnouncementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iteratePrioritizedAnnouncementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.PrioritizedAnnouncement as PrioritizedAnnouncement");
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
	
	public static java.util.Iterator iteratePrioritizedAnnouncementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.PrioritizedAnnouncement as PrioritizedAnnouncement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrioritizedAnnouncement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement createPrioritizedAnnouncement() {
		return new PrioritizedAnnouncement();
	}
	
	public static boolean save(PrioritizedAnnouncement prioritizedAnnouncement) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(prioritizedAnnouncement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(PrioritizedAnnouncement prioritizedAnnouncement) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(prioritizedAnnouncement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(PrioritizedAnnouncement prioritizedAnnouncement)throws PersistentException {
		try {
			Admin[] lSellers = prioritizedAnnouncement.seller.toArray();
			for(int i = 0; i < lSellers.length; i++) {
				lSellers[i].product.remove(prioritizedAnnouncement);
			}
			if (prioritizedAnnouncement.getTripItem() != null) {
				prioritizedAnnouncement.getTripItem().setAnnouncement(null);
			}
			
			return delete(prioritizedAnnouncement);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(PrioritizedAnnouncement prioritizedAnnouncement, org.orm.PersistentSession session)throws PersistentException {
		try {
			Admin[] lSellers = prioritizedAnnouncement.seller.toArray();
			for(int i = 0; i < lSellers.length; i++) {
				lSellers[i].product.remove(prioritizedAnnouncement);
			}
			if (prioritizedAnnouncement.getTripItem() != null) {
				prioritizedAnnouncement.getTripItem().setAnnouncement(null);
			}
			
			try {
				session.delete(prioritizedAnnouncement);
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
	
	public static boolean refresh(PrioritizedAnnouncement prioritizedAnnouncement) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(prioritizedAnnouncement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(PrioritizedAnnouncement prioritizedAnnouncement) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(prioritizedAnnouncement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrioritizedAnnouncement loadPrioritizedAnnouncementByCriteria(PrioritizedAnnouncementCriteria prioritizedAnnouncementCriteria) {
		PrioritizedAnnouncement[] prioritizedAnnouncements = listPrioritizedAnnouncementByCriteria(prioritizedAnnouncementCriteria);
		if(prioritizedAnnouncements == null || prioritizedAnnouncements.length == 0) {
			return null;
		}
		return prioritizedAnnouncements[0];
	}
	
	public static PrioritizedAnnouncement[] listPrioritizedAnnouncementByCriteria(PrioritizedAnnouncementCriteria prioritizedAnnouncementCriteria) {
		return prioritizedAnnouncementCriteria.listPrioritizedAnnouncement();
	}
}
