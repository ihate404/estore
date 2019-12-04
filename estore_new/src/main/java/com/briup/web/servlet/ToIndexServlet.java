package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.service.IBookService;
import com.briup.service.ICategoryService;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.CategoryServiceImpl;
@WebServlet("/toIndexServlet")
public class ToIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询图书分类信息
		ICategoryService categoryService = new CategoryServiceImpl();
		List<Category> categories = categoryService.findFirstCategory();
		request.setAttribute("categories",categories);
		//查询点击率最高的三本书
		IBookService bookService = new BookServiceImpl();
		List<Book> books = bookService.findBookByClick();
		request.setAttribute("books", books);
		//查询所有书
		List<Book> allBooks = bookService.findAllBooks();
		request.setAttribute("allBooks", allBooks);
		String url = "/WEB-INF/jsp/index.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
