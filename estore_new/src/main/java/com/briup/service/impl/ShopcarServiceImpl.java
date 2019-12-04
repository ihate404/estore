package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Book;
import com.briup.bean.ShopCar;
import com.briup.bean.ShopCarItem;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.BookMapper;
import com.briup.dao.ShopCarMapper;
import com.briup.service.IBookService;
import com.briup.service.IShopcarService;

public class ShopcarServiceImpl implements IShopcarService{

	@Override
	public void saveShopcar(ShopCar shopcar) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		mapper.insertCar(shopcar);
		session.commit();
	}

	@Override
	public ShopCar findcarByCustomer(long customer_id) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		ShopCar car = mapper.selectCarByCustomerid(customer_id);
		return car;
	}

	@Override
	public void saveItem(ShopCarItem item) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		mapper.insertItem(item);
		session.commit();
	}

	@Override
	public void updateItem(ShopCarItem item) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		mapper.updateShopCarItem(item);
		session.commit();
		
	}

	@Override
	public ShopCarItem findItemByBookId(long book_id) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		ShopCarItem item = mapper.selectItemByBookId(book_id);
		return item;
	}

	@Override
	public List<ShopCarItem> findItemWithBook() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();	
		ShopCarMapper mapper = session.getMapper(ShopCarMapper.class);
		List<ShopCarItem> items = mapper.selectItemWithBook();
		return items;
	}

	
	
}
