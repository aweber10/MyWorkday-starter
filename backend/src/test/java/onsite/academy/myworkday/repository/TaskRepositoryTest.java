package onsite.academy.myworkday.repository;

import onsite.academy.myworkday.model.Effort;
import onsite.academy.myworkday.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TaskRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TaskRepository taskRepository;

    private Task task1;

    @BeforeEach
    public void setUp() {
        task1 = new Task();
        task1.setMaxEffortHrs(Effort.FOUR_HOURS);
        task1.setIsCompleted(false);
        entityManager.persist(task1);

        Task task2 = new Task();
        task2.setMaxEffortHrs(Effort.TWO_HOURS);
        task2.setIsCompleted(true);
        entityManager.persist(task2);

        entityManager.flush();
    }

    // Test method to check if Tasks can be saved and loaded
    @Test
    public void testSaveAndLoadTask() {
        Task task = taskRepository.findById(task1.getId()).get();
        assertThat(task).isEqualTo(task1);
    }




}