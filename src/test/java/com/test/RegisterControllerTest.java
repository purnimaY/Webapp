package com.test;



import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.controller.RegisterController;
import com.spring.model.User;
@RunWith(MockitoJUnitRunner.class)
public class RegisterControllerTest extends Mockito{
	
	@Test
	public void testServlet(){
		RegisterController controller = new RegisterController();
		Map<String, Object> model = new HashMap<String, Object>();
		String result = controller.viewRegistration(model);
		
		assertEquals("Registration", result);
		
	}

	
	@Test
	public void testServletp(){
		RegisterController controller = new RegisterController();
		User user = new User();
		user.setUsername("nayan");
		user.setPassword("hello");
		user.setEmail("nayan@gmail.com");
		user.setProfession("Devops");
		Map<String, Object> model = new HashMap<String, Object>();
		String result = controller.processRegistration(user,model);
		
		
		//assertEquals("/Registration", result);
		
	}
}
