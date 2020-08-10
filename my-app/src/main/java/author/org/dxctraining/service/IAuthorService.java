package author.org.dxctraining.service;

import author.org.dxctraining.entities.Author;
import book.org.dxctraining.entities.Book;

public interface IAuthorService {
	Author findById(String id);
	void add(Author author);
}

