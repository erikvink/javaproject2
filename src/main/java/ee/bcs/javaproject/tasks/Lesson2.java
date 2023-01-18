package ee.bcs.javaproject.tasks;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArray(5)));
        System.out.println(Arrays.toString(decreasingArray(6)));
        System.out.println(Arrays.toString(yl3(6)));
        System.out.println(sampleArray());
        // TODO siia saab kirjutada koodi testimiseks
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: sisend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            array[i] = n - i; // WTF?
        }
        return array;
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] array = new int[n];
        for (int i = 0; i != n; i++){
            array[i] = n - 3;
        }
        return array;
    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public static int[] sampleArray() {
        int[] array = new int[5];
        for (int i = 1; i < 5; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}