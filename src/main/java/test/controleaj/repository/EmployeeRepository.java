package test.controleaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.controleaj.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}