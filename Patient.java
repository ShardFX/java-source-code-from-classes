
/**
 * Anwar Haikal
 * 0322126
 * June 7 2015 
 * Class to set and get variables for patient
 */

public class Patient
{
    private String name;
    private String patientID;
    private String contact;
    private String disease;
    private String gender;
    private String dateOfBirth;
    
        // Constructors
        public Patient(String name, String patientID, String contact,
        String disease, String gender, String dateOfBirth)
        {
            this.name = name;
            this.patientID = patientID;
            this.contact = contact;
            this.disease = disease;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
        }
    
        // set methods
        public void setName(String name)
        {
            this.name = name;
        }
        public void setPatientID(String patientID)
        {
            this.patientID = patientID;
        }
        public void setContact(String contact)
        {
            this.contact = contact;
        }
        public void setDisease(String disease)
        {
            this.disease = disease;
        }
        public void setGender(String gender)
        {
            this.gender = gender;
        }
        public void setDateOfBirth(String dateOfBirth)
        {
            this.dateOfBirth = dateOfBirth;
        }
        
        // get methods
        public String getName()
        {
            return name;
        }
        public String getPatientID()
        {
            return patientID;
        }
        public String getContact()
        {
            return contact;
        }
        public String getDisease()
        {
            return disease;
        }
        public String getGender()
        {
            return gender;
        }
        public String getDateOfBirth()
        {
            return dateOfBirth;
        }
    
} // end class Patient
