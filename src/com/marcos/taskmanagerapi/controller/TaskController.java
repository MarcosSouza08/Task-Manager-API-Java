package com.marcos.taskmanagerapi.controller;

import com.marcos.taskmanagerapi.model.Task;
import com.marcos.taskmanagerapi.service.TaskService;

import java.util.List;
import java.util.Optional;

public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task createTask(Task task) {
        return taskService.createTask(task);
    }

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskService.getTaskById(id);
    }

    public void deleteTask(Long id) {
        taskService.deleteTask(id);
    }

    public Task updateTask(Long id, Task task) {
        return taskService.updateTask(id, task);
    }
}
