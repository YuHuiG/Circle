package com.circle.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.circle.biz.UsersBiz;
import com.circle.entity.Users;
import com.circle.mapper.UsersMapper;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("usersBiz")
public class UsersBizImpl implements UsersBiz {

	@Autowired
	private UsersMapper usersmapper;

	@Transactional
	@Override
	public Users login(Users u) {

		return this.usersmapper.login(u);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public List<Users> queryAll(Map<String, Object> m) {

		return this.usersmapper.queryAll(m);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public int count() {

		return this.usersmapper.count();

	}

	@Transactional
	@Override
	public boolean Add(Users u) {

		return this.usersmapper.Add(u);
	}

	@Transactional
	@Override
	public boolean delete(int id) {

		return this.usersmapper.delete(id);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public Users queryid(int id) {

		return this.usersmapper.queryid(id);
	}

	@Transactional
	@Override
	public boolean update(Users u) {
		return this.usersmapper.update(u);
	}

}
