/**
 * 
 */
package com.myorg.ecomm.sample.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.myorg.ecomm.sample.model.ExampleData;
import com.myorg.ecomm.sample.service.SampleService;

import javax.ws.rs.GET;
import java.net.HttpURLConnection;

/**
 * @author hjp299
 *
 */
@RestController
@Api(value = "Sample")
@RequestMapping(value = "/sample")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	/**
	 * @param id
	 * @return
	 */
	@GET
	@RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
	@ApiResponses({
			@ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Success", response = ExampleData.class )
	})
	@ResponseStatus(HttpStatus.OK)
	public ExampleData getExampleData(@ApiParam(name = "id", required = true) @PathVariable("id")  String id){
		return sampleService.getExampleData(id);
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ExampleData createExampleData(@ApiParam(name = "data", required = true) ExampleData data){
		return sampleService.createExampleData(data);
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public ExampleData updateExampleData(@ApiParam(name = "data", required = true)ExampleData data){
		return sampleService.updateExampleData(data);
		
	}
	/**
	 * @param data
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeExampleData(@ApiParam(name = "data", required = true)ExampleData data){
		 sampleService.removeExampleData(data);
		
	}

}
