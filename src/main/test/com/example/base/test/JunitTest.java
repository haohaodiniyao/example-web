package com.example.base.test;

import org.dolphin.commons.config.ProviderConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root.xml"})
public class JunitTest {
	@Autowired
	private ProviderConfig providerConfig;
	@Test
	public void test() {
		System.out.println(providerConfig);
	}

}
