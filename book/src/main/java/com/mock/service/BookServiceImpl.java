package com.mock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.Dao.BookDao;
import com.mock.entity.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	

	@Override
	public Book createAdmin(Book book) {
		return bookDao.save(book);
	}


	@Override
	public List<Book> findByCtagory() {
		// TODO Auto-generated method stub
		return null;
	}


}
