package org.grupo4;

import org.grupo4.task.domain.Task;

public class MainApplication {
    public static void main(String[] args) {
        Task task = Task.createWithoutId("Wash the dishes", false);
        System.out.println(task);
    }

}
