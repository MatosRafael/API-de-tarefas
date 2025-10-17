package com.rafaelmatos.todo.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelmatos.todo.dto.TodoRequest;
import com.rafaelmatos.todo.dto.TodoResponse;
import com.rafaelmatos.todo.model.Todo;
import com.rafaelmatos.todo.service.TodoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/todos")
@Validated
public class TodoController {
    private final TodoService service;
    public TodoController(TodoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TodoResponse> create(@Valid @RequestBody TodoRequest req){
       Todo created = service.create(req);
       TodoResponse resp = toResponse(created);
       return ResponseEntity.created(URI.create("/api/todos/" + resp.getId())).body(resp);
    }

    @GetMapping
    public List<TodoResponse> lits(@RequestParam(value = "done", required = false) Boolean done){
        return service.findAll(done).stream().map(this::toResponse).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TodoResponse getById(@PathVariable Long id){
        return toResponse(service.findById(id));
    }

    @PutMapping("/{id}")
    public TodoResponse update(@PathVariable Long id, @Valid @RequestBody TodoRequest req){
        return toResponse(service.update(id, req));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    private TodoResponse toResponse(Todo t){
        TodoResponse r = new TodoResponse();
        r.setId(t.getId());
        r.setTitle(t.getTitle());
        r.setDescription(t.getDescription());
        r.setDueDate(t.getDuDate());
        r.setDone(t.isDone());
        return r;
    }
}
