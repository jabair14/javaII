package jabair.project.consultants.consultant;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsultantConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ConsultantRepository repository) {
        return args -> {
            Consultant andre = new Consultant(
                    "Andre",
                    "andre.3000@gmail.com",
                    "Atlanta"
            );

            Consultant antwon = new Consultant(
                    "Antwon",
                    "antwon.patton@gmail.com",
                    "Atlanta"
            );

            Consultant thomas = new Consultant(
                    "thomas",
                    "ceelo.greene@gmail.com",
                    "Atlanta"
            );

            Consultant patrick = new Consultant(
                    "patrick",
                    "sleepy.brown@gmail.com",
                    "Savannah"
            );

            Consultant nayvadius = new Consultant(
                    "nayvadius",
                    "future@gmail.com",
                    "Atlanta"
            );

            Consultant michael = new Consultant(
                    "michael",
                    "killer.mike@gmail.com",
                    "Atlanta"
            );

            Consultant cameron = new Consultant(
                    "cameron",
                    "big.gipp@gmail.com",
                    "Atlanta"
            );

            repository.saveAll(
                    List.of(andre, antwon, thomas, patrick, nayvadius, michael, cameron)
            );

        };
    }
}
