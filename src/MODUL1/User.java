package MODUL1;
import java.util.Scanner;
public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    String phoneNumber;
    Scanner input = new Scanner(System.in);
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void registerNama(String name){
        System.out.println("Nama : "+name);
    }
    public void registerPhone(String phoneNumber){
        System.out.println("No. Handphones : "+phoneNumber);
    }

}
