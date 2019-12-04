package com.briup.dao;

import java.util.List;

import com.briup.bean.Book;

public interface BookMapper {
	List<Book>selectBookByClick();
	List<Book>selectAllBooks();
	Book selectBookById(long id);
	void updateBook(Book book);
}
