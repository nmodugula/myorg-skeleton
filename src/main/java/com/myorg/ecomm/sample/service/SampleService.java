/**
 * 
 */
package com.myorg.ecomm.sample.service;

import com.myorg.ecomm.sample.model.ExampleData;

/**
 * @author hjp299
 *
 */
public interface SampleService {
	
	public ExampleData getExampleData(String id);
	
	public ExampleData createExampleData(ExampleData data);
	
	public ExampleData updateExampleData(ExampleData data);
	
	public void removeExampleData(ExampleData data);

}
