package java8Codes.New;

import java.util.*;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;
    private Double salary;
    private String gender;
    private String yearOfJoining;
    private int age;

    public Employee(int id, String name, Double salary, String gender, String yearOfJoining, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.yearOfJoining = yearOfJoining;
        this.age = age;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public Double getSalary() { return salary; }
    public String getGender() { return gender; }
    public String getYearOfJoining() { return yearOfJoining; }
    public int getAge() { return age; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(Double salary) { this.salary = salary; }
    public void setGender(String gender) { this.gender = gender; }
    public void setYearOfJoining(String yearOfJoining) { this.yearOfJoining = yearOfJoining; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                ", age=" + age +
                '}';
    }
}

public class EmpData {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Teju", 4500.00, "Female", "2021", 25));
        emp.add(new Employee(2, "Rani", 3300.00, "Female", "2022", 23));
        emp.add(new Employee(3, "Raj", 5500.00, "Male", "2020", 27));
        emp.add(new Employee(4, "Ravi", 6000.00, "Male", "2019", 30));
        emp.add(new Employee(5, "Priya", 7000.00, "Female", "2018", 28));

        // Sample Stream API usage

        // 1. Print all employee names
        System.out.println("Employee Names:");
        emp.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // 2. Get employees with salary > 5000
        System.out.println("\nEmployees with salary > 5000:");
        emp.stream()
                .filter(e -> e.getSalary() > 5000)
                .forEach(System.out::println);

        // 3. Group employees by gender
        System.out.println("\nEmployees grouped by gender:");
        Map<String, List<Employee>> groupedByGender = emp.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        groupedByGender.forEach((gender, employees) -> {
            System.out.println(gender + ":");
            employees.forEach(System.out::println);
        });

        // 4. Find average salary
        System.out.println("\nAverage Salary:");
        Double avgSalary = emp.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avgSalary);
    }
}

