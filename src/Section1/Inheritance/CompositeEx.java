package Section1.Inheritance;

public class CompositeEx {
    int number;
    Address address;

    public CompositeEx(int number, Address address){
        this.number = number;
        this.address = address;
    }

    void printInfo() {
        System.out.println(number + ": " + address.city + ", " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "대한민국");
        Address address2 = new Address("부산", "대한민국");

        CompositeEx result1 = new CompositeEx(1, address1);
        CompositeEx result2 = new CompositeEx(2, address2);

        result1.printInfo();
        result2.printInfo();
    }
}

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}