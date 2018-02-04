/**
 * 
 */
package com.capitalone.moneymovement.example.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.myorg.ecomm.sample.model.ExampleData;
import com.myorg.ecomm.sample.repository.SampleRepository;
import com.myorg.ecomm.sample.service.SampleServiceImpl;

/**
 * @author hjp299
 *
 */
public class ExampleServiceImplTest {

	@InjectMocks
	SampleServiceImpl service;
	
	@Mock
	SampleRepository repository;
	
	private ExampleData data;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		initMocks(this);
		data = new ExampleData();
		data.setId("id");
	}

	@Test
	public void testGetExampleData() {
		when(repository.findById(data.getId())).thenReturn(data);
		ExampleData retrievedData = service.getExampleData(data.getId());
		assertNotNull(retrievedData);
	}
	@Test
	public void testCreateExampleData() {
		when(repository.save(data)).thenReturn(data);
		ExampleData createdData = service.createExampleData(data);
		assertEquals(createdData.getId(), data.getId());
	}
	@Test
	public void testUpdateExampleData() {
		data.setId("1");
		when(repository.save(data)).thenReturn(data);
		ExampleData updatedData = service.updateExampleData(data);
		assertEquals(updatedData.getId(), data.getId());
	}
	@Test
	public void testRemoveExampleData() {
		when(repository.findById(data.getId())).thenReturn(data);
		service.removeExampleData(data);
	}
	

}
