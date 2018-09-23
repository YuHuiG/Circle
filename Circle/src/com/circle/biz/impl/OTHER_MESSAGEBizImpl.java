package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.OTHER_MESSAGEBiz;
import com.circle.entity.OTHER_MESSAGE;
import com.circle.mapper.OTHER_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("oTHER_MESSAGEBiz")
public class OTHER_MESSAGEBizImpl implements OTHER_MESSAGEBiz {
	@Autowired
	private OTHER_MESSAGEMapper other_MESSAGEMappers;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer omId) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.deleteByPrimaryKey(omId);
	}
	@Transactional
	@Override
	public int insert(OTHER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(OTHER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public OTHER_MESSAGE selectByPrimaryKey(Integer omId) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.selectByPrimaryKey(omId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(OTHER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(OTHER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.updateByPrimaryKey(record);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.count();
	}
	@Override
	public List<OTHER_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.other_MESSAGEMappers.queryall(m);
	}

}
