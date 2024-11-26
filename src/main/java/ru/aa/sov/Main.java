package ru.aa.sov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients
@SpringBootApplication
@EnableScheduling
@EnableJpaAuditing
public class Main {

    public static void main(String [] argv) {
        SpringApplication app = new SpringApplication(Main.class);
        Environment env = app.run(argv).getEnvironment();
    }
}