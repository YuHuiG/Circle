package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.INVEST_MESSAGEBiz;
import com.circle.entity.INVEST_MESSAGE;
import com.circle.mapper.INVEST_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("iNVEST_MESSAGEBiz")
public class INVEST_MESSAGEBizImpl implements INVEST_MESSAGEBiz {
	@Autowired
	private INVEST_MESSAGEMapper invest_MESSAGEMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer imId) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.deleteByPrimaryKey(imId);
	}
	@Transactional
	@Override
	public int insert(INVEST_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(INVEST_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public INVEST_MESSAGE selectByPrimaryKey(Integer imId) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.selectByPrimaryKey(imId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(INVEST_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(INVEST_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.updateByPrimaryKey(record);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.count();
	}
	@Override
	public List<INVEST_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.invest_MESSAGEMapper.queryall(m);
	}

}
