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

public class AdminDAO {
	public static Admin loadAdminByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadAdminByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getAdminByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadAdminByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return getAdminByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Admin) session.load(Admin.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Admin) session.get(Admin.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Admin) session.load(Admin.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Admin) session.get(Admin.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryAdmin(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return queryAdmin(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return listAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Admin as Admin");
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
	
	public static List queryAdmin(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Admin as Admin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Admin", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdmin(session, condition, orderBy);
			return (Admin[]) list.toArray(new Admin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdmin(session, condition, orderBy, lockMode);
			return (Admin[]) list.toArray(new Admin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return loadAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Admin[] admins = listAdminByQuery(session, condition, orderBy);
		if (admins != null && admins.length > 0)
			return admins[0];
		else
			return null;
	}
	
	public static Admin loadAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Admin[] admins = listAdminByQuery(session, condition, orderBy, lockMode);
		if (admins != null && admins.length > 0)
			return admins[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = VAEPersistentManager.instance().getSession();
			return iterateAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Admin as Admin");
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
	
	public static java.util.Iterator iterateAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From vae.Admin as Admin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Admin", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin createAdmin() {
		return new Admin();
	}
	
	public static boolean save(Admin admin) throws PersistentException {
		try {
			VAEPersistentManager.instance().saveObject(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Admin admin) throws PersistentException {
		try {
			VAEPersistentManager.instance().deleteObject(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Admin admin)throws PersistentException {
		try {
			PrioritizedAnnouncement[] lProducts = admin.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].seller.remove(admin);
			}
			TripItem[] lTripItems = admin.tripItem.toArray();
			for(int i = 0; i < lTripItems.length; i++) {
				lTripItems[i].admin.remove(admin);
			}
			return delete(admin);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Admin admin, org.orm.PersistentSession session)throws PersistentException {
		try {
			PrioritizedAnnouncement[] lProducts = admin.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].seller.remove(admin);
			}
			TripItem[] lTripItems = admin.tripItem.toArray();
			for(int i = 0; i < lTripItems.length; i++) {
				lTripItems[i].admin.remove(admin);
			}
			try {
				session.delete(admin);
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
	
	public static boolean refresh(Admin admin) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().refresh(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Admin admin) throws PersistentException {
		try {
			VAEPersistentManager.instance().getSession().evict(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByCriteria(AdminCriteria adminCriteria) {
		Admin[] admins = listAdminByCriteria(adminCriteria);
		if(admins == null || admins.length == 0) {
			return null;
		}
		return admins[0];
	}
	
	public static Admin[] listAdminByCriteria(AdminCriteria adminCriteria) {
		return adminCriteria.listAdmin();
	}
}
