package com.circle.biz;

import com.circle.entity.Webbi;

public interface WebbiBiz {

	Webbi selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(Webbi record);
}
