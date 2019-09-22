package hh.swd22.bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hh.swd22.bookstore.*;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	 List<Book> findByAuthor(String Author);
	
}