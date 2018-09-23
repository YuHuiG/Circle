package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.INVEST_TYPEBiz;
import com.circle.entity.INVEST_TYPE;
import com.circle.mapper.INVEST_TYPEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("iNVEST_TYPEBiz")
public class INVEST_TYPEBizImpl implements INVEST_TYPEBiz {
	@Autowired
	private INVEST_TYPEMapper invest_TYPEMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer itId) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.deleteByPrimaryKey(itId);
	}

	@Transactional
	@Override
	public int insert(INVEST_TYPE record) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(INVEST_TYPE record) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.insertSelective(record);
	}

	@Transactional
	@Override
	public INVEST_TYPE selectByPrimaryKey(Integer itId) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.selectByPrimaryKey(itId);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(INVEST_TYPE record) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(INVEST_TYPE record) {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<INVEST_TYPE> Stypelist() {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.Stypelist();
	}

	@Override
	public List<INVEST_TYPE> Btypelist() {
		// TODO Auto-generated method stub
		return this.invest_TYPEMapper.Btypelist();
	}

}
