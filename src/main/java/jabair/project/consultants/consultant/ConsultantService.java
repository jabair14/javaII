package jabair.project.consultants.consultant;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {
    public List<Consultant> getConsultants(){
        return List.of(
                new Consultant(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        "Philadelphia"
                )
        );
    }
}
