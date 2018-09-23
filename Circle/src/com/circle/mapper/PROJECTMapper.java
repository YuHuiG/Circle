package com.circle.mapper;

import java.util.List;

import com.circle.entity.PROJECT;

public interface PROJECTMapper {
	List<PROJECT> Sprojectlist();

	List<PROJECT> Bprojectlist();

	int deleteByPrimaryKey(Integer pId);

	int insert(PROJECT record);

	int insertSelective(PROJECT record);

	PROJECT selectByPrimaryKey(Integer pId);

	int updateByPrimaryKeySelective(PROJECT record);

	int updateByPrimaryKey(PROJECT record);
}