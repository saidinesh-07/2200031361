package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;

@Controller
@ResponseBody
public class BookController {

	@Autowired
	public BookService bookService;
	
	@PutMapping("update")
	public String update(@RequestBody Book b) {
		
		return bookService.updateBook(b);
		
	}
}
