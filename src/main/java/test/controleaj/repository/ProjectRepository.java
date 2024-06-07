package test.controleaj.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.controleaj.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
