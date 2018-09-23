package com.circle.biz;

import java.util.List;

import com.circle.entity.CapitalType;

public interface CapitalTypeBiz {

	int deleteByPrimaryKey(Integer ccId);

	int insert(CapitalType record);

	CapitalType selectByPrimaryKey(Integer ccId);

	int updateByPrimaryKeySelective(CapitalType record);

	int updateByPrimaryKey(CapitalType record);

	List<CapitalType> querybigtype();

	List<CapitalType> querysmalltype();
}