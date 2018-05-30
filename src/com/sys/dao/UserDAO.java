package com.sys.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.sys.beans.User;
import com.sys.mybatis.ConnectionFactory;
import com.sys.mybatis.mappers.UserMapper;

public class UserDAO {

	public void insertUser(User u) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();

		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.insertUser(u);
			
			sqlSession.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

	public User selectUserById(int id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		User user = null;
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			user = userMapper.selectUserById(id);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return user;
	}
	
	public User selectUserByCredentials(HashMap<String, Object> params) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		User user = null;
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			user = userMapper.selectUserByCredentials(params);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return user;
	}

}
