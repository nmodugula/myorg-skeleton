/**
 * 
 */
package com.capitalone.moneymovement.example.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.myorg.ecomm.sample.controller.SampleController;
import com.myorg.ecomm.sample.model.ExampleData;
import com.myorg.ecomm.sample.service.SampleServiceImpl;

/**
 * @author hjp299
 *
 */
public class ExampleControllerTest {
	
	@Mock
	SampleServiceImpl service;
	
	@InjectMocks
	SampleController controller;
	
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
		when(service.getExampleData(data.getId())).thenReturn(data);
		ExampleData retrievedData = controller.getExampleData(data.getId());
		assertNotNull(retrievedData);
	}
	@Test
	public void testCreateExampleData() {
		when(service.createExampleData(data)).thenReturn(data);
		ExampleData createdData = controller.createExampleData(data);
		assertEquals(createdData.getId(), data.getId());
	}
	@Test
	public void testUpdateExampleData() {
		data.setId("1");
		when(service.updateExampleData(data)).thenReturn(data);
		ExampleData createdData = controller.updateExampleData(data);
		assertEquals(createdData.getId(), data.getId());
	}
	@Test
	public void testRemoveExampleData() {
		when(service.createExampleData(data)).thenReturn(null);
		controller.removeExampleData(data);
	}

}
