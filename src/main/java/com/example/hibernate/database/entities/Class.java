package com.example.hibernate.database.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @ManyToMany(mappedBy = "classi")
    private List<Student> studenti;

    public Class(){}

    public Class(Long id, String title, String description, List<Student> studenti) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.studenti = studenti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
}

