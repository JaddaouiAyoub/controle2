package test.controleaj.srvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.controleaj.entity.EmployeeProject;
import test.controleaj.repository.EmployeeProjectRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeProjectService {

    @Autowired
    private EmployeeProjectRepository employeeProjectRepository;

    public List<EmployeeProject> getAllEmployeeProjects() {
        return employeeProjectRepository.findAll();
    }

    public Optional<EmployeeProject> getEmployeeProjectById(Long id) {
        return employeeProjectRepository.findById(id);
    }

    public EmployeeProject saveEmployeeProject(EmployeeProject employeeProject) {
        return employeeProjectRepository.save(employeeProject);
    }

    public void deleteEmployeeProject(Long id) {
        employeeProjectRepository.deleteById(id);
    }
}

