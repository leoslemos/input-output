package br.com.inputoutput.inputoutput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.inputoutput.controller")
@EntityScan("br.com.inputoutput.model")
@EnableJpaRepositories("br.com.inputoutput.repository")
public class InputOutputApplication {

	public static void main(String[] args) {
		SpringApplication.run(InputOutputApplication.class, args);
	}

}
