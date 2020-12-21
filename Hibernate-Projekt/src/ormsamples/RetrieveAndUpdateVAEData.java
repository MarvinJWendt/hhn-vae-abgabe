/**
 * Licensee: Marvin Wendt(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateVAEData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = vae.VAEPersistentManager.instance().getSession().beginTransaction();
		try {
			vae.Traveler lvaeTraveler = vae.TravelerDAO.loadTravelerByQuery(null, null);
			// Update the properties of the persistent object
			vae.TravelerDAO.save(lvaeTraveler);
			vae.Admin lvaeAdmin = vae.AdminDAO.loadAdminByQuery(null, null);
			// Update the properties of the persistent object
			vae.AdminDAO.save(lvaeAdmin);
			vae.Trip lvaeTrip = vae.TripDAO.loadTripByQuery(null, null);
			// Update the properties of the persistent object
			vae.TripDAO.save(lvaeTrip);
			vae.Review lvaeReview = vae.ReviewDAO.loadReviewByQuery(null, null);
			// Update the properties of the persistent object
			vae.ReviewDAO.save(lvaeReview);
			vae.Category lvaeCategory = vae.CategoryDAO.loadCategoryByQuery(null, null);
			// Update the properties of the persistent object
			vae.CategoryDAO.save(lvaeCategory);
			vae.PrioritizedAnnouncement lvaePrioritizedAnnouncement = vae.PrioritizedAnnouncementDAO.loadPrioritizedAnnouncementByQuery(null, null);
			// Update the properties of the persistent object
			vae.PrioritizedAnnouncementDAO.save(lvaePrioritizedAnnouncement);
			vae.MedicalHelp lvaeMedicalHelp = vae.MedicalHelpDAO.loadMedicalHelpByQuery(null, null);
			// Update the properties of the persistent object
			vae.MedicalHelpDAO.save(lvaeMedicalHelp);
			vae.Insurance lvaeInsurance = vae.InsuranceDAO.loadInsuranceByQuery(null, null);
			// Update the properties of the persistent object
			vae.InsuranceDAO.save(lvaeInsurance);
			vae.TripItem lvaeTripItem = vae.TripItemDAO.loadTripItemByQuery(null, null);
			// Update the properties of the persistent object
			vae.TripItemDAO.save(lvaeTripItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Traveler by TravelerCriteria");
		vae.TravelerCriteria lvaeTravelerCriteria = new vae.TravelerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeTravelerCriteria.id.eq();
		System.out.println(lvaeTravelerCriteria.uniqueTraveler());
		
		System.out.println("Retrieving Admin by AdminCriteria");
		vae.AdminCriteria lvaeAdminCriteria = new vae.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeAdminCriteria.id.eq();
		System.out.println(lvaeAdminCriteria.uniqueAdmin());
		
		System.out.println("Retrieving Trip by TripCriteria");
		vae.TripCriteria lvaeTripCriteria = new vae.TripCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeTripCriteria.id.eq();
		System.out.println(lvaeTripCriteria.uniqueTrip());
		
		System.out.println("Retrieving Review by ReviewCriteria");
		vae.ReviewCriteria lvaeReviewCriteria = new vae.ReviewCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeReviewCriteria.id.eq();
		System.out.println(lvaeReviewCriteria.uniqueReview());
		
		System.out.println("Retrieving Category by CategoryCriteria");
		vae.CategoryCriteria lvaeCategoryCriteria = new vae.CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeCategoryCriteria.id.eq();
		System.out.println(lvaeCategoryCriteria.uniqueCategory());
		
		System.out.println("Retrieving PrioritizedAnnouncement by PrioritizedAnnouncementCriteria");
		vae.PrioritizedAnnouncementCriteria lvaePrioritizedAnnouncementCriteria = new vae.PrioritizedAnnouncementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaePrioritizedAnnouncementCriteria.id.eq();
		System.out.println(lvaePrioritizedAnnouncementCriteria.uniquePrioritizedAnnouncement());
		
		System.out.println("Retrieving MedicalHelp by MedicalHelpCriteria");
		vae.MedicalHelpCriteria lvaeMedicalHelpCriteria = new vae.MedicalHelpCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeMedicalHelpCriteria.id.eq();
		System.out.println(lvaeMedicalHelpCriteria.uniqueMedicalHelp());
		
		System.out.println("Retrieving Insurance by InsuranceCriteria");
		vae.InsuranceCriteria lvaeInsuranceCriteria = new vae.InsuranceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeInsuranceCriteria.id.eq();
		System.out.println(lvaeInsuranceCriteria.uniqueInsurance());
		
		System.out.println("Retrieving TripItem by TripItemCriteria");
		vae.TripItemCriteria lvaeTripItemCriteria = new vae.TripItemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lvaeTripItemCriteria.id.eq();
		System.out.println(lvaeTripItemCriteria.uniqueTripItem());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateVAEData retrieveAndUpdateVAEData = new RetrieveAndUpdateVAEData();
			try {
				retrieveAndUpdateVAEData.retrieveAndUpdateTestData();
				//retrieveAndUpdateVAEData.retrieveByCriteria();
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
