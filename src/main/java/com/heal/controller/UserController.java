package com.heal.controller;

import com.heal.domain.User;
import com.heal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author by jiaxu
 * @Classname UserController
 * @Date 2023/3/30 19:34
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	//http://localhost:8080/findUserById?id=1
	@RequestMapping("/findUserById")
	public User findUserById(int id){
		return userService.findUserById(id);
	}

}