package com.circle.biz;

import java.util.List;
import java.util.Map;

import com.circle.entity.Users;

public interface UsersBiz {
	// 登录
	public Users login(Users u);

	// 查询
	public List<Users> queryAll(Map<String, Object> m);

	public int count();

	// 增加
	public boolean Add(Users u);

	// 删除
	public boolean delete(int id);

	// 修改（先根据id查询信息再进行修改）
	public Users queryid(int id);

	public boolean update(Users u);
}
