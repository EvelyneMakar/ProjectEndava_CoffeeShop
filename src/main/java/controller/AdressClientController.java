package controller;
import main.AdressClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import repository.AdressClientRepository;
import service.AdressClientService;
import java.util.List;
import java.util.Optional;

@Controller
public class AdressClientController {
    public final AdressClientRepository adrRepository;

    public final AdressClientService adrService;

    public AdressClientController(AdressClientRepository adrRepository, AdressClientService adrService) {
        this.adrRepository = adrRepository;
        this.adrService = adrService;
    }
    @GetMapping("/adress")
     List<AdressClient> all() {
        return adrRepository.findAll();
    }

    @GetMapping("/adress/{id}")
    Optional<AdressClient> one(@PathVariable Long id) {
        return adrRepository.findById(id);
    }
}
