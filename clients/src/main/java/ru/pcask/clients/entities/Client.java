package ru.pcask.clients.entities;

import ru.pcask.activities.entities.Activity;

import javax.persistence.*;
import java.util.Set;
import ru.pcask.general.constants.Constants;


@Entity(name="clients_client")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName; // Cокращенное фирменное наименование. Например, ООО "Ромашка".

    @Column(length=Constants.comments_length)
    private String comment;

    @Column(length=8)
    private String protocol; // http:// и https://
    private String domain; // Доменное имя. Например, pcask.ru

    @ManyToMany(fetch=FetchType.LAZY)
    private Set<Activity> activities;

    @Override
    public String toString() {
        return String.format(
                "Клиент[id=%d, companyName='%s']",
                id, companyName);
    }
}