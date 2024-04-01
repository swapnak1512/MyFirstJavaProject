import java.util.Scanner;

import static java.lang.System.exit;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while(true) {
        TelDir td = new TelDir();
        System.out.print("Hello and welcome to my Telephone Directory!");
        Scanner scn = new Scanner(System.in);
        System.out.println("\n1- Add Contacts to Telephone Directory \n" +
                "2- Get Telephone number based on name\n" +
                "3- Get Name of the contact based on Telephone number\n" +
                "4- Get All Contacts\n" +
                "5- Exit");
        int selectedOption = scn.nextInt();

        switch(selectedOption){
            case 1 :  System.out.println("1- Add Contacts to Telephone Directory");
                      td.AddContacts();
                      break;
            case 2 : System.out.println("2- Get Telephone number based on name");
                     td.getTelephoneNumber();
                     break;
            case 3 : System.out.println("3- Get Name of the contact based on Telephone number");
                     td.getName();
                     break;
            case 4 : System.out.println("4- Get All contacts");
                     td.getAllContacts();
                     break;
            case 5 : System.out.println("5- Exit");
                     System.exit(0);
                     break;
            default:  System.out.println("Not present");


        }
        }
        }
    }
