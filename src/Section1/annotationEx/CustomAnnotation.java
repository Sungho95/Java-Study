package Section1.annotationEx;

import Section1.Inheritance.PersonEx;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    int age() default 20;
    String name();
}

@CustomAnnotation(name = "홍길동")
class MyInfo {
}

class PrintMyInfo {
    public static void main(String[] args) {
        PrintMyInfo myInfo = new PrintMyInfo();
        myInfo.print(new MyInfo());

    }

    void print(MyInfo myInfo) {
        Annotation[] annotations = MyInfo.class.getDeclaredAnnotations();
        for(Annotation i : annotations) {
            if (i instanceof CustomAnnotation) {
                CustomAnnotation customAnnotation = (CustomAnnotation) i;
                System.out.println(customAnnotation.name() + " " + customAnnotation.age());
            }
        }
    }
}