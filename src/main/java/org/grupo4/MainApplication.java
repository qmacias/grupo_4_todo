package org.grupo4;

import org.grupo4.task.domain.Task;
import org.grupo4.task.infrastructure.MySQLTaskRepository;

public class MainApplication {
    public static void main(String[] args) {
        MySQLTaskRepository repository = new MySQLTaskRepository();

        Task taskWithoutId = Task.createWithoutId("Wash the dishes", false);
        System.out.println(taskWithoutId);

        Task taskWithId = repository.save(taskWithoutId);
        System.out.println(taskWithId);
    }

}
