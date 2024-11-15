package BootProject.example.ProjectBoot.services;

import BootProject.example.ProjectBoot.model.ToDoModel;
import BootProject.example.ProjectBoot.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServices {

    //create add==> and delete fetch....


    //to get the method of repo
    @Autowired
    private ToDoRepo repo;

    //Add todo return todomodel..........
    public ToDoModel addToDo(ToDoModel model){
        return repo.save(model);
    }

    //to fetch the all todos................
    public List<ToDoModel> getTodos()
    {
        return repo.findAll();
    }

    //to delete the todo
    public String deleteTodo(int ToDoId)
    {
        repo.deleteById(ToDoId);
        return ToDoId + "This id is delete successfully";
    }

    //to update
    public ToDoModel up


}
