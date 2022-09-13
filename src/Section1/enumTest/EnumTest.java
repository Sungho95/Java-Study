package Section1.enumTest;

import java.util.Arrays;

enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }

enum Seasons2 {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
public class EnumTest {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SUMMER;
        System.out.println(seasons);
        System.out.println(seasons.name());
        System.out.println(seasons.ordinal());

        switch (seasons) {
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case AUTUMN:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }

        Seasons seasons1 = Seasons.SPRING;
        Seasons seasons2 = Seasons.WINTER;

        System.out.println(seasons1.compareTo(seasons2));

        Seasons seasons3 = Seasons.valueOf("SUMMER");
        System.out.println(seasons3);

        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }

        System.out.println(Arrays.toString(Seasons.values()));
        System.out.println(Seasons.values().length);
    }
}