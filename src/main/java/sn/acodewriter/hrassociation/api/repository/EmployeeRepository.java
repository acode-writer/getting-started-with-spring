package sn.acodewriter.hrassociation.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.acodewriter.hrassociation.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
