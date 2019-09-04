package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {

		Assert.assertNotEquals(null, context);
		Assert.assertEquals("demo", context.getId());
		User user = context.getBean(User.class);
		Assert.assertNotEquals(null, user);
		Assert.assertEquals(0, user.getAge());
	}

}
