package com.example.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class TEst {
public static void main(String[] args) throws JsonProcessingException {
	 DataProviderStrategy strategy = new MyDataProviderStrategyImpl();

	 PodamFactory factory = new PodamFactoryImpl(strategy);
//	 PodamFactory factory = new PodamFactoryImpl();
	 MyPojo myPojo = factory.manufacturePojo(MyPojo .class);
	 System.out.println(new ObjectMapper().writeValueAsString(myPojo));
	 
} 
}
