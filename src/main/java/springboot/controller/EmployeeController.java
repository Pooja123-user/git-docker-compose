package springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.model.Employee;
import springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/e")
public class EmployeeController {
	private EmployeeService employeeservice;
	
	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeservice.saveEmployee(employee),HttpStatus.CREATED);
	}

}
