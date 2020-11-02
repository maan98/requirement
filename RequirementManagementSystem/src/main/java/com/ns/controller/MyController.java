package com.ns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.model.Requirement;
import com.ns.service.RequirementService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	
	@Autowired
	RequirementService service;
	
	@GetMapping("/requirements")
	public List<Requirement> getAllRequirements(){
		return service.getAllRequirements();
	}
	
	@GetMapping("/requirements/{id}")
	public Requirement getRequirementById(@PathVariable int id){
		return service.getRequirementById(id);
	}
	
	@PostMapping("/requirements")
	public Requirement insertRequirement(@RequestBody Requirement r) {
		return service.insertRequirement(r);
	}
	
	@PutMapping("/requirements")
	public Requirement updateRequirement(@RequestBody Requirement r) {
		return service.updateRequirement(r);
	}
	
	@GetMapping("/requirements/afterDelete/{id}")
	public List<Requirement> deleteRequirement(@PathVariable int id){
		service.deleteRequirement(id);
		return service.getAllRequirements();
	}

}
