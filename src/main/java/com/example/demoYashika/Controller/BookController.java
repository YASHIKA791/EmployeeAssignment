package com.example.demoYashika.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoYashika.model.Product;

@RestController
public class BookController {
	
	List<Product> prodList=new ArrayList();	
	public BookController() {
		super();
		prodList.add(new Product(1001,"TV",95000,1,"Apple",0));
		prodList.add(new Product(1002,"Tripod",7000,2,"Digitech",100));
		prodList.add(new Product(1003,"CCTV Camera",4500,5,"Mi",150));
		prodList.add(new Product(1004,"Mobile",50000,1,"Samsung",0));
		prodList.add(new Product(1005,"Monitor",16000,4,"Dell",100));
		prodList.add(new Product(1006,"Mouse",1200,15,"logitech",50));
	}
	
	@GetMapping("/show")// GET HTTP Method
	public String show()
	{
		return "dfqecdkxlksfhcdjmq";
	}
	
	@GetMapping("/list")// GET HTTP Method
	public List<Product> productList()
	{
		return prodList;
	}
	@GetMapping("/listone/{id}")// GET HTTP Method
	public Product readProduct(@PathVariable int id)
	{
		return prodList.get(id);
	}
	@PutMapping("/update/{id}")// GET HTTP Method
	public void updateProduct(@RequestBody Product p,@PathVariable int id)
	{
		prodList.set(id, p);
	}
	@PostMapping("/add")// GET HTTP Method
	public void addProduct(@RequestBody Product p)
	{
		prodList.add(p);
	}
	@GetMapping("/delete")// GET HTTP Method
	public void deleteProduct()
	{
		
	}
}