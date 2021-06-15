package demmy.mcube.employeemanager.service;

import demmy.mcube.employeemanager.exceptions.UserNotFoundException;
import demmy.mcube.employeemanager.model.Employee;
import demmy.mcube.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee upDateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(long id){
        return employeeRepo.findEmployeeId(id)
                .orElseThrow(()-> new UserNotFoundException("User by Id " + id + "was not found"));
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);

    }
}
