package com.circle.mapper;

import java.util.List;
import java.util.Map;

import com.circle.entity.INVEST_MESSAGE;

public interface INVEST_MESSAGEMapper {
	int deleteByPrimaryKey(Integer imId);

	int insert(INVEST_MESSAGE record);

	int insertSelective(INVEST_MESSAGE record);

	INVEST_MESSAGE selectByPrimaryKey(Integer imId);

	int updateByPrimaryKeySelective(INVEST_MESSAGE record);

	int updateByPrimaryKey(INVEST_MESSAGE record);

	int count();

	List<INVEST_MESSAGE> queryall(Map<String, Object> m);
}