package com.ns.service;

import java.util.List;

import com.ns.model.Requirement;

public interface RequirementService {

	public List<Requirement> getAllRequirements();

	public Requirement getRequirementById(int id);

	public Requirement insertRequirement(Requirement r);

	public Requirement updateRequirement(Requirement r);

	public void deleteRequirement(int id);

}
