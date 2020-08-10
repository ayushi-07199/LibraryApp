package author.org.dxctraining.dao;

import author.org.dxctraining.entities.Author;
import book.org.dxctraining.entities.Book;

public interface IAuthorDao {
	Author findById(String id);
	void add(Author author);
}

