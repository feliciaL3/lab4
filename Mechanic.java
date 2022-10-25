public class Mechanic implements CarEmployee {
    private String FirstName;
    private String LastName;
    private int age;
    private int phone_number;

    public Mechanic(String FirstName, String LastName, int age, int phone_number) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.phone_number = phone_number;
    }

    public void repairs(String car, String car_model, String type) {
        System.out.println("Mechanic " + FirstName + " " + LastName + " is working at  " + car_model + " " + type + ".\n");
    }
    public void isOnBreak() {
        System.out.println("Mechanic " + getFirstName() + " " + LastName + " is now on break.");
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }


    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAge() {
        return age;
    }
    public int getPhone_number() {
        return phone_number;
    }
}