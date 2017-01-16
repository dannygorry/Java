import java.util.Scanner;
public class GreenBottles {
    private static int bottles;
    private static int lessBottle;
    private static int failBottle;
    private static int bottlesLoop;
    private static String phrase = " green bottles standing on the wall,";
    private static String phrase2 = "And if 1 green bottle should accidently fall,";
    private static String phrase3 = "There’ll be ";
    private static String phrase4 = " green bottles standing on the wall.";

    public static void tenGreenBottles() {
        bottles = 10;
        for (int i = -6; i <= bottles; i++) {
            lessBottle = bottles - 1;
            System.out.println(bottles + phrase);
            System.out.println(bottles + phrase);
            System.out.println(phrase2);
            System.out.println(phrase3 + lessBottle + phrase4);
            bottles = bottles - 1;
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + phrase);
        System.out.println(bottles + phrase);
        System.out.println(phrase2);
        System.out.println(phrase3 + lessBottle + phrase);
    }
    public static void xGreenBottles(int x) {
        bottles = x;
        for (int i = 0-(x-3); i <= bottles; i++) {
            bottlesLoop = bottles--;
            lessBottle = bottles;
            System.out.println(bottlesLoop + phrase);
            System.out.println(bottlesLoop + phrase);
            System.out.println(phrase2);
            System.out.println(phrase3 + lessBottle + phrase);
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + phrase);
        System.out.println(bottles + phrase);
        System.out.println(phrase2);
        System.out.println(phrase3 + lessBottle + phrase);
    }
    public static void xyGreenBottles(int x, int y) {
        bottles = x;
        failBottle =y;
        for (int i = -(x/2)+((y*y));i <= bottles; i++) {
            bottlesLoop = bottles;
            lessBottle = bottles - failBottle;
            System.out.println(bottlesLoop + phrase);
            System.out.println(bottlesLoop + phrase);
            System.out.println("And if " +failBottle + " green bottle should accidently fall,");
            System.out.println(phrase3 + lessBottle + phrase);
            bottlesLoop = bottles-=failBottle;
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + phrase);
        System.out.println(bottles + phrase);
        System.out.println("And if " +failBottle + " green bottle should accidently fall,");
        System.out.println(phrase3 + lessBottle + phrase);
    }
}