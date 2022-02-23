package sn.acodewriter.hrassociation.api.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.acodewriter.hrassociation.api.model.Employee;
import sn.acodewriter.hrassociation.api.repository.EmployeeRepository;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final long id){
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
