package com.rafaelmatos.todo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelmatos.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByDone(boolean done);
    List<Todo> findByDueDateBefore(LocalDate date);
    
}
