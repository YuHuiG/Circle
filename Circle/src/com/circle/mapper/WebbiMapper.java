package com.circle.mapper;

import com.circle.entity.Webbi;

public interface WebbiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Webbi record);

    int insertSelective(Webbi record);

    Webbi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Webbi record);

    int updateByPrimaryKey(Webbi record);
}