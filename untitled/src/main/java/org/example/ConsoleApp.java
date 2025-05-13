//package org.example;
//
//import UseCase.InMemoryTaskRepository;
//import UseCase.TaskRepository;
//import UseCase.TaskService;
//import UseCase.TaskServiceImpl;
//
//public class ConsoleApp {
//    public static void main(String[] args){
//        TaskRepository repo = new InMemoryTaskRepository();
//        TaskService service = new TaskServiceImpl(repo);
//
//        service.createTask("1","Estudar arquitetura hexagonal");
//        service.completeTask("1");
//
//        Task task = repo.findyById("1");
//        System.out.println("tarefa: " + task.getDescription() + " |COncluida " + task.isCompleted());
//    }
//}
