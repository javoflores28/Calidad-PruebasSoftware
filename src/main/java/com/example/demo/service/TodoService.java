package com.example.demo.service;


import com.example.demo.model.Todo;
import com.example.demo.respository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public List<Todo> findAll(){
        return todoRepository.findAll();


        /*
        List<Todo> todoList = new ArrayList<>();
        for (int i=0; i<3;  i++){
            Todo todo = new Todo();
            todo.setId(i);
            todo.setTitle("Lorem ipsum");
            todoList.add(todo);
        }
        return todoList;
        */

    }

    public Todo getById(int id){
        return todoRepository.findById(id).get();

        /*
        Todo todo = new Todo();
        todo.setId(1);
        todo.setTitle("Lorem ipsum");
        return todo;
         */
    }

    public void insert(Todo todo) {
        todoRepository.save(todo);

    }

    public void update(Todo todo){
        todoRepository.save(todo);

    }
}
