package com.example.javaDevModule17.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "notes")
public class NoteEntity {
    @jakarta.persistence.Id
    @Id
    private long id;
    private String title;
    private String content;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
