package book.org.dxctraining.service;

import java.util.List;

import book.org.dxctraining.entities.Book;

public interface IBookService {
	Book findById(String id);
	List<Book> findAll() ;
	void add(Book book);
	Book updateCost(String id,double newCost);
	void remove(String id);
}

