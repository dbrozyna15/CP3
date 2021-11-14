import java.util.Calendar;

public class DrivingLicense
{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int year;
    private String category;
    
    /** 
     * name
     * > getter
     * > setter
    */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1).toLowerCase();
        
        this.name = firstLetter + rest;
    }
    
    /** 
     * surname
     * > getter
     * > setter
    */
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    /** 
     * address
     * > getter
     * > setter
    */
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    /** 
     * postalCode
     * > getter
     * > setter
    */
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    /** 
     * city
     * > getter
     * > setter
    */    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    /** 
     * licenseNumber
     * > getter
     * > setter
    */
    public String getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    /** 
     * year
     * > getter
     * > setter
    */
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year >= 1980 && year <= currentYear) {
            this.year = year;
        }
        else {
            throw new java.lang.RuntimeException("Wrong year");
        }
        
    }
    
    /** 
     * category
     * > getter
     * > setter
    */
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String toString() {
        return (
            "\nDriver's name: " + getName() +
            "\nDriver's surname: " + getSurname() +
            "\nDriver's address: " + getAddress() +
            "\nDriver's postal code: " + getPostalCode() +
            "\nDriver's city: " + getCity() +
            "\nYear of issue: " + getYear() +
            "\nCategory: " + getCategory()
        );
    }
    
    static public void main(String[] args) {
        DrivingLicense dl1 = new DrivingLicense();
        
        dl1.setName("Jan");
        dl1.setSurname("Kowalski");
        dl1.setAddress("Kolorowa 1");
        dl1.setPostalCode("44-444");
        dl1.setCity("Krakow");
        dl1.setYear(2021);
        dl1.setCategory("A1");
        
        System.out.println(dl1);
    }
}
