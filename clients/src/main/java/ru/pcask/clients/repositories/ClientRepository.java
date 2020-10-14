package ru.pcask.clients.repositories;
import ru.pcask.clients.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findById(Long id);
//    Client findByName(String companyName);
//    Client saveClient(Client a_client);
//    void deleteClient(Client a_client);
}
