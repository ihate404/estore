package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.common.ServiceException;
import com.briup.service.ICustomerService;
import com.briup.service.IShopcarService;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.service.impl.ShopcarServiceImpl;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		ICustomerService service= new CustomerServiceImpl();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		IShopcarService shopCarService = new ShopcarServiceImpl();
		try {
			Customer customer = service.login(name, password);
			session.setAttribute("customer", customer);
			//判断该用户是否有购物车,如果没有则创建,有则拿来用
			ShopCar car = shopCarService.findcarByCustomer(customer.getId());
			if(car==null){
				car = new ShopCar(null, customer, 0.0);
				shopCarService.saveShopcar(car);
			}
			session.setAttribute("car", car);
			url = "/toIndexServlet";
		} catch (ServiceException e) {
			url = "/toLoginServlet";
			String msg = e.getMessage();
			request.setAttribute("msg", msg);
			e.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
