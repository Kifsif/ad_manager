package ru.pcask.users.repositories;
import org.springframework.data.repository.CrudRepository;
import ru.pcask.users.entities.User;


public interface UserRepository extends CrudRepository<User, Long> {
}
