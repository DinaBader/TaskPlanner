package com.example.Backend.service;

import com.example.Backend.model.Tasks;
import com.example.Backend.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {

    @Autowired
    private TasksRepository tasksRepository;

    public List<Tasks> getTasks(){
        return tasksRepository.findAll();
    }

    public Tasks createTasks(Tasks task){
        return tasksRepository.save(task);
    }

    public Tasks updateTask(int id, Tasks task){
        task.setId(id);
        return tasksRepository.save(task);

    }

    public void deleteTask(int id){
         tasksRepository.deleteById(id);
    }
}
