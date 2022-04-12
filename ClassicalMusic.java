package ru.job4j.spring_course;
import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    public String getSong() {
        return "Hungarian";
    }
}
