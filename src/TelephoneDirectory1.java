import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory1 {
    public static void main(String args[])
    {
        HashMap<String,Integer> emp = new HashMap<>();
        emp.put("John",1234567890);
        emp.put("Swapna",987654321) ;
        emp.put("Bhanu",678998989);
        System.out.println(emp);
        System.out.println(emp.get("Swapna"));
        //System.out.println(emp.get(1234567890));

       int searchValue = 1234567890;
        String foundKey = null;
         for (Map.Entry<String, Integer> entry : emp.entrySet()) {
            if (entry.getValue() == searchValue) {
                foundKey = entry.getKey();
                break; // Stop searching once the key is found
            }
        }

        // Print the result
        if (foundKey != null) {
            System.out.println("Key found: " + foundKey);
        } else {
            System.out.println("Key not found for the specified value.");
        }

        // Print keys
        for (String i : emp.keySet()) {
            System.out.println(i);
        }

        //Print Values
        for (int j : emp.values()) {
            System.out.println(j);
        }

    }
}
