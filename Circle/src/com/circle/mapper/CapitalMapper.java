package com.circle.mapper;

import java.util.List;
import java.util.Map;

import com.circle.entity.Capital;

public interface CapitalMapper {
	int deleteByPrimaryKey(Integer capId);

	int insert(Capital record);

	int insertSelective(Capital record);

	Capital selectByPrimaryKey(Integer capId);

	int updateByPrimaryKeySelective(Capital record);

	int updateByPrimaryKey(Capital record);

	List<Capital> queryall(Map<String, Object> m);

	int count();
}