package practice;
/* Created by ayesh on 09-01-2026 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Anna", 27, 5000.0, "Male"));
        list.add(new Employee("Bob", 24, 5400.0, "Male"));
        list.add(new Employee("Smitha", 22, 500.0, "Female"));
        list.add(new Employee("Rahul", 26, 600.0, "Male"));
        list.add(new Employee("Niha", 27, 8000.0, "Female"));
        list.add(new Employee("Rifaa", 20, 300.0, "Female"));
        list.add(new Employee("Tanveer Ahmed", 31, 6000.0, "Male"));
        list.add(new Employee("Ria", 31, 7000.0, "Female"));
        list.add(new Employee("Anjali", 45, 55000.0, "Female"));
        list.add(new Employee("Siddarthhhhhhhhhhh", 22, 5000.0, "Male"));
        list.add(new Employee("Shanu", 32, 88000.0, "Male"));


        Map<String, Employee> collect = list.stream().collect(Collectors.toMap(
                Employee::getGender,
                e -> e,
                (e1, e2) -> e1.getSalary() >= e2.getSalary() ? e1 : e2
        ));

        System.out.println(collect);

    }
}
