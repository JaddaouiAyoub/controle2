package test.controleaj.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class EmployeeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private String implication;

    // Getters and Setters

    // Constructors
    public EmployeeProject() {}

    public EmployeeProject(Employee employee, Project project, String implication) {
        this.employee = employee;
        this.project = project;
        this.implication = implication;
    }

    // hashCode and equals based on id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeProject that = (EmployeeProject) o;
        return Objects.equals(id, that.id);
    }
}

