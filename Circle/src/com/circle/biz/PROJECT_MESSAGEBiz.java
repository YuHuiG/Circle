package com.circle.biz;

import java.util.List;
import java.util.Map;

import com.circle.entity.PROJECT_MESSAGE;

public interface PROJECT_MESSAGEBiz {
	int deleteByPrimaryKey(Integer pmId);

	int insert(PROJECT_MESSAGE record);

	int insertSelective(PROJECT_MESSAGE record);

	PROJECT_MESSAGE selectByPrimaryKey(Integer pmId);

	int updateByPrimaryKeySelective(PROJECT_MESSAGE record);

	int updateByPrimaryKey(PROJECT_MESSAGE record);

	int count();

	List<PROJECT_MESSAGE> queryall(Map<String, Object> m);

}