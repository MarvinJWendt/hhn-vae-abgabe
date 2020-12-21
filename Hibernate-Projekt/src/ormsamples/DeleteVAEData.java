/**
 * Licensee: Marvin Wendt(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteVAEData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = vae.VAEPersistentManager.instance().getSession().beginTransaction();
		try {
			vae.Traveler lvaeTraveler = vae.TravelerDAO.loadTravelerByQuery(null, null);
			// Delete the persistent object
			vae.TravelerDAO.delete(lvaeTraveler);
			vae.Admin lvaeAdmin = vae.AdminDAO.loadAdminByQuery(null, null);
			// Delete the persistent object
			vae.AdminDAO.delete(lvaeAdmin);
			vae.Trip lvaeTrip = vae.TripDAO.loadTripByQuery(null, null);
			// Delete the persistent object
			vae.TripDAO.delete(lvaeTrip);
			vae.Review lvaeReview = vae.ReviewDAO.loadReviewByQuery(null, null);
			// Delete the persistent object
			vae.ReviewDAO.delete(lvaeReview);
			vae.Category lvaeCategory = vae.CategoryDAO.loadCategoryByQuery(null, null);
			// Delete the persistent object
			vae.CategoryDAO.delete(lvaeCategory);
			vae.PrioritizedAnnouncement lvaePrioritizedAnnouncement = vae.PrioritizedAnnouncementDAO.loadPrioritizedAnnouncementByQuery(null, null);
			// Delete the persistent object
			vae.PrioritizedAnnouncementDAO.delete(lvaePrioritizedAnnouncement);
			vae.MedicalHelp lvaeMedicalHelp = vae.MedicalHelpDAO.loadMedicalHelpByQuery(null, null);
			// Delete the persistent object
			vae.MedicalHelpDAO.delete(lvaeMedicalHelp);
			vae.Insurance lvaeInsurance = vae.InsuranceDAO.loadInsuranceByQuery(null, null);
			// Delete the persistent object
			vae.InsuranceDAO.delete(lvaeInsurance);
			vae.TripItem lvaeTripItem = vae.TripItemDAO.loadTripItemByQuery(null, null);
			// Delete the persistent object
			vae.TripItemDAO.delete(lvaeTripItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteVAEData deleteVAEData = new DeleteVAEData();
			try {
				deleteVAEData.deleteTestData();
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
