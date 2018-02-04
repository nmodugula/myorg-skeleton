package com.capitalone.moneymovement.contracts;
        
import org.junit.Before;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.myorg.ecomm.sample.controller.SampleController;
import com.myorg.ecomm.sample.model.ExampleData;
import com.myorg.ecomm.sample.service.SampleService;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


/**
  * Created by nul446 on 11/1/16.
  */
public class ContractVerifierBase {

    @Mock
    SampleService service;

    @InjectMocks
    SampleController controller;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ExampleData data = new ExampleData();
        data.setId("identifier");
        Mockito.when(service.getExampleData("identifier")).thenReturn(data);


        RestAssuredMockMvc.standaloneSetup(controller);
    }
    
}
