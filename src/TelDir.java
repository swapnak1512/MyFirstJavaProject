import java.util.HashMap;
import java.util.Scanner;

public class TelDir {
    HashMap<String,Integer> emp = new HashMap<>();


    public void AddContacts()
    {
        System.out.println("******************");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an Name & a Phone Number");
        String name = scn.nextLine();
        int phoneNum = scn.nextInt();
        emp.put(name,phoneNum);
        System.out.println("Phone Number for:"+name+" is "+emp.get(name));
        System.out.println("******************");
        System.out.println("Size of HashMap:"+emp.size());
    }
    public void getTelephoneNumber()
    {
        System.out.println("******************");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Name to find a Phone Number");
        String name = scn.nextLine();
        System.out.println("Phone Number for:"+name +" is "+emp.get(name));
        System.out.println("******************");
        System.out.println("Size of HashMap:"+emp.size());

    }

    public void getName()
    {
        System.out.println("******************");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phone number to find a Name");
        int phoneNum = scn.nextInt();
        System.out.println("Name for:"+phoneNum +" is "+ emp.get(phoneNum));
    }
    public void getAllContacts()
    {
        System.out.println("********************");
        System.out.println("size of hashmap"+emp.size());
        for (String i : emp.keySet()) {
            System.out.println(i);
        }
    }
}
