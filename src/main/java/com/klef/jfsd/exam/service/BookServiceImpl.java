package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	public BookRepository bookRepository;
	
	@Override
	public String updateBook(Book b) {
		
		Optional<Book> obj = bookRepository.findById(b.getId());
		
		if (obj.isPresent()) {
			
			Book newupdatedbook = obj.get();
			
			newupdatedbook.setTitle(b.getTitle());
			newupdatedbook.setAuthor(b.getAuthor());
			newupdatedbook.setGenere(b.getGenere());
			newupdatedbook.setPrice(b.getPrice());
			newupdatedbook.setPublishedyear(b.getPublishedyear());
			
			bookRepository.save(newupdatedbook);
			return "Book details updated successfully";
		}
		
		return "Book Id not found";
	}

}
