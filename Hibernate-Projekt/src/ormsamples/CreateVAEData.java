/**
 * Licensee: Marvin Wendt(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateVAEData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = vae.VAEPersistentManager.instance().getSession().beginTransaction();
		try {
			vae.Traveler lvaeTraveler = vae.TravelerDAO.createTraveler();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : medical_provider, review, trip
			vae.TravelerDAO.save(lvaeTraveler);
			vae.Admin lvaeAdmin = vae.AdminDAO.createAdmin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tripItem, product
			vae.AdminDAO.save(lvaeAdmin);
			vae.Trip lvaeTrip = vae.TripDAO.createTrip();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tripItem, traveler
			vae.TripDAO.save(lvaeTrip);
			vae.Review lvaeReview = vae.ReviewDAO.createReview();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluator, createdAt, description, rating, tripItem
			vae.ReviewDAO.save(lvaeReview);
			vae.Category lvaeCategory = vae.CategoryDAO.createCategory();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tripItems
			vae.CategoryDAO.save(lvaeCategory);
			vae.PrioritizedAnnouncement lvaePrioritizedAnnouncement = vae.PrioritizedAnnouncementDAO.createPrioritizedAnnouncement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seller, price
			vae.PrioritizedAnnouncementDAO.save(lvaePrioritizedAnnouncement);
			vae.MedicalHelp lvaeMedicalHelp = vae.MedicalHelpDAO.createMedicalHelp();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : patient
			vae.MedicalHelpDAO.save(lvaeMedicalHelp);
			vae.Insurance lvaeInsurance = vae.InsuranceDAO.createInsurance();
			// Initialize the properties of the persistent object here
			vae.InsuranceDAO.save(lvaeInsurance);
			vae.TripItem lvaeTripItem = vae.TripItemDAO.createTripItem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : trip_review, admin, tripPlanList, coordinates, price, category
			vae.TripItemDAO.save(lvaeTripItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateVAEData createVAEData = new CreateVAEData();
			try {
				createVAEData.createTestData();
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
