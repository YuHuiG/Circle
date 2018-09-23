package com.circle.biz;

import java.util.List;
import java.util.Map;

import com.circle.entity.ESSAY_MESSAGE;

public interface ESSAY_MESSAGEBiz {
	int deleteByPrimaryKey(Integer emId);

	int insert(ESSAY_MESSAGE record);

	int insertSelective(ESSAY_MESSAGE record);

	ESSAY_MESSAGE selectByPrimaryKey(Integer emId);

	int updateByPrimaryKeySelective(ESSAY_MESSAGE record);

	int updateByPrimaryKey(ESSAY_MESSAGE record);

	int count();

	List<ESSAY_MESSAGE> queryall(Map<String, Object> m);
}