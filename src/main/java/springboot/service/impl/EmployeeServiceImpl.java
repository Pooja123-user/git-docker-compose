package springboot.service.impl;

import org.springframework.stereotype.Service;

import springboot.model.Employee;
import springboot.repository.EmployeeRepository;
import springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository=employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	

}

