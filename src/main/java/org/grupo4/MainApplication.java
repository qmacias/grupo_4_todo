package org.grupo4;

import org.grupo4.task.domain.Task;

public class MainApplication {
    public static void main(String[] args) {
        Task task = new Task(1, "Wash the dishes", false);
        System.out.println(task);
    }

}
