package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Book;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.BookMapper;
import com.briup.service.IBookService;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> findBookByClick() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.selectBookByClick();
		return books;
	}

	@Override
	public List<Book> findAllBooks() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);		
		List<Book> allBooks = mapper.selectAllBooks();
		return allBooks;
	}

	@Override
	public Book findBookById(long id) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = mapper.selectBookById(id);
		book.setClick(book.getClick()+1);
		mapper.updateBook(book);
		session.commit();
		return book;
	}
	
}
