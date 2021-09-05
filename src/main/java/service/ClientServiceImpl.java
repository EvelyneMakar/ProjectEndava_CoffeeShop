package service;
import org.springframework.stereotype.Service;
import repository.ClientRepository;
import javax.transaction.Transactional;

@Service
public class ClientServiceImpl implements ClientService{
    public final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public ClientService addClient(ClientService client){
        client = clientRepository.save(client);

        return client;
    }

}
