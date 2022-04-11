package ru.job4j.spring_course;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public String getSong() {
        return "Hotel Califirnia";
    }
}
