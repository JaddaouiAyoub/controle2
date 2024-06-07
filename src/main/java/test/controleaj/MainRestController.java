package test.controleaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import test.controleaj.entity.Employee;
import test.controleaj.entity.EmployeeProject;
import test.controleaj.entity.Project;
import test.controleaj.srvice.EmployeeProjectService;
import test.controleaj.srvice.EmployeeService;
import test.controleaj.srvice.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeProjectService assignmentService;

    // Endpoint pour récupérer la liste des employés
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Endpoint pour récupérer la liste des projets
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    // Endpoint pour affecter un employé à un projet
    @PostMapping("/assign")
    public void assignEmployeeToProject(@RequestBody EmployeeProject employeeProject) {
        assignmentService.saveEmployeeProject(employeeProject);
    }

    // Endpoint pour supprimer un employé
    @DeleteMapping("/employees/{id}")
    public void removeEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    // Endpoint pour supprimer un projet
    @DeleteMapping("/projects/{id}")
    public void removeProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

    // Endpoint pour supprimer une affectation
    @DeleteMapping("/assignments/{id}")
    public void removeAssignment(@PathVariable Long id) {
        assignmentService.deleteEmployeeProject(id);
    }
}
