package BootProject.example.ProjectBoot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

//To bind the data within the class encapsulation

@Document(collection ="todocollection")
public class ToDoModel {
    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    @Id
    private String todoId;
    private String todoTask;
    private String todoDate;
}
