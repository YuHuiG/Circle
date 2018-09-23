package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.ESSAY_TYPEBiz;
import com.circle.entity.ESSAY_TYPE;
import com.circle.mapper.ESSAY_TYPEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("eSSAY_TYPEBiz")
public class ESSAY_TYPEBizImpl implements ESSAY_TYPEBiz {
	@Autowired
	private ESSAY_TYPEMapper essay_TYPEMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer etId) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.deleteByPrimaryKey(etId);
	}

	@Transactional
	@Override
	public int insert(ESSAY_TYPE record) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(ESSAY_TYPE record) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.insertSelective(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public ESSAY_TYPE selectByPrimaryKey(Integer etId) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.selectByPrimaryKey(etId);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(ESSAY_TYPE record) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(ESSAY_TYPE record) {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<ESSAY_TYPE> Stypelist() {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.Stypelist();
	}

	@Override
	public List<ESSAY_TYPE> Btypelist() {
		// TODO Auto-generated method stub
		return this.essay_TYPEMapper.Btypelist();
	}

}
