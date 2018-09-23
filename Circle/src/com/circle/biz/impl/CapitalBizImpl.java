package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.CapitalBiz;
import com.circle.entity.Capital;
import com.circle.mapper.CapitalMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("capitalBiz")
public class CapitalBizImpl implements CapitalBiz {
	@Autowired
	private CapitalMapper capitalMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer capId) {
		// TODO Auto-generated method stub
		int de = this.capitalMapper.deleteByPrimaryKey(capId);
		return de;
	}

	@Transactional
	@Override
	public int insert(Capital record) {
		// TODO Auto-generated method stub

		return this.capitalMapper.insert(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public Capital selectByPrimaryKey(Integer capId) {
		// TODO Auto-generated method stub
		Capital cap = this.capitalMapper.selectByPrimaryKey(capId);
		return cap;
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Capital record) {
		// TODO Auto-generated method stub
		return this.capitalMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(Capital record) {
		// TODO Auto-generated method stub
		return this.capitalMapper.updateByPrimaryKey(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public List<Capital> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.capitalMapper.queryall(m);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.capitalMapper.count();
	}

}
