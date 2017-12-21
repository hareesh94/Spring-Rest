package controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Employee;
@RestController
public class EmployeeController {
	
	@RequestMapping(method= RequestMethod.GET, value = "/employees" )
	public List<Employee> findAll(){
		return null;
	}
	
	@RequestMapping(method= RequestMethod.GET, value = "/employees/{id}" )
	public Employee find(@PathVariable("id") String id){
		return null;
	}
	
	@RequestMapping(method= RequestMethod.POST, value = "/employees" )
	public Employee create(@RequestBody Employee e){
		return null;
	}
	
	@RequestMapping(method= RequestMethod.PUT, value = "/employees/{id}" )
	public Employee update(@PathVariable("id") String id,@RequestBody Employee e){
		return null;
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value = "/employees/{id}" )
	public void delete(@PathVariable("id") String id){
		
	}
}
