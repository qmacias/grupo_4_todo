package org.grupo4.task.application;

import org.grupo4.task.domain.Task;
import org.grupo4.task.domain.TaskRepository;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task create(String name, Boolean status) {
        Task taskWithoutId = Task.createWithoutId(name, status);

        return repository.save(taskWithoutId);
    }

}
