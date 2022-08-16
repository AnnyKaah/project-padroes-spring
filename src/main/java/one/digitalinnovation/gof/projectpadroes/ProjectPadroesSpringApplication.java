package one.digitalinnovation.gof.projectpadroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (scanBasePackages = {"one.digitalinnovation.gof.projectpadroes"})
public class ProjectPadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPadroesSpringApplication.class, args);
	}

}
