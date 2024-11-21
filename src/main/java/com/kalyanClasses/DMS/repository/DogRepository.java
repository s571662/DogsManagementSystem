package com.kalyanClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.kalyanClasses.DMS.Models.Dog;


/**
 * @author S571662(KALYAN CHAKRAVARTHY JOGULA)
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
