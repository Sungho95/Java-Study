package Section1.ClassAndObject;

class Car {
    // 필드(속성) 선언
    public String model;
    public String color;
    public int price;


    // 생성자(객체의 선언 및 초기화 방법)
    // 클래스이름 생성할이름 = new 클래스이름();
    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // 메서드(행위) 선언
    int powerOn() {
        System.out.println("시동을 켠다.");
        return 5;
    }

    void accelerate() {
        System.out.println("앞으로 간다.");
    }

    void stop() {
        System.out.println("멈춘다.");
    }

    void printName() {
        System.out.println("Hong Gildong");
    }

    public static void main(String[] args) {
        Car bmw = new Car("c class", "black", 1000);

        System.out.println("이 차의 모델은"+bmw.model);
        System.out.println("이 차의 색상은"+bmw.color);
        System.out.println("이 차의 가격은"+bmw.price);

        System.out.println(bmw.powerOn());
        bmw.accelerate();
        bmw.stop();
    }

}