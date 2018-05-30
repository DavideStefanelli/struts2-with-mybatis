package com.sys.mybatis.mappers;

import java.util.HashMap;

import com.sys.beans.User;

public interface UserMapper {

	public User selectUserById(int id);
	public User selectUserByCredentials(HashMap<String, Object> params);
	
	public void insertUser(User u);

}
