package com.todo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.todo.todo.model.Todo;

public interface Repository extends JpaRepository<Todo, String >{
    
}
