package ru.pcask.clients.repositories;
import ru.pcask.clients.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findByCompanyName(String companyName);
}
