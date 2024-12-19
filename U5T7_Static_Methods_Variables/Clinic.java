package U5T7_Static_Methods_Variables;

public class Clinic {
    private int vaccinatedNum;

    private Person recentPatient = null;
    private static int totalClinics = 0;
    private static int totalVaccinatedNum = 0;

    public Clinic() {
        totalClinics++;
        vaccinatedNum = 0;
        
    }

    public boolean vaccinate(Person patient) {
        if (patient.isVaccinated()) {
            return false;
        } else {
            patient.vaccinate();
            recentPatient = patient;
            vaccinatedNum++;
            totalVaccinatedNum++;
            return true;
        }
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotalVaccineCount() {
        return totalVaccinatedNum;
    }

    public Person mostRecentlyVaccinated() {
        return recentPatient;
    }

    public int getClinicVaccineCount() {
        return vaccinatedNum;
    }    
}
