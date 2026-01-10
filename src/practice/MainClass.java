package practice;
/* Created by ayesh on 09-01-2026 */

import java.util.ArrayList;
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
        list.add(new Employee("Tanveer", 31, 6000.0, "Male"));
        list.add(new Employee("Ria", 31, 7000.0, "Female"));
        list.add(new Employee("Anjali", 45, 55000.0, "Female"));
        list.add(new Employee("Siddarth", 22, 5000.0, "Male"));
        list.add(new Employee("Shanu", 32, 88000.0, "Male"));

        List<String> femaleListNames = list.stream().filter(e -> e.getGender().equalsIgnoreCase("Female")).map(Employee::getName).toList();
        // System.out.println(femaleListNames);

        List<String> ageAbove30List = list.stream().filter(e -> e.getAge() > 30).map(Employee::getName).toList();
        // System.out.println(ageAbove30List);

        List<Employee> salaryAbove30KList = list.stream().filter(e -> e.getSalary() > 30000).toList();
        //  System.out.println(salaryAbove30KList);

        double avgSalary = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        // System.out.println(avgSalary);

        double maxSalary = list.stream().mapToDouble(Employee::getSalary).max().orElse(0);
        //  System.out.println(maxSalary);

        Map<String, List<Employee>> groupByGenderList = list.stream().collect(Collectors.groupingBy(Employee::getGender));
        //System.out.println(groupByGenderList);

        long maleCount = list.stream().filter(e -> e.getGender().equalsIgnoreCase("Male")).count();
        // System.out.println(maleCount);

        double sum = list.stream().mapToDouble(Employee::getSalary).sum();
        // System.out.println(sum);

        List<String> sortByNameList = list.stream().sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).toList();
        //System.out.println(sortByNameList);

        List<Employee> sortByAgeList = list.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        //System.out.println(sortByAgeList);

        List<Double> salaryInDescList = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getSalary).toList();
        //System.out.println(salaryInDescList);

        Employee employee = list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().orElseThrow(null);
        //System.out.println(employee);

        Employee employee1 = list.stream().max(Comparator.comparing(Employee::getAge)).orElseThrow(null);
        //System.out.println(employee1);

        Map<String, List<Employee>> ageRangeList = list.stream().collect(Collectors.groupingBy(e -> {
            int age = e.getAge();
            if (age >= 20 && age <= 30) return "20-30";
            else if (age >= 30 && age <= 40) return "31-40";
            else return "40+";
        }));
        //System.out.println(ageRangeList);

        List<Employee> age35 = list.stream().filter(e -> e.getAge() == 35).toList();
       // System.out.println(age35);

        Map<String, Double> gendersBasedSalarySum = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)));
        //System.out.println(gendersBasedSalarySum);

        List<String> nameListStartingWithA = list.stream().filter(e -> e.getName().startsWith("A")).map(Employee::getName).toList();
        //System.out.println(nameListStartingWithA);

        Map<String, Double> averageSalaryByGender = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(averageSalaryByGender);



    }
}
