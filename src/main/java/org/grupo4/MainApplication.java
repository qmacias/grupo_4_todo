package org.grupo4;

import org.grupo4.task.application.TaskService;
import org.grupo4.task.domain.Task;
import org.grupo4.task.infrastructure.MySQLTaskRepository;

public class MainApplication {
    public static void main(String[] args) {
        MySQLTaskRepository repository = new MySQLTaskRepository();
        TaskService taskService = new TaskService(repository);

        Task taskWithId = taskService.create("Wash the dishes", false);
        System.out.println(taskWithId);
    }

}
