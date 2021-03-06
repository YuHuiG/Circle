package com.circle.mapper;

import java.util.List;

import com.circle.entity.Capital;
import com.circle.entity.CapitalType;

public interface CapitalTypeMapper {
    int deleteByPrimaryKey(Integer ccId);

    int insert(CapitalType record);

    int insertSelective(CapitalType record);

    CapitalType selectByPrimaryKey(Integer ccId);

    int updateByPrimaryKeySelective(CapitalType record);

    int updateByPrimaryKey(CapitalType record);
    
	List<CapitalType> querybigtype();

	List<CapitalType> querysmalltype();
}