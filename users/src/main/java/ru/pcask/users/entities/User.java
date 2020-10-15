package ru.pcask.users.entities;

import ru.pcask.activities.entities.Activity;
import ru.pcask.clients.entities.Client;

import javax.persistence.*;
import java.util.Set;


@Entity(name="users_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName; // Cокращенное фирменное наименование. Например, ООО "Ромашка".

    @ManyToMany(fetch=FetchType.LAZY)
    private Set<Client> clients;
}
