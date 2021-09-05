package controller;
import main.Bevarage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.BevarageRepository;
import service.BevarageService;
import java.util.List;

@Controller
public class BevarageController {
    private BevarageService bevarageService;
    public final BevarageRepository bevarageRepository;

    @Autowired
    public BevarageController(BevarageService bevarageService, BevarageRepository bevarageRepository) {

        this.bevarageService = bevarageService;

        this.bevarageRepository = bevarageRepository;
    }

    @GetMapping("/bevarage")
    List<Bevarage> all() {
        return bevarageRepository.findAll();

    }
}
