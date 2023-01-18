package ee.bcs.javaproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Lesson3HardController {
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    int count = 0;

    @GetMapping("rng/{x}")
    public String guessNumber(@PathVariable("x") int x) {
        count++;
        if (x > randomNumber) {
            return "Number peab olema v2iksem. Oled arvanud " + count + " korda!";
        } else if (x < randomNumber) {
            return "Number peab olema suurem. Oled arvanud " + count + " korda!";
        } else {
            return "6ige number! Sul läks " + count + " korda!";
        }
    }
}


/*
    // http://localhost:8080/abs/2
    @GetMapping("abs/{a}")
    public int abs(@PathVariable("a") int a){
        return Lesson1.abs(a);
    }
 */
