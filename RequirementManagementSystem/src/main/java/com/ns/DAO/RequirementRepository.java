package com.ns.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ns.model.Requirement;
@Repository
public interface RequirementRepository extends JpaRepository<Requirement,Integer>{

}
