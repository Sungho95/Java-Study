package Section1.abstraction;

//// 식당 손님
//class ResCustomer {
//    public String resCustomer;
//
//    public void setResCustomer(String resCustomer) {
//        this.resCustomer = resCustomer;
//    }
//}
//
//// ResCustomer 클래스로부터 단골손님 A와 B 상속
//class ResCustomerA extends ResCustomer {
//}
//
//class ResCustomerB extends ResCustomer {
//}
//
//// 식당 사장
//class ResOwner {
//    public void giveFood(ResCustomerA resCustomerA) {
//        System.out.println("손님 A에게 김치찌개를 준다");
//    }
//
//    public void giveFood(ResCustomerB resCustomerB) {
//        System.out.println("손님 B에게 제육볶음을 준다");
//    }
//}
//
//// 음식 주문
//public class OrderFood {
//    public static void main(String[] args) {
//        ResOwner owner = new ResOwner();
//        ResCustomerA a = new ResCustomerA();
//        ResCustomerB b = new ResCustomerB();
//
//        owner.giveFood(a);
//        owner.giveFood(b);
//    }
//}

interface ResCustomer {
    String getOrder();
}

class ResCustomerA implements ResCustomer {
    public String getOrder() {
        return "손님 A에게 김치찌개를 준다";
    }
}

class ResCustomerB implements ResCustomer {
    public String getOrder() {
        return "손님 B에게 제육볶음을 준다";
    }
}

class ResOwner {
    public void giveFood(ResCustomer resCustomer) {
        System.out.println(resCustomer.getOrder());
    }
}

public class OrderFood {
    public static void main(String[] args) {
        ResOwner owner = new ResOwner();
        ResCustomerA a = new ResCustomerA();
        ResCustomerB b = new ResCustomerB();

        owner.giveFood(a);
        owner.giveFood(b);
    }
}