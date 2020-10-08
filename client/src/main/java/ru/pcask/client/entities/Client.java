package ru.pcask.client.entities;
import ru.pcask.activity.entities.Activity;
import javax.persistence.*;



@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName; // Cокращенное фирменное наименование. Например, ООО "Ромашка".
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Activity activity;
}
