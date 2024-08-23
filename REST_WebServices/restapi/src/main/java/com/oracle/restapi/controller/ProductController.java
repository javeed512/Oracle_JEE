package com.oracle.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.restapi.entity.Product;
import com.oracle.restapi.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	ProductRepository repo;

	@PostMapping("/insert")
	public Product insert(@RequestBody Product product) {

		return repo.save(product); // insert into Product_info values(?,?,?);

	}

	@GetMapping("/getall")
	public List<Product> getAll() {

		return repo.findAll(); // select * from Product_Info;

	}

	@GetMapping("/getbyid/{pid}")
	public  Product   getById(@PathVariable int pid) {
		
		
		return repo.findById(pid).orElse(null); // select * from Product_Info where pid = ?;
	}
	
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {

		return repo.save(product); // update Product_Info  set pname = ? , price = ? where pid = ?;

	}
	
	@DeleteMapping("/delete/{pid}")
	public   String    delete(@PathVariable  int pid) {
		
				repo.deleteById(pid);    // delete from Product_info where pid = ?;
		
				return "Record Deleted...";
	}
	
	
	
	
	
	
	
}
