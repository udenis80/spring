package ru.job4j.spring_course;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    public String getSong() {
        return "Jazzzz";
    }
}
