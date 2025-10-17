package com.rafaelmatos.todo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")

public class Todo {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;

    private String description;

    private LocalDate dueDate;

    private boolean done = false;

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public LocalDate getDuDate(){
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public boolean isDone(){
        return done;
    }

    public void setDone(boolean done){
        this.done = done;
    }
}
