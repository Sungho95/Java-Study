package Section1.Polymorphism;

public class PolyEx {
    public static void main(String[] args) {
        Customer me = new Customer();
        me.buyCoffee(new Americano());
        me.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액: " + me.money);
    }
}

class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano() {
        super(4000); // 상위 메서드 생성자 호출
    }
    // Object 클래스 toString() 메서드 오버라이딩
    public String toString() {
        return "아메리카노";
    }
}

class CaffeLatte extends Coffee {
    public CaffeLatte() {
        super(5000);
    }
    // Object 클래스 toString() 메서드 오버라이딩
    public String toString() {
        return "카페라떼";
    }
}

class Customer {
    int money = 50000;

    // 커피 구매 메서드(다형성 활용)
    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= coffee.price;
        System.out.println(coffee + "를 구매하였습니다.");
    }

	/* 아메리카노, 카페라떼 구매 메서드를 따로 구현하지 않아도 됨
	void buyCoffee(Americano americano) {
		money -= americano.price;
	}

	void buyCoffee(CaffeLatte caffeLatte) {
		money -= caffeLatte.price;
	} */
}