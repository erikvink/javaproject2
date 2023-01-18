package ee.bcs.javaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    // 14.12.2022 sql stuff
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostMapping("sample3/employee/{name}/{address}")
    public void createEmployee(@PathVariable String name, @PathVariable String address) {
        String sql = "INSERT INTO employee (name, address) VALUES (:employeeName, :employeeAddress)";
        Map paraMap = new HashMap();
        paraMap.put("employeeName", name);
        paraMap.put("employeeAddress", address);
        jdbcTemplate.update(sql, paraMap);
    }

    @GetMapping("sample3/employee/{id}")
    public String getName(@PathVariable Integer id) {
        String sql = "SELECT name FROM employee where id = :id";
        Map paraMap = new HashMap();
        paraMap.put("id", id);
        return jdbcTemplate.queryForObject(sql, paraMap, String.class);

    }

    @GetMapping("sample3/employees")
    public List<EmployeeData> getEmployees2(){
        String sql = "SELECT * FROM employee";
        List<EmployeeData> employees = jdbcTemplate.query(sql, new HashMap<>(), new BeanPropertyRowMapper<>(EmployeeData.class));
        employees.get(0).getName();
        return employees;
    }

    // 14.12.2022 sql stuff
    
    @GetMapping("employeeTestData")
    public List<Employee> getEmployee() {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee();
        employee.setFirstName("Tiit");
        employee.setLastName("K22pa");
        employee.setAge(25);

        employeeList.add(employee);

        Employee employee2 = new Employee();
        employee2.setFirstName("Ants");
        employee2.setLastName("Mets");
        employee2.setAge(35);

        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Tiiu");
        employee3.setLastName("Höövel");
        employee3.setAge(27);

        employeeList.add(employee3);


        // Tiidu autod
        List<Car> carList = new ArrayList<>();

        Car car = new Car();
        car.setBrand("BMW");
        car.setRegNr("123LOL");

        carList.add(car);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setRegNr("123AYO");

        carList.add(car2);

        Car car3 = new Car();
        car3.setBrand("Volks");
        car3.setRegNr("111OOO");

        carList.add(car3);

        employee.setCars(carList);

        // Antsu autod

        List<Car> carList2 = new ArrayList<>();

        Car car4 = new Car();
        car4.setBrand("Hummer");
        car4.setRegNr("123III");

        carList2.add(car4);

        Car car5 = new Car();
        car5.setBrand("Mercedes");
        car5.setRegNr("MESA");

        carList2.add(car5);

        Car car6 = new Car();
        car6.setBrand("Volks");
        car6.setRegNr("055OSS");

        carList2.add(car6);

        employee2.setCars(carList2);

        // Tiiu autod

        List<Car> carList3 = new ArrayList<>();

        Car car7 = new Car();
        car7.setBrand("Firebird");
        car7.setRegNr("151k15a");

        carList3.add(car7);

        Car car8 = new Car();
        car8.setBrand("Opel");
        car8.setRegNr("313");

        carList3.add(car8);

        Car car9 = new Car();
        car9.setBrand("Lada");
        car9.setRegNr("111ooo");

        carList3.add(car9);

        employee3.setCars(carList3);

        return employeeList;

    }

    // eraldi mant kinda
    List<Employee> employeeList = new ArrayList<>();
    // employeede vaatamimne

    @GetMapping("employee")
    public List<Employee> getEmployees() {
        return employeeList;
    }

    // employee lisamine

    @PostMapping("employee")
    public void createEmployee(@RequestBody Employee employee) {

        employeeList.add(employee);
    }

    // id põhjal employee leidmine

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeList.get(id);
    }

    // employeele lisamine

    @PutMapping("employee/{id}")
    public void updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        employeeList.set(id, employee);
    }

    // kustutamine

    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeList.remove(id);
    }
}



