package com.circle.biz;

import java.util.List;
import java.util.Map;

import com.circle.entity.OTHER_MESSAGE;

public interface OTHER_MESSAGEBiz {
	int deleteByPrimaryKey(Integer omId);

	int insert(OTHER_MESSAGE record);

	int insertSelective(OTHER_MESSAGE record);

	OTHER_MESSAGE selectByPrimaryKey(Integer omId);

	int updateByPrimaryKeySelective(OTHER_MESSAGE record);

	int updateByPrimaryKey(OTHER_MESSAGE record);

	int count();

	List<OTHER_MESSAGE> queryall(Map<String, Object> m);
}