package com.spring.springFramework.BussinessConcretes;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springFramework.BussinessAbstracts.IUserService;
import com.spring.springFramework.Core.Utilities.Results.DataResult;
import com.spring.springFramework.Core.Utilities.Results.Result;
import com.spring.springFramework.Core.Utilities.Results.SuccessDataResult;
import com.spring.springFramework.Core.Utilities.Results.SuccessResult;
import com.spring.springFramework.DataAccessLyr.Abstracts.IUserDao;
import com.spring.springFramework.Entities.Concretes.User;

@Service
public class UserManager implements IUserService {

	private IUserDao userDao;

	@Autowired
	public UserManager(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı başarılı bir şekilde oluşturuldu!");
	}

}
