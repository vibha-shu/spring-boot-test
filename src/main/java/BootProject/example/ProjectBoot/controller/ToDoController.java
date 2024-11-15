package BootProject.example.ProjectBoot.controller;


import BootProject.example.ProjectBoot.model.ToDoModel;
import BootProject.example.ProjectBoot.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ToDoController {
    @Autowired
    private ToDoServices services;

    //to add the todos
    @PostMapping
    public ToDoModel addTodos(RequestBody ToDoModel model)
    {
        return services.addToDo(model);
    }
    @GetMapping
    public List<ToDoModel> getTodos()
    {
        return services.getTodos();
    }
    @DeleteMapping(value = "/{ToDoId}")
    public String deleteTodo
}
