package springbootcrud.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootcrud.model.Employee;
import springbootcrud.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Create a Employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	//Search 
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	//Find an Employee
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	//Delete an Employee
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
