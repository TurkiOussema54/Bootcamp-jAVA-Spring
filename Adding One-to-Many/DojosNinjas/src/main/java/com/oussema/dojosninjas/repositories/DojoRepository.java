package com.oussema.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussema.dojoandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	// Read All
	List<Dojo> findAll();

}