package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Category;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.CategoryMapper;
import com.briup.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService{

	@Override
	public List<Category> findFirstCategory() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CategoryMapper mapper = session.getMapper(CategoryMapper.class);
		List<Category> categoryies = mapper.selectFirstCategory();
		return categoryies;
	}

}
