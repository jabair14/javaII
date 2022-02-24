package jabair.project.consultants;

import jabair.project.consultants.consultant.Consultant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class ConsultantsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsultantsApplication.class, args);
	}



}
