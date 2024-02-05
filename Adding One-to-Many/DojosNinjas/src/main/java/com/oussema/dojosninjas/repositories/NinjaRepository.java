package com.oussema.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussema.dojoandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	// Read All
	List<Ninja> findAll();

}