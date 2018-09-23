package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.CapitalTypeBiz;
import com.circle.entity.CapitalType;
import com.circle.mapper.CapitalTypeMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("capitalTypeBiz")
public class CapitalTypeBizImpl implements CapitalTypeBiz {
	@Autowired
	private CapitalTypeMapper capitalTypeMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer ccId) {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.deleteByPrimaryKey(ccId);
	}
	@Transactional
	@Override
	public int insert(CapitalType record) {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.insert(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public CapitalType selectByPrimaryKey(Integer ccId) {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.selectByPrimaryKey(ccId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(CapitalType record) {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(CapitalType record) {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.updateByPrimaryKey(record);
	}
	@Transactional
	@Override
	public List<CapitalType> querybigtype() {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.querybigtype();
	}
	@Transactional
	@Override
	public List<CapitalType> querysmalltype() {
		// TODO Auto-generated method stub
		return this.capitalTypeMapper.querysmalltype();
	}

}
