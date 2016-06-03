package com.springinaction.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.springinaction.springidol.PayNoDao;

public class DebtDao extends SimpleJdbcDaoSupport{
	public PayNoDao getPayNo(int userId){
		//getSimpleJdbcTemplate().query(sql, rm, args)
		return null;
	}
}
