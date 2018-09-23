package com.circle.mapper;

import java.util.List;
import java.util.Map;

import com.circle.entity.INVEST_USER_MESSAGE;

public interface INVEST_USER_MESSAGEMapper {
	int deleteByPrimaryKey(Integer iumId);

	int insert(INVEST_USER_MESSAGE record);

	int insertSelective(INVEST_USER_MESSAGE record);

	INVEST_USER_MESSAGE selectByPrimaryKey(Integer iumId);

	int updateByPrimaryKeySelective(INVEST_USER_MESSAGE record);

	int updateByPrimaryKey(INVEST_USER_MESSAGE record);

	int count();

	List<INVEST_USER_MESSAGE> queryall(Map<String, Object> m);
}