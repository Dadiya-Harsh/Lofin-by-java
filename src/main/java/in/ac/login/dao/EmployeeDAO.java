package in.ac.login.dao;

import java.util.List;

import in.ac.login.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployee();
	public boolean addEmployee(Employee employee);
}
