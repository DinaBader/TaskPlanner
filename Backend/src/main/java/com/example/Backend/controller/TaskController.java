package com.example.Backend.controller;

import com.example.Backend.model.Tasks;
import com.example.Backend.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TasksService tasksService;

    @GetMapping
    public List<Tasks> getTasks(){
        return tasksService.getTasks();
    }

    @PostMapping
    public Tasks createTask(Tasks task){
        return tasksService.createTasks(task);
    }

    @PutMapping("/update")
    public Tasks updateTask(int id,Tasks task){
        return tasksService.updateTask(id,task);
    }

    @DeleteMapping("/delete")
    public void DeleteTask(int id){
         tasksService.deleteTask(id);
    }
}
