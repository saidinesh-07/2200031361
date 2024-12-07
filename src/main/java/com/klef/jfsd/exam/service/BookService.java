package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;

@Service
public interface BookService {

	public String updateBook(Book b);
}
