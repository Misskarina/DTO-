package com.karina.dtopractice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	BookRepository brepo;
	
	@RequestMapping("/testing")
	public String test()
		{
		return "publications of books";
		}
	
	@RequestMapping("/book")
	public String save()
	{
		Book b=new Book();
		b.setBookname("12th ISC");
		b.setPrice(1250);
		b.setNo_page(3000);
		Author a=new Author();
		a.setAuthor_name("Dinesh kumar");
		a.setPublication_year(1990);
		
		a.setBook(b);//
		b.setAuthor(a);//
		brepo.save(b);
		
		return "The famous book of INDIA";			
		
	}

	@RequestMapping("/saveall")
	public String saveall()
	{
		Book b1=new Book();
		b1.setBookname("Ramayan");
		b1.setPrice(4000);
		b1.setNo_page(650);
		Author a1=new Author();
		a1.setAuthor_name("Valmiki");
		a1.setPublication_year(490);
		
		a1.setBook(b1);
		b1.setAuthor(a1);
		
		Book b2=new Book();
		b2.setBookname("Bhagwat geeta");
		b2.setPrice(3000);
		b2.setNo_page(750);
		Author a2=new Author();
		a2.setAuthor_name("Vedvyas");
		a2.setPublication_year(600);
		
		a2.setBook(b2);
		b2.setAuthor(a2);
		List<Book>list=Arrays.asList(b1,b2);
		brepo.saveAll(list);
		
		return "The famous book of INDIA";
		
	}
	
	@RequestMapping("/{id}") 
	public Book byid(@PathVariable int id)
	
	{	
		return brepo.findById(id);
     }
	
@RequestMapping("/all")
public List<Book> alldata()
{
	return brepo.findAll();
}


}
