public class Marketolog implements FinancialEmployee {
    private String FirstName;
    private String LastName;

    public Marketolog (String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }


    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }


    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }


     public void promovates() {
        System.out.println("The marketolog " + FirstName + " " + LastName + " makes different offers for loyal customers\n");
    } 
    //@Override
    public void supports() {
    }
    public void supports(String platform){
        if (platform.equals("Facebook")){
            System.out.printf("%s %s makes publicity through Facebook.\n" +
                "%n", getFirstName(), getLastName());}
        if (platform.equals("TV")){
            System.out.printf("%s %s makes publicity through TV\n" +
                "%n", getFirstName(), getLastName());}
        if (platform.equals("street")){
            System.out.printf("%s %s makes publicity in the street.\n" +
                "%n", getFirstName(), getLastName());}
    }
}