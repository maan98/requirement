package com.ns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.DAO.RequirementRepository;
import com.ns.model.Requirement;

@Service
public class RequirementServiceImp implements RequirementService {
    
	@Autowired
	RequirementRepository repository;
	
	@Override
	public List<Requirement> getAllRequirements() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Requirement getRequirementById(int id) {
		// TODO Auto-generated method stub
		Optional<Requirement> requirement=repository.findById(id);
		return requirement.get();
	}

	@Override
	public Requirement insertRequirement(Requirement r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public Requirement updateRequirement(Requirement r) {
		// TODO Auto-generated method stub
		Optional<Requirement> req=repository.findById(r.getId());
		Requirement requirement=req.get();
		requirement.setStatus(r.getStatus());
		return repository.save(requirement);
	}

	@Override
	public void deleteRequirement(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
