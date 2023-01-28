// import the JOptionPane class
import javax.swing.JOptionPane;

// This is the lab2 class
public class Lab2 {
    // This is the main method
    public static void main(String[] args) {
        // create an address object
        Address address = new Address();
        // get the values from the address object 
        // use a joption input dialog to get the values

        String streetNumber = JOptionPane.showInputDialog("Enter the street number");
        // convert the string to an int
        int streetNumberInt = Integer.parseInt(streetNumber);
        String street = JOptionPane.showInputDialog("Enter the street name");
        String city = JOptionPane.showInputDialog("Enter the city");
        String province = JOptionPane.showInputDialog("Enter the province");
        String postalCode = JOptionPane.showInputDialog("Enter the postal code");

        // set the values in the address object
        // if the setter method returns false, then re-prompt the user for the value
        // use a while loop to do this

        while (address.setStreetNumber(streetNumberInt) == false) {
            streetNumber = JOptionPane.showInputDialog("Last street number entered was invalid. Enter the street number");
        }
        while (address.setStreet(street) == false) {
            street = JOptionPane.showInputDialog("Last street name entered was invalid. Enter the street name");
        }
        while (address.setCity(city) == false) {
            city = JOptionPane.showInputDialog("Last city entered was invalid. Enter the city");
        }
        while (address.setProvince(province) == false) {
            province = JOptionPane.showInputDialog("Last province entered was invalid. Enter the province");
        }
        while (address.setPostalCode(postalCode) == false) {
            postalCode = JOptionPane.showInputDialog("Last postal code entered was invalid. Enter the postal code");
        }

        // display the values in the address object using a joption pane
        JOptionPane.showMessageDialog(null, address.toString());


    }
}

