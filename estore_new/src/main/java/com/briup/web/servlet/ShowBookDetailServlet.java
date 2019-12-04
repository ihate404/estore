package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Book;
import com.briup.service.IBookService;
import com.briup.service.impl.BookServiceImpl;

public class ShowBookDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	IBookService bookService = new BookServiceImpl();
    	//根据id查询书籍的详细信息
    	long id = Long.parseLong(request.getParameter("id"));
    	Book book = bookService.findBookById(id);
    	request.setAttribute("book", book);
    	String url = "/WEB-INF/jsp/viewBook.jsp";
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
