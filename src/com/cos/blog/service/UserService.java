package com.cos.blog.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cos.blog.config.DB;
import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.UserDao;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.domain.user.dto.UpdateReqDto;

public class UserService {
	
	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public int ȸ������(JoinReqDto dto) {
		int result = userDao.save(dto);
		return result;
	}
	
	public User �α���(LoginReqDto dto) {
		return null;
	}
	
	public int ȸ������(UpdateReqDto dto) {
		return -1;
	}
	
	public int ���������ߺ�üũ(String username) {
		int result = userDao.findByUsername(username);
		return result;
	}
}
