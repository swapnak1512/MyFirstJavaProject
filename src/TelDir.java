import java.util.*;

public class TelDir {
    HashMap<String, String> emp = new HashMap<>();

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\d{10}";
        return phoneNumber.matches(regex);
    }
    public void AddContacts(String name, String phoneNum) {
        try {
            if (name != null && phoneNum != null) {
                emp.put(name, phoneNum);
                System.out.println("Contact " + name + " is successfully added to Phone Directory");
            }
        } catch (Exception e) {
            System.out.println(" **** Exception Occurred, either Name or PhoneNum are null ");
            e.printStackTrace();
            System.out.println("Contact has not been added to Phone Directory, please try again!!");
        }

        System.out.println("Total no of contacts in the Telephone Directory : " + emp.size());
    }


    public String getTelephoneNumber(String name) {
        return emp.get(name);
    }

    //updated the code for getName
    public String getName(String phoneNum) {
        String foundKey = null;
        for (Map.Entry<String, String> entry : emp.entrySet()) {
            if (Objects.equals(entry.getValue(), phoneNum)) {
                foundKey = entry.getKey();
                break; // Stop searching once the key is found
            }
        }
         return foundKey;
   }

    public void getAllContacts() {
        System.out.println("********************");
        System.out.println("Total no of contacts in the Telephone Directory : " + emp.size());
        System.out.println("Name   :   Telephone Number");

        //for sorting the keys
        TreeMap<String, String> sortedMap = new TreeMap<>(emp);

        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + "   :    " + entry.getValue());
        }
    }

    public void searchContacts(String input)
    {
        ArrayList<String> matchingNames = new ArrayList<>();
        for (Map.Entry<String, String> entry : emp.entrySet()) {
            String name = entry.getKey();
            if (name.startsWith(input)) {
                matchingNames.add(name);
            }
        }

        // Display the matching names
        if (!matchingNames.isEmpty()) {
            System.out.println("Matching names:");
            for (String name : matchingNames) {
                String phoneNumber = emp.get(name);
                System.out.println(name+":"+phoneNumber);
            }
        } else {
            System.out.println("No names found matching the input.");
        }

    }
}



