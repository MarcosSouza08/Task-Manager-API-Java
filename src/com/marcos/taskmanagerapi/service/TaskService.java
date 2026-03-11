package com.marcos.taskmanagerapi.service;

import com.marcos.taskmanagerapi.model.Task;
import com.marcos.taskmanagerapi.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return repository.findById(id);
    }
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
    public Task updateTask(Long id, Task task) {
        return repository.update(id, task);
    }
}