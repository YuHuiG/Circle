package com.circle.mapper;

import java.util.List;

import com.circle.entity.LINK_TYPE;

public interface LINK_TYPEMapper {
	int deleteByPrimaryKey(Integer ltId);

	int insert(LINK_TYPE record);

	int insertSelective(LINK_TYPE record);

	LINK_TYPE selectByPrimaryKey(Integer ltId);

	List<LINK_TYPE> queryAll();

	int updateByPrimaryKeySelective(LINK_TYPE record);

	int updateByPrimaryKey(LINK_TYPE record);
}