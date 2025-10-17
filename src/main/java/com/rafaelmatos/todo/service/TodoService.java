package com.rafaelmatos.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rafaelmatos.todo.dto.TodoRequest;
import com.rafaelmatos.todo.exception.ResourceNotFoundException;
import com.rafaelmatos.todo.model.Todo;
import com.rafaelmatos.todo.repository.TodoRepository;


@Service
public class TodoService {

    

    private final TodoRepository repo;
    public TodoService(TodoRepository repo){
        this.repo = repo;
    }
    
    public Todo create(TodoRequest req){
        Todo t = new Todo();
        t.setTitle(req.getTitle());
        t.setDescription(req.getDescription());
        t.setDueDate(req.getDueDate());
        t.setDone(Optional.ofNullable(req.getDone()).orElse(false));
        return repo.save(t);
    }

    public List<Todo> findAll(Boolean done){
        if (done == null) {
            return repo.findAll();
        }

        return repo.findByDone(done);
    }

    public Todo findById(Long id){
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo não encontrado: " + id));
    }

    public Todo update(Long id, TodoRequest req){
        Todo t = findById(id);
        t.setTitle(req.getTitle());
        t.setDescription(req.getDescription());
        t.setDueDate(req.getDueDate());
        t.setDone(Optional.ofNullable(req.getDone()).orElse(t.isDone()));
        return repo.save(t);
    }

    public void delete(Long id){
        Todo t = findById(id);
        repo.delete(t);
    }
}
