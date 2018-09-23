package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.PROJECT_MESSAGEBiz;
import com.circle.entity.PROJECT_MESSAGE;
import com.circle.mapper.PROJECT_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("pROJECT_MESSAGEBiz")
public class PROJECT_MESSAGEBizImpl implements PROJECT_MESSAGEBiz {
	@Autowired
	private PROJECT_MESSAGEMapper project_MESSAGEMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer pmId) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.deleteByPrimaryKey(pmId);
	}
	@Transactional
	@Override
	public int insert(PROJECT_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(PROJECT_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public PROJECT_MESSAGE selectByPrimaryKey(Integer pmId) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.selectByPrimaryKey(pmId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(PROJECT_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(PROJECT_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.updateByPrimaryKey(record);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.count();
	}
	@Override
	public List<PROJECT_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.project_MESSAGEMapper.queryall(m);
	}

}
