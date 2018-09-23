package com.circle.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.WebbiBiz;
import com.circle.entity.Webbi;
import com.circle.mapper.WebbiMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("webbiBiz")
public class WebbiBizImpl implements WebbiBiz {
	@Autowired
	private WebbiMapper webbiMapper;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public Webbi selectByPrimaryKey(Integer id) {
		Webbi wb = this.webbiMapper.selectByPrimaryKey(id);
		return wb;
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(Webbi record) {
		return this.webbiMapper.updateByPrimaryKey(record);
	}

}
