package service;
import main.Bevarage;
import javax.transaction.Transactional;

public interface BevarageService {
    @Transactional
    Bevarage addBevarage(Bevarage bevarage);

}
