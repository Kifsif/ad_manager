package ru.pcask.activity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String type; // Тип экономической активности. Например, стоматология.
    private String comment;
}
