package com.cos.blog.test;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

import com.cos.blog.config.DB;

public class DBTest {
	
	@Test
	public void ��񿬰�() {
		Connection conn = DB.getConnection();
		assertNotNull(conn);
	}
}
