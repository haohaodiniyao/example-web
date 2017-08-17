package com.example.base.server.user.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.base.mapper.User;
import com.example.base.mapper.UserMapper;
import com.example.base.server.user.UserService;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void saveUser(User user) throws Exception{
		userMapper.insert(user);
		throw new Exception();
	}

}
