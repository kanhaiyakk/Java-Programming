package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Employee -> name,age,salary,gender List<Employee> employeeList; give me list of name of those employee
// whose gender is female and salary greater than 30000 INR List<String> employeename;
class Employee {
    private String name;
    private int age;
    private double salary;
    private String gender;

    // Constructor
    public Employee(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    public String getGender() { return gender; }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", 28, 40000, "Female"),
                new Employee("Bob", 30, 25000, "Male"),
                new Employee("Carol", 25, 35000, "Female"),
                new Employee("Dave", 40, 45000, "Male")
        );

//        List<String> employeeName = employeeList.stream()
//                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
//                .filter(e -> e.getSalary() > 30000)
//                .map(Employee::getName)
//                .collect(Collectors.toList());
        List<String> employeeName = employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("female") && e.getSalary() > 30000)
                .map(Employee::getName)
                .collect(Collectors.toList());


        System.out.println(employeeName); // Output: [Alice, Carol]
    }
}
