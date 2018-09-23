package com.circle.biz;

import java.util.List;
import java.util.Map;

import com.circle.entity.LINK_MESSAGE;

public interface LINK_MESSAGEBiz {
	int deleteByPrimaryKey(Integer lmId);

	int insert(LINK_MESSAGE record);

	int insertSelective(LINK_MESSAGE record);

	LINK_MESSAGE selectByPrimaryKey(Integer lmId);

	int updateByPrimaryKeySelective(LINK_MESSAGE record);

	int updateByPrimaryKey(LINK_MESSAGE record);

	int count();

	List<LINK_MESSAGE> queryall(Map<String, Object> m);
}