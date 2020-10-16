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

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false, columnDefinition="")
    private String patronymic_name;

    @Column(nullable=false)
    private String lastName;

    @ManyToMany(fetch=FetchType.LAZY)
    private Set<Client> clients;

    @Override
    public String toString() {
        return String.format(
                "Пользователь [id=%d, '%s' '%s' '%s']",
                this.id,
                this.firstName,
                this.patronymic_name,
                this.lastName);
    }
}
