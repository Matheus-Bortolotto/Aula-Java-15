//package UseCase;
//
//import Dominio.Task;
//import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
//
//public class InMemoryTaskRepository implements TaskRepository{
//    private final Map<String, Task> storage =  new HashMap<>();
//
//    public void save(Task task){
//        storage.put(task.getId(),task);
//    }
//
//    public Task findyById(String id){
//        return storage.get(id);
//    }
//}
