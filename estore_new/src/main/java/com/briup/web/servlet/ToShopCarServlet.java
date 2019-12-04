package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.ShopCarItem;
import com.briup.service.IShopcarService;
import com.briup.service.impl.ShopcarServiceImpl;

public class ToShopCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/user/shopCar.jsp";
		//将订单项关联的书籍查出来
		IShopcarService carService = new ShopcarServiceImpl();
		List<ShopCarItem> items = carService.findItemWithBook();
		HttpSession session = request.getSession();
		session.setAttribute("items", items);
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
