package dev;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yang.jing.Application;
import com.yang.jing.controller.UserController;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringApplicationConfiguration(classes = Application.class)  
@WebAppConfiguration  
public class UserControllerTest {
	@Resource
	private UserController controller;
	 @Test  
	 public void testGetUser(){
		 String result = controller.getUser("", "");
		 String expectResult = "ok";
//		 Assert.assertEquals(expectResult, result);
	 }
}
