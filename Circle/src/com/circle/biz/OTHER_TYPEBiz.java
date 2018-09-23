package com.circle.biz;

import java.util.List;

import com.circle.entity.OTHER_TYPE;

public interface OTHER_TYPEBiz {

	List<OTHER_TYPE> Stypelist();

	List<OTHER_TYPE> Btypelist();

	int deleteByPrimaryKey(Integer otId);

	int insert(OTHER_TYPE record);

	int insertSelective(OTHER_TYPE record);

	OTHER_TYPE selectByPrimaryKey(Integer otId);

	int updateByPrimaryKeySelective(OTHER_TYPE record);

	int updateByPrimaryKey(OTHER_TYPE record);
}