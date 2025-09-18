package onsite.academy.myworkday.model;

import jakarta.persistence.*;


@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Boolean isCompleted;

    @Enumerated(EnumType.ORDINAL)
    private Effort maxEffortHrs;

    public Task(Long id, String description, Boolean isCompleted, Effort effort) {
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
        this.maxEffortHrs = effort;
    }

    public Task() {

    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Effort getMaxEffortHrs() {
        return maxEffortHrs;
    }

    public void setMaxEffortHrs(Effort effort) {
        this.maxEffortHrs = effort;
    }

    // toString
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", effort=" + maxEffortHrs +
                '}';
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != null ? !id.equals(task.id) : task.id != null) return false;
        if (description != null ? !description.equals(task.description) : task.description != null) return false;
        if (isCompleted != null ? !isCompleted.equals(task.isCompleted) : task.isCompleted != null) return false;
        return maxEffortHrs == task.maxEffortHrs;
    }

}