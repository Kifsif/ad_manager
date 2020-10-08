package ru.pcask.client.entities;
import javax.persistence.*;


@Entity
public class AdminEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName; // Cокращенное фирменное наименование. Например, ООО "Ромашка".
    private String comment;

    @OneToMany(mappedBy = "activity", fetch = FetchType.LAZY)
    private Set<Book> bookList;

}
