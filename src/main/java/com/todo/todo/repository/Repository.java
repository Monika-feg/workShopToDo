package com.todo.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.todo.model.Todo;

public interface Repository extends CrudRepository<Todo, String >{
    
}
