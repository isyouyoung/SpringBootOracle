package kopo.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; // 1. import 추가

@SpringBootApplication
public class SpringBootOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOracleApplication.class, args);
    }

}