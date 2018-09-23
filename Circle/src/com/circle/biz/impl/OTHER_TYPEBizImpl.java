package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.OTHER_TYPEBiz;
import com.circle.entity.OTHER_TYPE;
import com.circle.mapper.OTHER_TYPEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("oTHER_TYPEBiz")
public class OTHER_TYPEBizImpl implements OTHER_TYPEBiz {
	@Autowired
	private OTHER_TYPEMapper other_TYPEMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer otId) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.deleteByPrimaryKey(otId);
	}
	@Transactional
	@Override
	public int insert(OTHER_TYPE record) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(OTHER_TYPE record) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public OTHER_TYPE selectByPrimaryKey(Integer otId) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.selectByPrimaryKey(otId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(OTHER_TYPE record) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(OTHER_TYPE record) {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<OTHER_TYPE> Stypelist() {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.Stypelist();
	}
	@Override
	public List<OTHER_TYPE> Btypelist() {
		// TODO Auto-generated method stub
		return this.other_TYPEMapper.Btypelist();
	}

}
