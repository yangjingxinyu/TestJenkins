package com.yang.jing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yang.jing.domain.User;
import com.yang.jing.domain.UserExample;
//@Service("userQueryService")
public interface UserQueryService {
	public List<User> selectByExample(UserExample example);
	public User selectByPrimaryKey(Integer userId);
}
