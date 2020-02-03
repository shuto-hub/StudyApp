package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    // ①
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Optional<Todo> findById(Long id){
        return todoRepository.findById(id);
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}