public interface PhoneOwner extends Person {

    void calls(String passenger, int phone_number);

    void calls(String car, String car_type , String car_color);
}