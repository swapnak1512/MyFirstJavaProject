import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        TelDir td = new TelDir(); // Moved object creation out of while as it's keep creating new object everytime you read data
        String name, phoneNum=" ";
        System.out.print("\n ********** Hello and welcome to my Telephone Directory ************ \n");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println(" PLEASE CHOOSE ANY OPTION (1 or 2 or 3 or 4 or 5) TO PROCEED");
            System.out.println(
                    "1- Add Contacts to Telephone Directory \n" +
                            "2- Get Telephone number based on name\n" +
                            "3- Get Name of the contact based on Telephone number\n" +
                            "4- Get All Contacts\n" +
                            "5- Search the Contacts in the Telephone directory \n" +
                            "6- Exit");
            int selectedOption = scan.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println(" ***** You have chosen option 1 - Add Contacts to Telephone Directory ****");
                    System.out.println("Enter Name:");
                    name = scan.next();

                    boolean isValid = false;

                    while (!isValid) {
                        System.out.println("Enter 10 digit PhoneNumber:");
                        phoneNum = scan.next();

                        if (td.isValidPhoneNumber(phoneNum)) {
                            System.out.println("Valid phone number: " + phoneNum);
                            isValid = true;
                        } else {
                            System.out.println("Invalid phone number. Please enter a 10-digit number.");
                        }
                    }
                    td.AddContacts(name, phoneNum);
                    break;
                case 2:
                    System.out.println("***** You have chosen option 2- Get Telephone number based on name given ****");
                    System.out.println("Enter Name:");
                    name = scan.next();
                    String outputPhoneNum = td.getTelephoneNumber(name);
                    if (outputPhoneNum != null)
                        System.out.println("Telephone number of " + name + " is : " + outputPhoneNum);
                    else
                        System.out.println("Sorry!! No Matching Phonenumber found in the Telephone Directory for " + name);
                    break;
                case 3:
                    System.out.println("***** You have chosen option 3- Get Name based on Phonenumber given ****");
                    System.out.println("Enter Phonenumber:");
                    phoneNum = scan.next();
                    String outputName = td.getName(phoneNum);
                    if (outputName != null)
                        System.out.println("Name associated with Phonenumber " + phoneNum + " is : " + outputName);
                    else
                        System.out.println("Sorry!! No Matching Name found in the Telephone Directory for " + phoneNum);
                    break;
                case 4:
                    System.out.println("4- Get All contacts");
                    td.getAllContacts();
                    break;
                case 5:
                    System.out.println("5-Search the contacts in telephone directory");
                    System.out.print("Enter first 1 or 2 or 3 characters: ");
                    String input = scan.next();
                    td.searchContacts(input);
                    break;
                case 6:
                    System.out.println("6- Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not present");


            }
        }
    }
}
