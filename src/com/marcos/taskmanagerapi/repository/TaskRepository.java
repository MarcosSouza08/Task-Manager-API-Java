package com.marcos.taskmanagerapi.repository;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.marcos.taskmanagerapi.model.Task;
import java.util.List;
import java.util.Optional;

public class TaskRepository {
    private Map<Long, Task> tasks = new HashMap<>();
    private Long nextId = 1L;

    public Task save(Task task) {
        task.setId(nextId);
        tasks.put(nextId, task);
        nextId++;
        return task;
    }

    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public void deleteById(Long id) {
        tasks.remove(id);
    }

    public Task update(Long id, Task updatedTask) {
        if (tasks.containsKey(id)) {
            updatedTask.setId(id);
            tasks.put(id, updatedTask);
            return updatedTask;
        }
        return null;
    }
    public void delete(Long id) {
        tasks.remove(id);
    }
}
