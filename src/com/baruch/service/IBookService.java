package com.baruch.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.baruch.model.Book;

@Path(value="/book")
public interface IBookService {
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	String getBooksByName(@PathParam("name") String name);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	String getBooks();
	
	String getBookByISBN(String isbn);
	
	void addBook(Book book);
	
	void adddBooks(List<Book> books);
	
	void modifyBook(Book book);
	
	void deleteBook(String isbn);
}
