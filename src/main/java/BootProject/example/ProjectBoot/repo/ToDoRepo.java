package BootProject.example.ProjectBoot.repo;

import BootProject.example.ProjectBoot.model.ToDoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepo extends CrudRepository<ToDoModel ,Integer> {
    //to find the all todos
    @Override
    List<ToDoModel> findall();

}
