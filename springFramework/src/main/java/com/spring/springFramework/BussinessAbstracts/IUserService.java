package com.spring.springFramework.BussinessAbstracts;

import java.util.List;

import com.spring.springFramework.Core.Utilities.Results.DataResult;
import com.spring.springFramework.Core.Utilities.Results.Result;
import com.spring.springFramework.Entities.Concretes.User;

public interface IUserService {

	DataResult<List<User>> getAll();

	Result add(User user);

}