package com.toma.framework.lab05liteflow;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * lambda 示例
 *
 * @author Toma
 * @version 1.0
 * @since 2021/3/11
 */
public class LambdaExample {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("java8 Lambda")).start();

        List<String> asList = Arrays.asList("A", "B", "C");
        asList.forEach(System.out::println);

        Supplier<Student> stu = Student::new;
        

    }

    public static class Student {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
