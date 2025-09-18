package onsite.academy.myworkday.controller;

import onsite.academy.myworkday.service.TaskService;
import onsite.academy.myworkday.model.Effort;
import onsite.academy.myworkday.model.Task;
import onsite.academy.myworkday.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Spring-Boot Controller
@RestController
@RequestMapping("/tasks")
public class TaskController {

    //TaskService is a dependency of TaskController
    @Autowired
    private TaskService taskService;

    // GET /tasks
    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    // POST /tasks
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // PUT /tasks/{id}
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    // DELETE /tasks/{id}
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    // GET /tasks/{id}
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }



}
