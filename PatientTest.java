
/**
 * Anwar Haikal
 * 0322126
 * June 7 2015
 * Initialize patient objects
 */ 
 
 public class PatientTest
{
   public static void main(String[] args) // main class
   {
       //Create 3 patient objects
       Patient patient1 = new Patient("Larry Sage", "1", "012-LS", "Mild Cough", "Male", "January 5 1980");
       Patient patient2 = new Patient("Elon Must", "2", "014-EM", "Cold Fever", "Male", "March 10 1985");
       Patient patient3 = new Patient("Steve Jogs", "3", "016-SJ", "Asthma", "Male", "February 15 1975");
       
       // display data
       System.out.printf("Patient 1: %n %s%n ID: %s%n Contact no.: %s%n Disease: %s%n Gender: %s%n Date of birth: %s%n%n", patient1.getName(), patient1.getPatientID(),
       patient1.getContact(), patient1.getDisease(), patient1.getGender(), patient1.getDateOfBirth());
            
       System.out.printf("Patient 2: %n %s%n ID: %s%n Contact no.: %s%n Disease: %s%n Gender: %s%n Date of birth: %s%n%n", patient2.getName(), patient2.getPatientID(),
       patient2.getContact(), patient2.getDisease(), patient2.getGender(), patient2.getDateOfBirth());
            
       System.out.printf("Patient 3: %n %s%n ID: %s%n Contact no.: %s%n Disease: %s%n Gender: %s%n Date of birth: %s%n%n", patient3.getName(), patient3.getPatientID(),
       patient3.getContact(), patient3.getDisease(), patient3.getGender(), patient3.getDateOfBirth());
    }
} // end of class

