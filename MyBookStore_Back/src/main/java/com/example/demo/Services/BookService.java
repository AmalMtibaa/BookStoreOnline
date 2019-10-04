package com.example.demo.Services;

import com.example.demo.Models.Book;
import com.example.demo.Models.BookCategory;
import com.example.demo.Repository.BookCategoryRepository;
import com.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public List<BookCategory> getAllCategory() {
        return bookCategoryRepository.findAll();
    }

    public List<Book> getBooksById(Long bookCategory_id) {
        if(bookCategoryRepository.findById(bookCategory_id).isPresent()){
            BookCategory c=bookCategoryRepository.findById(bookCategory_id).get();
            return bookRepository.findByBookCategory(c);
        }
        return null;
    }

    public Book getBookByID(Long idBook) {
        if(bookRepository.findById(idBook).isPresent()){
            return bookRepository.findById(idBook).get();
        }
        return null;
    }

}
