package service;
import org.springframework.stereotype.Service;
import repository.AdressClientRepository;
import javax.transaction.Transactional;

@Service
public class AdressClientServiceImpl implements AdressClientService {
    public final AdressClientRepository adrRepository;

    public AdressClientServiceImpl(AdressClientRepository adrRepository){
        this.adrRepository = adrRepository;
    }

    @Override
    @Transactional
    public AdressClientService addAdr(AdressClientService adr){
        adr = adrRepository.save(adr);

        return adr;
    }
}
