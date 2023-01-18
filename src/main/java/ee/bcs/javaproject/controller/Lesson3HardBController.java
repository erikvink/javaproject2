package ee.bcs.javaproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Lesson3HardBController {

    int min = 0; // väikseim lubatud väärtus
    int max = 99; // suurim lubatud väärtus

    int count = 0;

    @GetMapping("rng2/{x}")
    public String guessNumber2(@PathVariable("x") int x) {

        count++;

        int smallerNrCount = nrCount(min, x - 1);
        int biggerNrCount = nrCount(x + 1, max);

        if (min == max && x == min) {
            return "Arvasid ära " + count + " korraga";
        } else if (smallerNrCount >= biggerNrCount) {
            return "Sisestasid liiga suure arvu\n" + min + " " + max + " " + smallerNrCount + " " + biggerNrCount;
        } else {
            return "Sisestasid liiga väikse arvu\n" + min + " " + max + " " + smallerNrCount + " " + biggerNrCount;
        }
    }

    private static int nrCount(int min, int i) {
        return i - min + 1;

    }

}
