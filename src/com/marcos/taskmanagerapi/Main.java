package com.marcos.taskmanagerapi;
import com.marcos.taskmanagerapi.model.Task;
import com.marcos.taskmanagerapi.service.TaskService;
import com.marcos.taskmanagerapi.repository.TaskRepository;
import com.marcos.taskmanagerapi.controller.TaskController;

public class Main {
    public static void main(String[] args) {
        TaskRepository repository = new TaskRepository();
        TaskService service = new TaskService(repository);
        TaskController controller = new TaskController(service);

        Task task1 = new Task();
        task1.setTitle("Estudar Java");
        task1.setDescription("Continuar desenvolvendo a API de tarefas");
        controller.createTask(task1);
        System.out.println(controller.getAllTasks());

        Task task2 = new Task();
        task2.setTitle("Postar projeto no GitHub");
        task2.setDescription("Publicar Task Manager API");
        controller.createTask(task2);
        System.out.println(controller.getAllTasks());

        Task updatedTask = new Task();
        updatedTask.setTitle("Estudar Java MUITO");
        updatedTask.setDescription("Finalizar a API");

        controller.updateTask(1L, updatedTask);

        System.out.println(controller.getAllTasks());

        controller.deleteTask(1L);
        System.out.println(controller.getAllTasks());
    }
}
