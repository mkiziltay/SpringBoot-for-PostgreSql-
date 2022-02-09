package com.spring.springFramework.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springFramework.BussinessAbstracts.IUserService;
import com.spring.springFramework.Core.Utilities.Results.DataResult;
import com.spring.springFramework.Core.Utilities.Results.Result;
import com.spring.springFramework.Entities.Concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private IUserService userService;

	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/all")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
}
