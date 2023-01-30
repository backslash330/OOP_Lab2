/**
 * This class represents an address
 * It contains the street number, street name, city, province and postal code
 * It also contains a constructor and a toString method
 * @author Nicholas Almeida
 */
public class Address {
    // declare the variables
    private int streetNumber;
    private String street;
    private String city;
    private String province;
    private String postalCode;

    /**
     * Construct for the address
     *@param None This constructor takes no arguments as they will be set later
     */
    public Address() {
        // set the default values
        this.streetNumber = 0;
        this.street = "";
        this.city = "";
        this.province = "";
        this.postalCode = "";
    }

    /**
     * This method returns the street number
     * @param None
     * @return the street number
     */
    public int getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * This method returns the street name
     * @param None
     * @return the street name
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * This method returns the city
     * @param None
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * This method returns the province
     * @param None
     * @return the province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * This method returns the postal code
     * @param None
     * @return the postal code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * This method checks that the steet number is valid and sets it if it is
     * @param streetNumber the street number
     * @return true if the street number is valid, false otherwise
     */
    public boolean setStreetNumber(int streetNumber) {
        // check if the street number is valid
        if (streetNumber > 0) {
            // set the street number
            this.streetNumber = streetNumber;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method sets the street name
     * @param street the street name
     * @return true if the street name is valid, false otherwise
     */
    public boolean setStreet(String street) {
        // check if the street name is valid
        if (street.length() > 0) {
            // set the street name
            this.street = street;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method sets the city
     * @param city the city
     * @return true if the city is valid, false otherwise
     */
    public boolean setCity(String city) {
        // check if the city is valid
        if (city.length() > 0) {
            // set the city
            this.city = city;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method sets the province
     * @param province the province
     * @return true if the province is valid, false otherwise
     */
    public boolean setProvince(String province) {
        // check if the province is valid
        if (province.length() > 0) {
            // set the province
            this.province = province;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method checks that the postal code is valid and sets it if it is
     * @param postalCode the postal code
     * @return true if the postal code is valid, false otherwise
     */
    public boolean setPostalCode(String postalCode) {
        // check if the postal code is valid
        // I need to check that it is either 6 characters long or 7 characters long
        // the pattern is A1A 1A1 or A1A1A1
        // use a regular expression to check the pattern
        if (postalCode.matches("[A-Za-z][0-9][A-Za-z] ?[0-9][A-Za-z][0-9]")) {
            // set the postal code
            this.postalCode = postalCode;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns the address as a string
     * @param None
     * @return the address as a string
     */
    public String toString() {
        // return the address as a string
        return this.streetNumber + " " + this.street + ",\n " + this.city + ", " + this.province + ",\n " + this.postalCode;
    }
    
}