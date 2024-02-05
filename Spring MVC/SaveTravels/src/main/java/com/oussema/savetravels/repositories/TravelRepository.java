package com.oussema.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oussema.savetravels.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {
	List<Travel> findAll();
}