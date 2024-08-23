package com.oracle.restdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {  // localhost:8080/api/hello  rest-api  or endpoints
	
	
	
   List<String>  list = new ArrayList<String>();
	
	
	
	@GetMapping("/hello")
	public String    sayHello() {   //resource
		
		
		return    "hello friends";
	}
	
	
	@GetMapping("/getall")
	public  List<String>   getList() {
		
		return list;
		
	}
	
	
	@PostMapping("/insert")
	public   String    insertData(@RequestBody  String data) {
		
		
			list.add(data);
			
		return data+" added to DB";
		
	}
	
	
	@PutMapping("/update/{index}")
	public  String   updateData(@RequestBody  String data , @PathVariable int index) {
		
			
				list.add(index, data);
				
			return  data+ " updated in DB";	
		
	}
	
	
	@DeleteMapping("/delete/{index}")
	public  String   updateData(@PathVariable int index) {    // localhost:8080/delete/1
		
			
				list.remove(index);
				
			return  "record deleted";
		
	}
	
	
	
	
	
	
	

}
