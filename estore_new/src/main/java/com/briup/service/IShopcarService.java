package com.briup.service;

import java.util.List;

import javax.sql.rowset.serial.SerialException;

import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.bean.ShopCarItem;
import com.briup.common.ServiceException;

public interface IShopcarService {
	public void saveShopcar(ShopCar shopcar);
	public ShopCar findcarByCustomer(long customer_id);
	public void saveItem(ShopCarItem item);
	public void updateItem(ShopCarItem item);
	public ShopCarItem findItemByBookId(long book_id);
	public List<ShopCarItem>findItemWithBook();
}
