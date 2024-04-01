public class TelephoneDirectory {
    String name;
    int phoneNum;
    public int getPhoneNum()
    {
        return phoneNum;
    }
    public String getName()
    {
        return name;
    }
    public TelephoneDirectory(String Name, int PhoneNum)
    {
        this.name=Name;
        this.phoneNum = PhoneNum;
    }
    public static void main(String args[])
    {
        TelephoneDirectory td = new TelephoneDirectory("Swapna",1234567890);
        System.out.println("Name:"+td.getName()+"Phone Number:"+td.getPhoneNum());
        TelephoneDirectory td1 = new TelephoneDirectory("Bhanu",987654321);
        System.out.println("Name:"+td1.getName()+"Phone Number:"+td1.getPhoneNum());

    }
}
