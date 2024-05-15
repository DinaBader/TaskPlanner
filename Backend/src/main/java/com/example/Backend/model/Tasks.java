package com.example.Backend.model;


import jakarta.persistence.*;
import lombok.Data;
import org.aspectj.weaver.loadtime.Agent;

@Entity
@Table(name="task")
@Data
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String task;
}
