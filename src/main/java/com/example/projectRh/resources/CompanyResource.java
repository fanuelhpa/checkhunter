package com.example.projectRh.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectRh.entities.Company;

@RestController
@RequestMapping(value = "/users")
public class CompanyResource {
	
	@GetMapping
	public ResponseEntity<Company> findAll(){
		Company c = new Company(1L, "Converter");
		return ResponseEntity.ok().body(c);
	}

}
