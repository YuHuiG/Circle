package com.circle.mapper;

import java.util.List;

import com.circle.entity.ESSAY_TYPE;

public interface ESSAY_TYPEMapper {
	int deleteByPrimaryKey(Integer etId);

	int insert(ESSAY_TYPE record);

	int insertSelective(ESSAY_TYPE record);

	ESSAY_TYPE selectByPrimaryKey(Integer etId);

	int updateByPrimaryKeySelective(ESSAY_TYPE record);

	int updateByPrimaryKey(ESSAY_TYPE record);

	List<ESSAY_TYPE> Stypelist();

	List<ESSAY_TYPE> Btypelist();
}