package ee.bcs.javaproject.controller;

import ee.bcs.javaproject.tasks.Lesson1;
import ee.bcs.javaproject.tasks.Lesson2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostMapping("sample2/employee/{name}")
    public void createEmployee123(@PathVariable String name) {
        String sql = "INSERT INTO employee (name) VALUES (:employeeName:)";
        Map paraMap = new HashMap();
        paraMap.put("employeeName", name);
        jdbcTemplate.update(sql, paraMap);
    }


    // http://localhost:8080/test
    @GetMapping("test") // @PostMapping / @PutMapping / @DeleteMapping
    public String helloWorld() {
        return "Hello World!";
    }


    @GetMapping("sample/exception2")
    public String test2(){
        Integer balance = null;
        return balance.toString();
    }

    private void depositMoney(){

    }


        /*
    @GetMapping("employee/{id}")
    public String getEmployee(@PathVariable("id") Integer employeeId) { // PathVariable ^ employee/{id}
        return "Employee: " + employeeId;
    }*/

    // http://localhost:8080/min/2/6
    @GetMapping("min/{a}/{b}")
    public int min(@PathVariable("a") int a, @PathVariable("b") int b) {
        return Lesson1.min(a, b);
    }

    // http://localhost:8080/max/2/6
    @GetMapping("max/{a}/{b}")
    public int max(@PathVariable("a") int a, @PathVariable("b") int b) {
        return Lesson1.max(a, b);
    }

    // http://localhost:8080/abs/2
    @GetMapping("abs/{a}")
    public int abs(@PathVariable("a") int a) {
        return Lesson1.abs(a);
    }

    // http://localhost:8080/even/2
    @GetMapping("even/{a}")
    public static boolean isEven(@PathVariable("a") int a) {
        return Lesson1.isEven(a);
    }

    // http://localhost:8080/min3/2/6/4
    @GetMapping("min3/{a}/{b}/{c}")
    public int min3(@PathVariable("a") int a, @PathVariable("b") int b, @PathVariable("c") int c) {
        return Lesson1.min3(a, b, c);
    }

    // http://localhost:8080/max3/2/6/4
    @GetMapping("max3/{a}/{b}/{c}")
    public int max1(@PathVariable("a") int a, @PathVariable("b") int b, @PathVariable("c") int c) {
        return Lesson1.max1(a, b, c);
    }

    // http://localhost:8080/generateArray?n=10
    @GetMapping("generateArray")
    public int[] generateArray(@RequestParam("n") int n) {
        return Lesson2.generateArray(n);
    }

    // http://localhost:8080/decreasingArray?n=10
    @GetMapping("decreasingArray")
    public int[] decreasingArray(@RequestParam("n") int n) {
        return Lesson2.decreasingArray(n);
    }

    // http://localhost:8080/yl3?n=3
    @GetMapping("yl3")
    public int[] yl3(@RequestParam("n") int n) {
        return Lesson2.yl3(n);
    }

}
