package ru.pcask.clients.entities;

import ru.pcask.activities.entities.Activity;

import javax.persistence.*;


@Entity(name="clients_client")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName; // Cокращенное фирменное наименование. Например, ООО "Ромашка".
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Activity activity;
}
