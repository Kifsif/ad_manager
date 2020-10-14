package ru.pcask.activities.entities;

import javax.persistence.*;
import ru.pcask.general.constants.Constants;

@Entity(name="activities_activity")
public class Activity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String type; // Тип экономической активности. Например, стоматология.

    @Column(length = Constants.comments_length)
    private String comment;
}
