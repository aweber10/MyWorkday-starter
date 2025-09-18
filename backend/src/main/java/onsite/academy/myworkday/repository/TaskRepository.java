package onsite.academy.myworkday.repository;

import onsite.academy.myworkday.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

}


