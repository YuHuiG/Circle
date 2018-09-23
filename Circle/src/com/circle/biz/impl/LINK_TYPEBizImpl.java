package com.circle.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.LINK_TYPEBiz;
import com.circle.entity.LINK_TYPE;
import com.circle.mapper.LINK_TYPEMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("lINK_TYPEBiz")
public class LINK_TYPEBizImpl implements LINK_TYPEBiz {
	@Autowired
	private LINK_TYPEMapper link_TYPEMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer ltId) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.deleteByPrimaryKey(ltId);
	}

	@Transactional
	@Override
	public int insert(LINK_TYPE record) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(LINK_TYPE record) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.insertSelective(record);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public LINK_TYPE selectByPrimaryKey(Integer ltId) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.selectByPrimaryKey(ltId);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(LINK_TYPE record) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(LINK_TYPE record) {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<LINK_TYPE> queryAll() {
		// TODO Auto-generated method stub
		return this.link_TYPEMapper.queryAll();
	}

}
