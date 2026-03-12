package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMainClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tanveer", 30));
        list.add(new Student(2, "Ahmed", 20));
        list.add(new Student(3, "Ria", 31));
        list.add(new Student(4, "San", 29));
        list.add(new Student(5, "Rohan", 15));

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);
    }
}
