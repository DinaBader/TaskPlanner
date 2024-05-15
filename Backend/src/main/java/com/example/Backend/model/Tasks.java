package com.example.Backend.model;


import jakarta.persistence.*;
import org.aspectj.weaver.loadtime.Agent;

@Entity
@Table(name="task")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String task;
}
