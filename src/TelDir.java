import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelDir {
    HashMap<String, String> emp = new HashMap<>();


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
        for (Map.Entry<String, String> entry : emp.entrySet()) {
            System.out.println(entry.getKey() + "   :    " + entry.getValue());
        }
    }
}



