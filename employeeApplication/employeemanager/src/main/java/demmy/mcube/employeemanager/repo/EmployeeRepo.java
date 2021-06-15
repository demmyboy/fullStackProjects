package demmy.mcube.employeemanager.repo;

import demmy.mcube.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeId(long id);
}
