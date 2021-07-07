package kodlamaio.northwind.api.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	@Resource 
	public  ProductService productService;
	


	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}




	@GetMapping("/getall") //http istekleri 
	public List<Product> getAll(){
		return this.productService.getAll();
		
		

		
	}
	
}
