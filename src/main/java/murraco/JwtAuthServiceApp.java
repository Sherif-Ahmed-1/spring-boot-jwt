package murraco;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtAuthServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthServiceApp.class, args);
    }


}
