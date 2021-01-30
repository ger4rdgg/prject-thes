package pelu.thes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pelu.thes.email.EmailService;

@SpringBootApplication
public class ThesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThesApplication.class, args);
    }

}
