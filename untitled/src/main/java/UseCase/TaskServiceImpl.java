package UseCase;

import Dominio.Task;

public class TaskServiceImpl implements TaskService{
    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository){
        this. repository = repository;
    }
    public void createTask(String id, String description){
        Task task = new Task(id, description);
        repository.save(task);
    }

    public void completeTask(String id){
        Task task = repository.findyById(id);
        task.markAsCompleted();
        repository.save(task);
    }
}
