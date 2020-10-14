package ru.pcask.activities.entities;

import javax.persistence.*;

@Entity(name="activities_activity")
public class Activity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String type; // Тип экономической активности. Например, стоматология.

    @Column(length = 3000)
    private String comment;
}
