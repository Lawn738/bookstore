package hh.swd22.bookstore.webcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Entity;

import hh.swd22.bookstore.domain.Book;

@Controller
public class BookController {
	
	public List<Book> books;
	
	public BookController() {
		
		this.books = new ArrayList<Book>();
		this.books.add(new Book("harry potter, viisastenkivi", "J.K Rowling", "2000", "0000000001", 25));
		this.books.add(new Book("harry potter, salaisuuksien kammio", "J.K Rowling", "2000", "0000000002", 25));
	}
	
	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("list", books);
		return "index";
	}
}