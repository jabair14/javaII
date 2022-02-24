package jabair.project.consultants.consultant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {

    private final ConsultantRepository consultantRepository;

    @Autowired

    public ConsultantService(ConsultantRepository consultantRepository){
        this.consultantRepository = consultantRepository;
    }
    public List<Consultant> getConsultants(){
        return consultantRepository.findAll();
    }

    public void addNewConsultant(Consultant consultant) {
        System.out.println(consultant);
    }
}
