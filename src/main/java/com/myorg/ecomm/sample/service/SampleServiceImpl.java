/**
 * 
 */
package com.myorg.ecomm.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.ecomm.sample.model.ExampleData;
import com.myorg.ecomm.sample.repository.SampleRepository;
/**
 * @author hjp299
 *
 */

@Service
public class SampleServiceImpl implements SampleService{

	@Autowired
	SampleRepository sampleRepository;
	/**
	 * @param id
	 * @return
	 */
	public ExampleData getExampleData(String id){
		return sampleRepository.findById(id);
		
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	public ExampleData createExampleData(ExampleData data){
		return sampleRepository.save(data);
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	public ExampleData updateExampleData(ExampleData data){
		return sampleRepository.save(data);
		
	}
	/**
	 * @param data
	 */
	public void removeExampleData(ExampleData data){
		 sampleRepository.delete(data);
		
	}
	
}
