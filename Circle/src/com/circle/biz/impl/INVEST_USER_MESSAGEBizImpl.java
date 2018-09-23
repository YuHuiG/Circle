package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.INVEST_USER_MESSAGEBiz;
import com.circle.entity.INVEST_USER_MESSAGE;
import com.circle.mapper.INVEST_USER_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("iNVEST_USER_MESSAGEBiz")
public class INVEST_USER_MESSAGEBizImpl implements INVEST_USER_MESSAGEBiz {
	@Autowired
	private INVEST_USER_MESSAGEMapper invest_USER_MESSAGEMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer iumId) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.deleteByPrimaryKey(iumId);
	}
	@Transactional
	@Override
	public int insert(INVEST_USER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(INVEST_USER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public INVEST_USER_MESSAGE selectByPrimaryKey(Integer iumId) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.selectByPrimaryKey(iumId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(INVEST_USER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(INVEST_USER_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.updateByPrimaryKey(record);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.count();
	}
	@Override
	public List<INVEST_USER_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.invest_USER_MESSAGEMapper.queryall(m);
	}

}
