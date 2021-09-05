package service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AdressClientService {
    AdressClientService addAdr(AdressClientService adr);
}
