package com.abc.example.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abc.example.mapping.model.Address;
import com.abc.example.mapping.model.Employee;
import com.abc.example.mapping.repository.AddressRepository;
import com.abc.example.mapping.repository.EmployeeRepository;


@SpringBootApplication
public class OneToOneJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneJpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(OneToOneJpaApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		// Save into db
		Address address = new Address();
		address.setZipCode("425201");
		address.setCountry("USA");
		address.setState("Newyork");
		Employee employee = new Employee();
		employee.setEmpName("Nicolas");
		employee.setAddress(address);
		employeeRepository.save(employee);
		}
	

}
