package com.action;

import java.util.List;

import com.entity.Book;
import com.factory.ServiceFactory;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IService;

public class BookAction extends ActionSupport {
	private IService<Book> bookService = ServiceFactory.getBookService();
	private List<Book> books;
	private Integer id;
	private Book book;
	public String list() throws Exception{
		books = bookService.get(" select new Book(b.id,b.name,b.cover) from Book b ");
		return "list";
	}
	public String detail() throws Exception{
		book = bookService.get(id);
		return "detail";
	}
	public String add() throws Exception{
		bookService.add(book);
		return Action.SUCCESS;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
