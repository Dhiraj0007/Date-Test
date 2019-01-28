package com.dhiraj.datetest;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dhiraj.datetest.model.User;
import com.dhiraj.datetest.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:servlet-context.xml"})
@Rollback
public class HomeControllerTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void signupSuccess() {
		User user=new User();
		user.setEmailAddress("dhiru@gmail.com");
		user.setPassword("Dhiru@123");
		user.setPhone("7737304026");
		Response response = userService.signup(user);
		assertEquals(Status.SUCCESS.message(), response.getMessage());
	}

}
