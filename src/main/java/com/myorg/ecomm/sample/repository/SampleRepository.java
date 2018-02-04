/**
 * 
 */
package com.myorg.ecomm.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.myorg.ecomm.sample.model.ExampleData;

/**
 * @author hjp299
 *
 */
public interface SampleRepository extends CrudRepository<ExampleData, String> {
	
	public ExampleData findById(String id);

}
