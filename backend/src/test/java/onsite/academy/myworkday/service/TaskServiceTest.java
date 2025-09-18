package onsite.academy.myworkday.service;

import onsite.academy.myworkday.model.Effort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import onsite.academy.myworkday.model.Task;
import onsite.academy.myworkday.repository.TaskRepository;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class TaskServiceTest {

    @Mock
    TaskRepository taskRepository = Mockito.mock(TaskRepository.class);

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
public void testGetTasks() {
        Task task1 = new Task(1L, "Task 1", false, Effort.FOUR_HOURS);
        Task task2 = new Task(2L, "Task 2", true, Effort.TWO_HOURS);
        List<Task> tasks = Arrays.asList(task1, task2);

        when(taskRepository.findAll()).thenReturn(tasks);

        List<Task> result = taskService.getTasks();

        assertEquals(2, result.size());
        assertEquals(task1, result.get(0));
        assertEquals(task2, result.get(1));
    }



}
