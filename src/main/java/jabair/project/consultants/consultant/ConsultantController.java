package jabair.project.consultants.consultant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/consultant")
public class ConsultantController {

    private final ConsultantService consultantService;

    @Autowired
    public ConsultantController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    @GetMapping
    public List<Consultant> getConsultants(){
        return consultantService.getConsultants();
    }

    @PostMapping
    public void registerNewConsultant(@RequestBody Consultant consultant) {
        consultantService.addNewConsultant(consultant);
    }

    @DeleteMapping(path = "{consultantId}")
    public void deleteConsultant(@PathVariable("consultantId") Long consultantId) {
        consultantService.deleteConsultant(consultantId);
    }
}
