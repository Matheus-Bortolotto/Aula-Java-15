package UseCase;

import Dominio.Task;

public interface TaskRepository {
    void save(Task task);
    Task findyById(String id);
}
