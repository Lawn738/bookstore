package hh.swd22.bookstore.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class BookController {
	
	@RequestMapping("/index")
	public String hello(@RequestParam(name="place") String place,
			@RequestParam(name="name") String name) {
		return "welcome to the " + place + " " + name;
	}
}