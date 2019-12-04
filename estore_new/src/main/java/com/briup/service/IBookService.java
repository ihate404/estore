package com.briup.service;

import java.util.List;

import com.briup.bean.Book;

public interface IBookService {
	List<Book> findBookByClick();
	List<Book> findAllBooks();
	Book findBookById(long id);
}
