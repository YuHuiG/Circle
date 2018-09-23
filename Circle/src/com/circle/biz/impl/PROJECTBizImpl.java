package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.PROJECTBiz;
import com.circle.entity.PROJECT;
import com.circle.mapper.PROJECTMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("pROJECTBiz")
public class PROJECTBizImpl implements PROJECTBiz {
	@Autowired
	private PROJECTMapper projectMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer pId) {
		// TODO Auto-generated method stub
		return this.projectMapper.deleteByPrimaryKey(pId);
	}

	@Transactional
	@Override
	public int insert(PROJECT record) {
		// TODO Auto-generated method stub
		return this.projectMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(PROJECT record) {
		// TODO Auto-generated method stub
		return this.projectMapper.insertSelective(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public PROJECT selectByPrimaryKey(Integer pId) {
		// TODO Auto-generated method stub
		return this.projectMapper.selectByPrimaryKey(pId);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(PROJECT record) {
		// TODO Auto-generated method stub
		return this.projectMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(PROJECT record) {
		// TODO Auto-generated method stub
		return this.projectMapper.updateByPrimaryKey(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public List<PROJECT> Sprojectlist() {
		// TODO Auto-generated method stub
		return this.projectMapper.Sprojectlist();
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public List<PROJECT> Bprojectlist() {
		// TODO Auto-generated method stub
		return this.projectMapper.Bprojectlist();
	}

}
