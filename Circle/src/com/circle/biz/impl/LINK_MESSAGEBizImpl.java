package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.LINK_MESSAGEBiz;
import com.circle.entity.LINK_MESSAGE;
import com.circle.mapper.LINK_MESSAGEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("lINK_MESSAGEBiz")
public class LINK_MESSAGEBizImpl implements LINK_MESSAGEBiz {
	@Autowired
	private LINK_MESSAGEMapper link_MESSAGEMapper;
	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer lmId) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.deleteByPrimaryKey(lmId);
	}
	@Transactional
	@Override
	public int insert(LINK_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.insert(record);
	}
	@Transactional
	@Override
	public int insertSelective(LINK_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.insertSelective(record);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public LINK_MESSAGE selectByPrimaryKey(Integer lmId) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.selectByPrimaryKey(lmId);
	}
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(LINK_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	@Override
	public int updateByPrimaryKey(LINK_MESSAGE record) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.updateByPrimaryKey(record);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.count();
	}
	@Override
	public List<LINK_MESSAGE> queryall(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return this.link_MESSAGEMapper.queryall(m);
	}

}
