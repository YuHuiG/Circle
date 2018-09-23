package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.ESSAY_MESSAGEBiz;
import com.circle.entity.ESSAY_MESSAGE;
import com.circle.mapper.ESSAY_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("eSSAY_MESSAGEBiz")
public class ESSAY_MESSAGEBizImpl implements ESSAY_MESSAGEBiz {
	@Autowired
	private ESSAY_MESSAGEMapper essay_MESSAGEMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer emId) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.deleteByPrimaryKey(emId);
	}

	@Transactional
	@Override
	public int insert(ESSAY_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(ESSAY_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.insertSelective(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public ESSAY_MESSAGE selectByPrimaryKey(Integer emId) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.selectByPrimaryKey(emId);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(ESSAY_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(ESSAY_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.updateByPrimaryKey(record);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.essay_MESSAGEMapper.count();
	}

	@Override
	public List<ESSAY_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		
		return this.essay_MESSAGEMapper.queryall(m);
	}

}
