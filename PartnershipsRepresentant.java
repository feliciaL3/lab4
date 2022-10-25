public class PartnershipsRepresentant implements AnotherWorkers {
    private String companyname;
    private int Number_Employee;
    private String FirstName;
    private String LastName;

    public PartnershipsRepresentant(String FirstName, String LastName){
        this.FirstName= FirstName;
        this.LastName= LastName;
    }

    public String getCompanyName() {
        return companyname;
    }
    public int getNumber_Employee() {
        return Number_Employee;
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
    public void setCompanyName(String companyname) {
        this.companyname = companyname;
    }
    public void setNumber_Employee(int Number_Employee) {
        this.Number_Employee = Number_Employee;
    }

    
    public void colaborate() {
        System.out.println(companyname + " wants to colaborate.\n");
    }
}