package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/todo")


public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/all")
    List<Todo> list() {
        return todoService.findAll();
    /*
    Todo prueba() {
        Todo todo = new Todo();
        todo.setId(1);
        todo.setTitle("Hola");
        todo.setComments("Prueba comments");
        todo.setDueDate(new Date());
        todo.setFinished(false);
        return todo;
        */
    }

    @PostMapping("/create")
    Todo pruebaPost(@RequestBody Todo todo) {
        todoService.insert(todo);
        return todo;
    }

    @PostMapping("/update")
    Todo updateTodo(@RequestBody Todo todo) {
        todoService.update(todo);
        return todo;
    }

    @GetMapping("/find/{id}")
    Todo findBody(@PathVariable("id") int id){
        Todo todo = todoService.getById(id);
        return todo;
    }

}
