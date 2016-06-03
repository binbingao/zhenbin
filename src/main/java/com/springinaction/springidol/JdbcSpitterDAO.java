package com.springinaction.springidol;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SpinnerModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcSpitterDAO{
	
	private JdbcTemplate jdbcTemplate;
	private final String SQL_QUERY_INFO="select payNo from db_debt where id= :userId";
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public PayNoDao getPayNoByUserId(int userId){
		return jdbcTemplate.queryForObject(SQL_QUERY_INFO, new ParameterizedRowMapper<PayNoDao>() {
			public PayNoDao mapRow(ResultSet rs,int rowNum) throws SQLException{
				PayNoDao payNoDao=new PayNoDao();
				payNoDao.setPayNo(rs.getString(1));
				return payNoDao;
			}
		}, userId);
	}
	
}
