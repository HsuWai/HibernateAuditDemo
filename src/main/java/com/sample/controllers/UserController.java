package com.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.User;
import com.sample.service.UserService;


/**
 * @author HsuWaiWaiTun
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/find-all-users", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userService.findAll();
    }
	
	@RequestMapping(value = "/find-by-user", method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "username") String username) {
        return userService.findUserByUsername(username);
    }
	
	@RequestMapping(value = "/save-user", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user) {
		userService.create(user);
        return "Successfully Saved";
    }
	
	@RequestMapping(value = "/update-user", method = RequestMethod.POST)
	public String updateUser(@RequestBody User user) {
		userService.update(user);
        return "Successfully updated";
    }
	
	@RequestMapping(value = "/delete-user", method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value = "id", required = true) int id) {
		userService.deleteUser(id);
        return "Successfully deleted";
    }
}
