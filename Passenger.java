public class Passenger implements PhoneOwner{
    private String FirstName;
    private String LastName;
    private int phone_number;
    public Passenger(String FirstName, String LastName,int phone_number) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.phone_number = phone_number;
    }

    //@Override
    public void calls(String passenger, int phone_number) {
    }
    //@Override
    public void calls(String car, String car_type,String car_color ) {
        System.out.println("Passenger " + FirstName + " is calling from "+ phone_number + "  to get  info about disponibility of  "+ car_type + " "+ car_color + ".");
    }
    public void getsToDestination(boolean happy, String driver, String FirstName){
        if (happy){
        System.out.println("Passenger " +" " +getFirstName() + " has arrived to the destination happy.");
         System.out.println(FirstName + " got tips.");}
        else {
            System.out.println( "Passenger" + " " + getFirstName() + " has arrived to the destination unhappy.");
        }
    }

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }


    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

}