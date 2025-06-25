package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBoot {

	public static void main(String[] args) {
		
		SpringApplication.run(HelloSpringBoot.class, args);

		System.out.println("helo spring boot2");

	}

}
