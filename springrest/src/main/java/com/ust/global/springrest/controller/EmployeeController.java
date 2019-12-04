package com.ust.global.springrest.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.global.springrest.dto.EmployeeBean;
import com.ust.global.springrest.service.EmployeeService;
@RestController
public class EmployeeController {

	/*@controller+ @Responsebody ----@RestController
	 * @RESPONSEbody------
	 *  insted of jso_value we can give xml_value */

	@Autowired
	private EmployeeService service;
	
	
	@PostMapping(path="/add", consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)

	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {//service must return repressentation data(Rest) so returns response
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data  addded into DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not addded into DB");
		}
		return response;
	}
	
	
	
	
	@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)

	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(bean)) {//service must return repressentation data(Rest) so returns response
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data modified ");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in DB");
		}
		return response;
		
	}
	
	
	
	@DeleteMapping(path="/delete/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {//service must return repressentation data(Rest) so returns response
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data removed from DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not removed from DB");
		}
		return response;
	}
	
	
	
	@GetMapping(path="/get",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean =service.getEmployee(id);
		
		if(bean!=null) {//service must return repressentation data(Rest) so returns response
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found into DB");
			response.setEmployeeBean(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found");
		}
		return response;
	}
	
	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans =service.getAllEmployee();
		
		if(!beans.isEmpty()) {//service must return repressentation data(Rest) so returns response
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found into DB");
			response.setEmployeeBean(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found");
		}
		return response;
	}// end of get-all employee
	@GetMapping(path="/exce", produces=MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i =1/0;
		
	}

}
