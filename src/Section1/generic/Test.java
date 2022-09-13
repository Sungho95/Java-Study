package Section1.generic;

//class Cellphone {
//    Cellphone() {
//        System.out.println("Cellphone");
//    }
//}
//
//class Galaxy extends Cellphone {
//    Galaxy() {
//        System.out.println("Galaxy");
//    }
//}
//
//class Car {
//
//}
//
//class Test<T extends Cellphone> {
//    private T model;
//
//    public T getModel() {
//        return model;
//    }
//
//    public void setModel(T model) {
//        this.model = model;
//    }
//
//    public static void main(String[] args) {
//        Test<Cellphone> cellphone1 = new Test<>();
//        Test<Galaxy> cellphone2 = new Test<>();
//
//        cellphone1.setModel(new Cellphone());
//        cellphone2.setModel(new Galaxy());
////        Test<Car> car = new Test<Car>;
//    }
//}

//class Cellphone {
//
//}
//
//class Galaxy extends Cellphone {
//    Galaxy() {
//        System.out.println("Galaxy");
//    }
//}
//
//class Test<T> {
//    private T model;
//
//    public T getModel() {
//        return model;
//    }
//
//    public void setModel(T model) {
//        this.model = model;
//    }
//
//    public static void main(String[] args) {
//        Test<Cellphone> cellphone = new Test<>();
//        cellphone.setModel(new Galaxy());
//    }
//}

interface Cellphone {

}

//class Galaxy implements Cellphone {
//    Galaxy() {
//        System.out.println("갤럭시");
//    }
//}
//
//class IPhone implements Cellphone {
//    IPhone() {
//        System.out.println("아이폰");
//    }
//}
//
//// Cellphone 클래스의 하위 클래스만 지정할 수 있음
//class Test<T extends Galaxy> {
//    private T model;
//
//    public T getModel() {
//        return model;
//    }
//
//    public void setModel(T model) {
//        this.model = model;
//    }
//
//    public static void main(String[] args) {
//        Test<Galaxy> galaxy = new Test<>();
////        Test<IPhone> iphone = new Test<>();
//
//        galaxy.setModel(new Galaxy());
////        iphone.setModel(new IPhone());
//    }
//}