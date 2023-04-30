package com.sumanth.server.spring;

import com.sumanth.server.spring.model.employee.Employee;
import com.sumanth.server.spring.model.employee.EmployeeDao;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Sumanth");
		employee.setLocation("Building-10");
		employee.setBranch("Security");
		employeeDao.save(employee);

	}
	//@Test
	void getAllEmployeesAndDeleteThem(){
		List<Employee> employees = employeeDao.getAllEmployees();
		for(Employee employee : employees){
			employeeDao.delete(employee.getId());
		}
	}
}