package com.cos.blog.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cos.blog.config.DB;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.mysql.cj.protocol.Resultset;

public class UserDao {

	public int findByUsername(String username) { // ȸ������
		
		String sql = "SELECT * FORM user WHERE username = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt =  conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { // ������ ����
			DB.close(conn, pstmt, rs);
		}
		return -1;
		
	}
	
	public int save(JoinReqDto dto) { // ȸ������
		
		String sql = "INSERT INTO user(username, password, email, address, userRole, createDate) VALUES(?,?,?,?,?,now())";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt =  conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUsername());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());
			int result = pstmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { // ������ ����
			DB.close(conn, pstmt);
		}
		return -1;
		
	}

	public void update() { // ȸ������
		
	}
	
	public void usernameCheck() { // ���̵� �ߺ� üũ
		
	}
	
	public void findById() { // ȸ������ ����
		
	}
	
}
