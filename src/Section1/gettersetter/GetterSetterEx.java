package Section1.gettersetter;

public class GetterSetterEx {
    public static void main(String[] args) {
        Info me = new Info();
        me.setName("홍길동");
        me.setAge(25);
        me.setJob("웹 개발자");

        String name = me.getName();
        int age = me.getAge();
        String job = me.getJob();

        System.out.println(name + " " + age + " " + job);
    }
}

class Info {
    private String name;
    private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}