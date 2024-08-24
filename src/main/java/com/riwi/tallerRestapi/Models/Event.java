package com.riwi.tallerRestapi.Models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table( name = "event")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Event {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Date date;

    private String ubication;

    private Integer capacity;

    public Event(UUID id){
        this.id=id;
    }

    public Event(String name, Date date, String ubication, Integer capacity) {
        this.name = name;
        this.date = date;
        this.ubication = ubication;
        this.capacity = capacity;
    }

    public Event(String name, String ubication, Integer capacity) {
        this.name = name;
        this.ubication = ubication;
        this.capacity = capacity;
    }
}
