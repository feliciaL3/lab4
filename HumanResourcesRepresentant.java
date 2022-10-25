public class HumanResourcesRepresentant implements AnotherWorkers {
   
    private String FirstName;
    private String LastName;
    private boolean response ;
    public HumanResourcesRepresentant(String FirstName, String LastName, boolean response){
        this.FirstName= FirstName;
        this.LastName= LastName;
        this.response= response; 
    }

  
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public boolean getresponse() {
        return response;
    }


    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setresponse (boolean response) {
        this.response= response;
    }

  
    public void hiring() {
        System.out.println("Human Resources Representant " +FirstName+ " is here to help you.\n");
    }
    //@Override
    public void calls(String car, String car_type){
    }
    //@Override
    /*public void calls(String passenger, String phone_number, boolean response) {
        if (response) {
            System.out.printf("%s %s responds to %s and assigns a car to the customer." +
                " %n", getFirstName(), getLastName(), phone_number);}
        if (!response){
            System.out.printf("%s %s responds to %s and informs the customer about car unavailability." +
                    " %n", getFirstName(), getLastName(), phone_number);
        }
    } */
}