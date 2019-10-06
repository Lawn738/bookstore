package hh.swd22.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String author;
	private String year;
	private String isbn;
	private int price;
	
	public Book() {
		
		this.id = null;
		this.title = null;
		this.author = null;
		this.year = null;
		this.isbn = null;
		this.price = 0;
	}
	
	public Book(String title, String author, String year, String isbn, int price, Long id) {
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getYear() {
		return year;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}
	
	
	

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

