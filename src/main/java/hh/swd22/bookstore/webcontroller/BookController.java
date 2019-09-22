package hh.swd22.bookstore.webcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Entity;

import hh.swd22.bookstore.domain.*;

@Controller
public class BookController {
	
	public List<Book> books;
	
	@Autowired
	BookRepository bookRepository; 
	
	public BookController() {
		
		this.books = new ArrayList<Book>();
		this.books.add(new Book("harry potter, viisastenkivi", "J.K Rowling", "2000", "0000000001", 25, null));
		this.books.add(new Book("harry potter, salaisuuksien kammio", "J.K Rowling", "2000", "0000000002", 25, null));
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getBooks(Model model) {
			List<Book> books =  (List<Book>) bookRepository.findAll();
			model.addAttribute("books", books);
			return "booklist";
	}


	@RequestMapping(value = "/newbook", method = RequestMethod.GET)
	public String getNewBookForm(Model model) {
		model.addAttribute("book", new Book(null, null, null, null, 0, null));
		return "bookform";
	}


	@RequestMapping(value = "/newbook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute Book book) {

		bookRepository.save(book);
		return "redirect:/booklist";
	}

	@RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId) {
		bookRepository.deleteById(bookId);
		return "redirect:../booklist";
	}
}