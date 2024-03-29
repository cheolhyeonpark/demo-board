package com.wemakeprice.demoboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBoardApplication.class, args);
    }

}
