package com.rafaelmatos.todo.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class TodoRequest {
    
    @NotBlank(message = "O título é obrigatório")
    private String title;
    private String description;
    private LocalDate dueDate;
    private Boolean done;
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
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    


}
