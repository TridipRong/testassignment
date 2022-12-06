package com.mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mock.entity.Book;
import com.mock.service.BookService;

@RestController
public class Controller {
	@Autowired
	private BookService bookservice;
	
	
	
	
	@PostMapping("/")
	public ResponseEntity<Book> saveAdmin( @RequestBody Book admin) {
		return new ResponseEntity<Book>(Book.createAdmin(admin),HttpStatus.OK);
	}
	
	@GetMapping("/ViewAll")
	public ResponseEntity<List<Book>> viewAllPackages() {
		List<Book> packages=bookservice.findByCtagory();
		return new ResponseEntity<List<Book>>(packages,HttpStatus.OK);
	}

	
	

}
