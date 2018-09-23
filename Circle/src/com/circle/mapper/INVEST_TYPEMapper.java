package com.circle.mapper;

import java.util.List;

import com.circle.entity.INVEST_TYPE;



public interface INVEST_TYPEMapper {
	List<INVEST_TYPE> Stypelist();

	List<INVEST_TYPE> Btypelist();

	int deleteByPrimaryKey(Integer itId);

	int insert(INVEST_TYPE record);

	int insertSelective(INVEST_TYPE record);

	INVEST_TYPE selectByPrimaryKey(Integer itId);

	int updateByPrimaryKeySelective(INVEST_TYPE record);

	int updateByPrimaryKey(INVEST_TYPE record);
}