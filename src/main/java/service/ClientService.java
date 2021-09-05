package service;
import javax.transaction.Transactional;

public interface ClientService {
    @Transactional
    ClientService addClient(ClientService clientService);
}
