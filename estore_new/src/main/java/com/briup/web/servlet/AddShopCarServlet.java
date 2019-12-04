package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Book;
import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.bean.ShopCarItem;
import com.briup.service.IBookService;
import com.briup.service.IShopcarService;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.ShopcarServiceImpl;


public class AddShopCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long bookId = Long.parseLong(request.getParameter("id"));
		int num = Integer.parseInt(request.getParameter("num"));
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		ShopCar car = (ShopCar) session.getAttribute("car");
		IShopcarService carService = new ShopcarServiceImpl();
		//通过BOOKID查询item，如果item存在，则更改item的num,如果不存在则创建item 
		ShopCarItem item = carService.findItemByBookId(bookId);
		IBookService bookService = new BookServiceImpl();
		Book book = bookService.findBookById(bookId);
		if(item!=null){
			item.setNum(item.getNum()+num);
			carService.updateItem(item);
		}else{
			item = new ShopCarItem();
			item.setBook(book);
			item.setCar(car);
			item.setNum(num);
			item.setCost(book.getPrice()*item.getNum());
			carService.saveItem(item);
		}
		
		String url = "/user/toShopCarServlet";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
