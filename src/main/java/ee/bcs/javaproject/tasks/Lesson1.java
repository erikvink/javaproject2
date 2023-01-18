package ee.bcs.javaproject.tasks;


// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Miinimum 2, 4 on: " + min(2, 4));
        System.out.println("Miinimum 5, 3 on: " + min(5, 3));
        System.out.println("Max 3, 7 is: " + max(3, 7));
        System.out.println("Absoluut väärtus on: " + abs(-4));
        System.out.println("ayyyyyyy: " + max1(4, 5, 7));
        System.out.println("isEven ve? " + isEven(4));
    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a <= 0) {
            return -a;
        } else return a;
    }


    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max1(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO
//  Tagasta string mille väärtus oleks "\"\\""
//  Trüki muutuja sisu välja
    public static String someString() {
        return "\"\\\"\\\\\"\"";
    }

}
