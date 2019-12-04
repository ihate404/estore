package com.briup.dao;

import java.util.List;

import com.briup.bean.Book;
import com.briup.bean.ShopCar;
import com.briup.bean.ShopCarItem;

public interface ShopCarMapper {
	public ShopCar selectCarByCustomerid(long customerId);
	public void insertCar(ShopCar shopcar);
	public void insertItem(ShopCarItem item);
	public void updateShopCarItem(ShopCarItem item);
	public ShopCarItem selectItemByBookId(long book_id);
	public List<ShopCarItem>selectItemWithBook();
}
