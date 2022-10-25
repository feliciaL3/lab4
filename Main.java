import java.util.*;
public class Main {
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";     // RED
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE 
    public static void main(String[] args) {
        System.out.println(RED+ "\n========================"+ RESET);
        System.out.println(ANSI_RED_BACKGROUND + "Go beyond with "+ TaxiCompany.CompanyName + "!"+ RESET);
        System.out.println(RED+ "\n========================"+ RESET);

        // create customer service representant objects
        CustomerServiceRepresentant CustomerServiceRepresentant1 = new CustomerServiceRepresentant("Gode", "Brown");
        CustomerServiceRepresentant CustomerServiceRepresentant2 = new CustomerServiceRepresentant("Sasha", "Slet");

        List <CustomerServiceRepresentant> CustomerServiceRepresentantArray = new ArrayList<>();
        CustomerServiceRepresentantArray.add(CustomerServiceRepresentant1);
        CustomerServiceRepresentantArray.add(CustomerServiceRepresentant2);
        // create driver objects
        Driver driver1 = new Driver("Vasile", "Seen", 24, 2, true, true,false,3 );
        Driver driver2 = new Driver("Taylor", "Teamt", 33, 5,true,false,true,8);
        Driver driver3 = new Driver("John", "Carl",21, 1, true,false,true,1);
        Driver driver4 = new Driver("Sam", "Black",50,21,true,true,true,23);
  
        List <Driver> DriverArray = new ArrayList<>();
        DriverArray.add(driver1);
        DriverArray.add(driver2);
        DriverArray.add(driver3);
        DriverArray.add(driver4);

       // List<Integer> skillArray = new ArrayList<>();
        List<String> nameArray = new ArrayList<>();
        nameArray.add(driver1.getFirstName());
        nameArray.add(driver2.getFirstName());
        nameArray.add(driver3.getFirstName());

         // create car objects
         Car car1 = new Car("Renault", "hybrid", "blue");
         Car car2 = new Car("Audi", "electric", "black");
         Car car3 = new Car("Toyota", "electric" , "blue");
         Car car4 = new Car("Dacia", "hybrid", "white");
        
         List <Car> CarArray = new ArrayList<>();
         CarArray.add(car1);
         CarArray.add(car2);
         CarArray.add(car3);
         CarArray.add(car4);

        // create passenger objects
        Passenger passenger1 = new Passenger("Max", "Bont", 05435343);
        Passenger passenger2 = new Passenger("Mike", "Corn", 035243234);

        
        // choose passenger to get taxi
        Scanner passengerS = new Scanner(System.in);
        String  passengerN;
        System.out.println(WHITE_BOLD + "In what situation is the customer?" + RESET );
        System.out.println("1. Customer is calling a driver ");
        System.out.println("2. Customer is calling a driver, but driver is busy");
        System.out.println("3. Customer is calling a driver, and driver is on the way");

        List <Passenger> PassengerArray = new ArrayList<>();
        PassengerArray.add(passenger1);
        PassengerArray.add(passenger2);
       // PassengerArray.add(passenger3); 
        //customer is calling
        passengerN = passengerS.nextLine();
        if (passengerN.equals("1")) { 
            PassengerArray.get(0).calls(CarArray.get(0).toString(), CarArray.get(0).getcar_type(), CarArray.get(0).getcar_model());
            CustomerServiceRepresentantArray.get(0).calls(PassengerArray.get(0).toString(), PassengerArray.get(0).getPhone_number(), true);
            System.out.println("Driver " + DriverArray.get(0).getFirstName() + " is on the way to the customer");
            System.out.println("Driver " + DriverArray.get(0).getFirstName() + " is driving a "+ CarArray.get(0).getcar_model() +" " + CarArray.get(0).getcar_color()+ ".");

        }
        //customer calling, driver busy
        if ("2".equals(passengerN)) { 
            PassengerArray.get(0).calls(CarArray.get(0).toString(), CarArray.get(0).getcar_type(), CarArray.get(0).getcar_model());
            CustomerServiceRepresentantArray.get(0).calls(PassengerArray.get(0).toString(), PassengerArray.get(0).getPhone_number(), false);
            System.out.println(DriverArray.get(0).getFirstName() + " is in traffic with another customer.");
            System.out.println("Driver " + DriverArray.get(0).getFirstName() + " is driving a "+ CarArray.get(0).getcar_model() +" " + CarArray.get(0).getcar_color()+ ".");

        }
         //customer calling, driver on the way
         if ("3".equals(passengerN)) { 
            PassengerArray.get(0).calls(CarArray.get(0).toString(), CarArray.get(0).getcar_type(), CarArray.get(0).getcar_model());
            CustomerServiceRepresentantArray.get(0).calls(PassengerArray.get(0).toString(), PassengerArray.get(0).getPhone_number(), false);
            System.out.println(DriverArray.get(0).getFirstName() + " is on the way .");
            System.out.println("Driver " + DriverArray.get(0).getFirstName() + " is driving a "+ CarArray.get(0).getcar_model() +" " + CarArray.get(0).getcar_color()+ ".");

        }
           


        Scanner customer = new Scanner(System.in);
        String  customerType;
        System.out.println(WHITE_BOLD+ "Select customer situation " + RESET);
        System.out.println("1. Customer is alone");
        System.out.println("2. Customer is drunk");
        System.out.println("3. Customer has kids");
        System.out.println("4. Customer is with 4 friends");
        System.out.println("5. Customer needs a car urgently");

        customerType = customer.nextLine();
        if ("1".equals(customerType)){
            DriverArray.get(0).works();
            CarArray.get(0).isMoving();
            DriverArray.get(1).works();
            CarArray.get(1).isMoving();
            DriverArray.get(2).works();
            CarArray.get(2).isMoving();
        }
        if ("2".equals(customerType)) {
            DriverArray.get(0).works();
            CarArray.get(0).isMoving();
            DriverArray.get(1).isOnBreak();
            CarArray.get(1).isParked();
            DriverArray.get(2).works();
            CarArray.get(2).isFull();
        }
        if ("3".equals(customerType)) {
            DriverArray.get(0).works();
            CarArray.get(0).isMoving();
            DriverArray.get(1).isWaiting();
            CarArray.get(1).isParked();
            DriverArray.get(2).works();
            CarArray.get(2).isMoving();
        }
        if ("4".equals(customerType)) {
            DriverArray.get(0).works();
            CarArray.get(0).isParking();
            DriverArray.get(0).works();
            CarArray.get(1).isFull();
            DriverArray.get(0).works();
            CarArray.get(2).isinTrafficJam();
        }
        if ("5".equals(customerType)) {
            DriverArray.get(0).works();
            CarArray.get(0).isinTrafficJam();
            DriverArray.get(0).works();
            CarArray.get(1).isinTrafficJam();
            DriverArray.get(0).works();
            CarArray.get(2).isParking();
        }

        // create humanresreprest object
        HumanResourcesRepresentant HumanResourcesRepresentant = new HumanResourcesRepresentant("Maria", "Moon", true);
        HumanResourcesRepresentant.hiring();
     
         // see which cars are owned by drivers
         Scanner driverC = new Scanner(System.in);
         String  driverCar;
         System.out.println(WHITE_BOLD+"Choose driver to see which car he owns:"+ RESET );
         System.out.println("1. Driver1");
         System.out.println("2. Driver2");
         System.out.println("3. Driver3");
         System.out.println("4. Driver4");
         System.out.println("5. All");

         driverCar = driverC.nextLine();
         if (driverCar.equals("1")) {
             driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getcar_type(), car1.getcar_color());
         }
         if ("2".equals(driverCar)) {
             driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getcar_type(), car2.getcar_color());
         }
         if ("3".equals(driverCar)) {
             driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getcar_type(), car3.getcar_color());
         }
         if ("4".equals(driverCar)) {
             driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getcar_type(), car1.getcar_color());
             driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getcar_type(), car2.getcar_color());
             driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getcar_type(), car3.getcar_color());
         }
         if ("5".equals(driverCar)) {
            driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getcar_type(), car1.getcar_color());
            driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getcar_type(), car2.getcar_color());
            driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getcar_type(), car3.getcar_color());
            driver4.isDriving(String.valueOf(car4), car4.getcar_model(), car4.getcar_type(), car4.getcar_color());
        }
  

        // mechanic
        Mechanic mechanic1 = new Mechanic("John", "Bon", 40, 03232325);
        Mechanic mechanic2 = new Mechanic(" Ion", "Bonce", 41, 299325);

        List <Mechanic> MechanicArray = new ArrayList<>();
        MechanicArray.add(mechanic1);
        MechanicArray.add(mechanic2);
        // scenarios about broken cars
        Scanner mechanicS = new Scanner(System.in);
        String mechanicP;
        for(String s : Arrays.asList("\n", "Select  car situation:", 
                "1. Car is new and  works at its best",
                "2. Car needs to be repaired ", 
                "3. Cars are cracked", 
                "4. All cars are broken, mechanics are free and ready to work",
                "5. All cars are broken, mechanics cant't repair")) {
            System.out.println(s);
        }
        mechanicP = mechanicS.nextLine();
        if (mechanicP.equals("1")) {
            CarArray.get(0).isFunctional(true);
            MechanicArray.get(0).isOnBreak();
        }
        if (mechanicP.equals("2")) {
            CarArray.get(1).isFunctional(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getcar_model(),CarArray.get(1).getcar_type());

        }
        if (mechanicP.equals("3")) {
            CarArray.get(0).isFunctional(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(0)),
                    CarArray.get(0).getcar_model(),CarArray.get(0).getcar_type());
            CarArray.get(1).isFunctional(false);
            MechanicArray.get(1).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getcar_model(),CarArray.get(1).getcar_type());
        }
        if (mechanicP.equals("4")) {
            CarArray.get(0).isFunctional(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(0)),
                    CarArray.get(0).getcar_model(),CarArray.get(0).getcar_type());
            CarArray.get(1).isFunctional(false);
            MechanicArray.get(1).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getcar_model(),CarArray.get(1).getcar_type());
            CarArray.get(2).isFunctional(false);
            System.out.println("No available mechaninc  to repair it.");
        }
        if (mechanicP.equals("5")) {
            CarArray.get(0).isFunctional(false);
            CarArray.get(1).isFunctional(false);
            CarArray.get(2).isFunctional(false);
            MechanicArray.get(0).isOnBreak();
            MechanicArray.get(1).isOnBreak();
            System.out.println("We arent working right now");
        }
        driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getcar_type(),car1.getcar_color());
        driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getcar_type(),car1.getcar_color());
        driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getcar_type(),car1.getcar_color()); 

         
        // accountant
        Accountant Accountant = new Accountant("Mya", "Jhonson", "Salary");
        Accountant.counts();

        
         

        // acountant scenarios
        Accountant Accountant1 = new Accountant("Maria","Bewn","Salary");
        Accountant Accountant2 = new Accountant("Bianca","Mich","SalaryAwards");
        List <Accountant> AccountantArray = new ArrayList<>();
        AccountantArray.add(Accountant1);
        AccountantArray.add(Accountant2);
        Scanner bus = new Scanner(System.in);
        String  busType;
        System.out.println("\n");
        System.out.println(WHITE_BOLD+"Select accountant situation:"+ RESET);
        System.out.println("1. Salaries need to be set");
        System.out.println("2. Salary awards  needs to be set");
        System.out.println("3. Salaries and salary awards  have to be ready soon");
        System.out.println("4. Salaries and salary awards are ready");
        busType = bus.nextLine();
        if (busType.equals("1")) {
            AccountantArray.get(0).counts();
            System.out.println("1. Salaries need to be set and the accountant of the company soon will set it.");
        }
        if (busType.equals("2")) {
            AccountantArray.get(1).counts();
        }
        if (busType.equals("3")) {
            AccountantArray.get(0).counts();
            AccountantArray.get(1).counts();
        }
        if (busType.equals("4")) {
            System.out.println("Salaries and salaries awards are ready :");
            AccountantArray.get(0).isready();
            AccountantArray.get(1).isready();
        }
    

    Scanner customerservice = new Scanner(System.in);
    String  customerserviceType;
    System.out.println(WHITE_BOLD + "What is  the Customer Service Representant doing?" + RESET );
    System.out.println("1. Customer Service Representant is calling a client ");
    System.out.println("2. Customer Service Representant can help you with wour problem with our taxy company");
    customerserviceType = customerservice.nextLine();
    if ("1".equals(customerserviceType)){
        CustomerServiceRepresentantArray.get(0).calls();

    }
    if ("2".equals(customerserviceType)) {
        CustomerServiceRepresentantArray.get(0).isHelping();
    }

   
    // director obj
    Director director = new Director("Tom", "Hike");
    Director associateddirector = new Director("Galina", "Benjams");

    // director method
    Scanner dir = new Scanner(System.in);
    String dirType;


    
    System.out.println( WHITE_BOLD +"Select situation:"+ RESET);
    System.out.println("1. Director owns the taxi company");
    System.out.println("2. Director is in another country and associated director is the main director");
    dirType=dir.nextLine();

    if (dirType.equals("1")) {
        director.ownsABusiness();
    }
    if (dirType.equals("2")) {
        director.isLeaving();
        System.out.println("Associated director Maria Ionache is here");
        associateddirector.ownsABusiness();
    } 
    }

       // marketolog sceanarious
       /* 
       Marketolog marketolog1 = new Marketolog ("Vasile","Goale" );
        Marketolog marketolog2 = new Marketolog("Mike","Kalin" );
        Marketolog marketolog3 = new Marketolog ("Richard","Penny" );
        List <Marketolog > MarketologArray = new ArrayList<>();
        MarketologArray.add(marketolog1);
        MarketologArray.add(marketolog2);
        MarketologArray.add(marketolog3);
        Scanner mark = new Scanner(System.in);
        String  markType;
        System.out.println("\n");
        System.out.println("Select scenario:");
        System.out.println("1 publicity on facebook");
        System.out.println("2 publicity on TV");
        System.out.println("3 publicity on street");
        System.out.println("4 publicity everywhere");
        markType = mark.nextLine();
        if (markType.equals("1")){
            MarketologArray.get(0).supports("Facebook");
        }
        if (markType.equals("2")){
            MarketologArray.get(1).supports("TV");
        }
        if (markType.equals("3")){
            MarketologArray.get(2).supports("street ");
        }
        if (markType.equals("4")){
            MarketologArray.get(0).supports("Facebook");
            MarketologArray.get(1).supports("TV");
            MarketologArray.get(2).supports("street");
        } 
    */

}
