package com.example.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestApplicationTests {

	@Mock
	MyPojo mp;
	
	@Test
	public void contextLoads() {
		System.out.println(mp);
	}

}
