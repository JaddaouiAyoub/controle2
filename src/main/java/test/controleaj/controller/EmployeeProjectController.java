package test.controleaj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import test.controleaj.entity.Employee;
import test.controleaj.entity.EmployeeProject;
import test.controleaj.entity.Project;
import test.controleaj.srvice.EmployeeProjectService;
import test.controleaj.srvice.EmployeeService;
import test.controleaj.srvice.ProjectService;

import java.util.List;

@Controller
public class EmployeeProjectController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeProjectService employeeProjectService;

    @GetMapping("/assign")
    public String showAssignPage(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        List<Project> projects = projectService.getAllProjects();

        model.addAttribute("employees", employees);
        model.addAttribute("projects", projects);
        model.addAttribute("employeeProject", new EmployeeProject());

        return "assign";
    }

    @PostMapping("/assign")
    public String assignEmployeeToProject(@ModelAttribute EmployeeProject employeeProject) {
        employeeProjectService.saveEmployeeProject(employeeProject);
        return "redirect:/assign";
    }
}

