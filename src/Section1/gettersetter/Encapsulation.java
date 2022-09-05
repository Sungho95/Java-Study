package Section1.gettersetter;

public class Encapsulation {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Main{
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("홍길동");
		e.setAge(26);

		System.out.println(e.getName() + " " + e.getAge() + "세");
	}
}