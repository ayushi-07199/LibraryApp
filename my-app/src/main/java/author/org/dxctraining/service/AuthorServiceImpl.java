package author.org.dxctraining.service;
import author.org.dxctraining.exception.*;
import java.util.HashMap;
import java.util.Map;

import author.org.dxctraining.dao.AuthorDaoImpl;
import author.org.dxctraining.dao.IAuthorDao;
import author.org.dxctraining.entities.Author;

import book.org.dxctraining.dao.IBookDao;
import book.org.dxctraining.dao.BookDaoImpl;
import book.org.dxctraining.entities.Book;
import book.org.dxctraining.exception.InvalidArgumentException;


public class AuthorServiceImpl implements IAuthorService {
	private IAuthorDao dao = new AuthorDaoImpl();
	
	@Override
	public Author findById(String id) {
		checkId(id);
		Author author = dao.findById(id);
		return author;
	}
	@Override
	public void add(Author author) {
		checkAuthor(author);
		dao.add(author);
		
	}
	public void checkAuthor(Author author) {
		if(author==null) {
			throw new InvalidArgumentException("Author cant be null or empty");
				
		}
	}


	private void checkId(String id) {
		int idno=Integer.parseInt(id);
		if (idno < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed="+id);
		}
		
	}

}
