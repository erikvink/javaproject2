package ee.bcs.javaproject.tasks;

import com.sun.tools.javac.Main;

public class LessonB {

    public static void main(String[] args) {
        yl1();
        yl2();
        yl3();
        yl4(5);
        yl5(10);
        yl6(8);
        System.out.println("\n" + "checkOrder yl7"); // vahe
        System.out.println(checkOrder(3, 2, 1));
        System.out.println("\n" + "checkEqual yl8"); // vahe
        System.out.println(checkEqual(2, 2, 2));
        System.out.println("\n" + "isSmall yl9"); // vahe
        System.out.println(isSamll(2000));
        System.out.println("\n" + "testMath yl10"); // vahe
        System.out.println(testMath(10, 5, 3));
        System.out.println("\n" + "testStuff yl11"); // vahe
        System.out.println(testStuff(1, 2, 3, 4, 5, 6, 7));
        System.out.println("\n" + "userValidation yl12"); // vahe
        System.out.println(userValidation(true, false, true));

    }

    // TODO trüki numbrid 1 -> 10
    public static void yl1() {
        System.out.println("\n" + "yl1"); // vahe
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // TODO trüki numbrid 10 -> 1
    public static void yl2() {
        System.out.println("\n" + "yl2"); // vahe
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // TODO trüki paaris numberid 2->20
    public static void yl3() {
        System.out.println("\n" + "yl3"); // vahe
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    // TODO trüki numbrid 1 -> n
    public static void yl4(int n) {
        System.out.println("\n" + "yl4"); // vahe
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // TODO trüki numbrid n -> 1
    public static void yl5(int n) {
        System.out.println("\n" + "yl5"); // vahe
        for (int i = 1; n >= i; n--) {
            System.out.println(n);
        }
    }

    // TODO trüki paaris numberid 2->n
    public static void yl6(int n) {
        System.out.println("\n" + "yl6"); // vahe
        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }

    public static String checkOrder(int a, int b, int c) { // static oli puudu??
        // Print "increasing" if c > b > a
        // Print "decreasing" if c < b < a
        // Print "neither" if none of them is true

        if (c > b && b > a) {
            return "increasing";
        } else if (c < b && b < a) {
            return "decreasing";
        } else {
            return "neither";
        }
    }

    public static boolean checkEqual(int a, int b, int c) { // static oli puudu??
        // return true if all 3 parameters are the same
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSamll(int a) {
        // return true if the absolute number of a is smaller than 1000
        if (a < 1000 && -a < 1000) {
            return true;
        } else {
            return false;
        }
    }

    // TODO korruta omavahel x ja z ning liida sellele y ja z korrutis
    public static int testMath(int x, int y, int z) {
        int a = x * z;
        int b = y * z;
        return a + b;
    }

    // TODO kui mitu paaris arvu on sisendites
    public static int testStuff(int a, int b, int c, int d, int e, int f, int g) { // for loop kuidagi? kuidas int parameetrid kokku saada üheks?
        int evenNumbers = 0;
        {
            if (a % 2 == 0)
                evenNumbers++;
        }
        {
            if (b % 2 == 0)
                evenNumbers++;
        }
        {
            if (c % 2 == 0)
                evenNumbers++;
        }
        {
            if (d % 2 == 0)
                evenNumbers++;
        }
        {
            if (e % 2 == 0)
                evenNumbers++;
        }
        {
            if (f % 2 == 0)
                evenNumbers++;
        }
        {
            if (g % 2 == 0)
                evenNumbers++;
        }
        return evenNumbers;
    }

    public static boolean userValidation(boolean emailValid, boolean telephoneValid, boolean addressValid) {
        // tagasta true, kui muutuja addressValid on tõene ja vähemalt üks (emailValid või telephoneValid) on tõene

        if (emailValid == false && telephoneValid == false) {
            return false;
        } else if (addressValid != false) {
            return true;
        } else {
            return false;
        }
    }
}
