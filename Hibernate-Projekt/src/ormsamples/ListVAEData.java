/**
 * Licensee: Marvin Wendt(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListVAEData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Traveler...");
		vae.Traveler[] vaeTravelers = vae.TravelerDAO.listTravelerByQuery(null, null);
		int length = Math.min(vaeTravelers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeTravelers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Admin...");
		vae.Admin[] vaeAdmins = vae.AdminDAO.listAdminByQuery(null, null);
		length = Math.min(vaeAdmins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeAdmins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Trip...");
		vae.Trip[] vaeTrips = vae.TripDAO.listTripByQuery(null, null);
		length = Math.min(vaeTrips.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeTrips[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Review...");
		vae.Review[] vaeReviews = vae.ReviewDAO.listReviewByQuery(null, null);
		length = Math.min(vaeReviews.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeReviews[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Category...");
		vae.Category[] vaeCategorys = vae.CategoryDAO.listCategoryByQuery(null, null);
		length = Math.min(vaeCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PrioritizedAnnouncement...");
		vae.PrioritizedAnnouncement[] vaePrioritizedAnnouncements = vae.PrioritizedAnnouncementDAO.listPrioritizedAnnouncementByQuery(null, null);
		length = Math.min(vaePrioritizedAnnouncements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaePrioritizedAnnouncements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MedicalHelp...");
		vae.MedicalHelp[] vaeMedicalHelps = vae.MedicalHelpDAO.listMedicalHelpByQuery(null, null);
		length = Math.min(vaeMedicalHelps.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeMedicalHelps[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Insurance...");
		vae.Insurance[] vaeInsurances = vae.InsuranceDAO.listInsuranceByQuery(null, null);
		length = Math.min(vaeInsurances.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeInsurances[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TripItem...");
		vae.TripItem[] vaeTripItems = vae.TripItemDAO.listTripItemByQuery(null, null);
		length = Math.min(vaeTripItems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(vaeTripItems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Traveler by Criteria...");
		vae.TravelerCriteria lvaeTravelerCriteria = new vae.TravelerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeTravelerCriteria.id.eq();
		lvaeTravelerCriteria.setMaxResults(ROW_COUNT);
		vae.Traveler[] vaeTravelers = lvaeTravelerCriteria.listTraveler();
		int length =vaeTravelers== null ? 0 : Math.min(vaeTravelers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeTravelers[i]);
		}
		System.out.println(length + " Traveler record(s) retrieved."); 
		
		System.out.println("Listing Admin by Criteria...");
		vae.AdminCriteria lvaeAdminCriteria = new vae.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeAdminCriteria.id.eq();
		lvaeAdminCriteria.setMaxResults(ROW_COUNT);
		vae.Admin[] vaeAdmins = lvaeAdminCriteria.listAdmin();
		length =vaeAdmins== null ? 0 : Math.min(vaeAdmins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeAdmins[i]);
		}
		System.out.println(length + " Admin record(s) retrieved."); 
		
		System.out.println("Listing Trip by Criteria...");
		vae.TripCriteria lvaeTripCriteria = new vae.TripCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeTripCriteria.id.eq();
		lvaeTripCriteria.setMaxResults(ROW_COUNT);
		vae.Trip[] vaeTrips = lvaeTripCriteria.listTrip();
		length =vaeTrips== null ? 0 : Math.min(vaeTrips.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeTrips[i]);
		}
		System.out.println(length + " Trip record(s) retrieved."); 
		
		System.out.println("Listing Review by Criteria...");
		vae.ReviewCriteria lvaeReviewCriteria = new vae.ReviewCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeReviewCriteria.id.eq();
		lvaeReviewCriteria.setMaxResults(ROW_COUNT);
		vae.Review[] vaeReviews = lvaeReviewCriteria.listReview();
		length =vaeReviews== null ? 0 : Math.min(vaeReviews.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeReviews[i]);
		}
		System.out.println(length + " Review record(s) retrieved."); 
		
		System.out.println("Listing Category by Criteria...");
		vae.CategoryCriteria lvaeCategoryCriteria = new vae.CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeCategoryCriteria.id.eq();
		lvaeCategoryCriteria.setMaxResults(ROW_COUNT);
		vae.Category[] vaeCategorys = lvaeCategoryCriteria.listCategory();
		length =vaeCategorys== null ? 0 : Math.min(vaeCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeCategorys[i]);
		}
		System.out.println(length + " Category record(s) retrieved."); 
		
		System.out.println("Listing PrioritizedAnnouncement by Criteria...");
		vae.PrioritizedAnnouncementCriteria lvaePrioritizedAnnouncementCriteria = new vae.PrioritizedAnnouncementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaePrioritizedAnnouncementCriteria.id.eq();
		lvaePrioritizedAnnouncementCriteria.setMaxResults(ROW_COUNT);
		vae.PrioritizedAnnouncement[] vaePrioritizedAnnouncements = lvaePrioritizedAnnouncementCriteria.listPrioritizedAnnouncement();
		length =vaePrioritizedAnnouncements== null ? 0 : Math.min(vaePrioritizedAnnouncements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaePrioritizedAnnouncements[i]);
		}
		System.out.println(length + " PrioritizedAnnouncement record(s) retrieved."); 
		
		System.out.println("Listing MedicalHelp by Criteria...");
		vae.MedicalHelpCriteria lvaeMedicalHelpCriteria = new vae.MedicalHelpCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeMedicalHelpCriteria.id.eq();
		lvaeMedicalHelpCriteria.setMaxResults(ROW_COUNT);
		vae.MedicalHelp[] vaeMedicalHelps = lvaeMedicalHelpCriteria.listMedicalHelp();
		length =vaeMedicalHelps== null ? 0 : Math.min(vaeMedicalHelps.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeMedicalHelps[i]);
		}
		System.out.println(length + " MedicalHelp record(s) retrieved."); 
		
		System.out.println("Listing Insurance by Criteria...");
		vae.InsuranceCriteria lvaeInsuranceCriteria = new vae.InsuranceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeInsuranceCriteria.id.eq();
		lvaeInsuranceCriteria.setMaxResults(ROW_COUNT);
		vae.Insurance[] vaeInsurances = lvaeInsuranceCriteria.listInsurance();
		length =vaeInsurances== null ? 0 : Math.min(vaeInsurances.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeInsurances[i]);
		}
		System.out.println(length + " Insurance record(s) retrieved."); 
		
		System.out.println("Listing TripItem by Criteria...");
		vae.TripItemCriteria lvaeTripItemCriteria = new vae.TripItemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lvaeTripItemCriteria.id.eq();
		lvaeTripItemCriteria.setMaxResults(ROW_COUNT);
		vae.TripItem[] vaeTripItems = lvaeTripItemCriteria.listTripItem();
		length =vaeTripItems== null ? 0 : Math.min(vaeTripItems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(vaeTripItems[i]);
		}
		System.out.println(length + " TripItem record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListVAEData listVAEData = new ListVAEData();
			try {
				listVAEData.listTestData();
				//listVAEData.listByCriteria();
			}
			finally {
				vae.VAEPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
