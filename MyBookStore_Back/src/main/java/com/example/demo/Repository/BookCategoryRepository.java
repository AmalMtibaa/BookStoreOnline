package com.example.demo.Repository;

import com.example.demo.Models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestController
@CrossOrigin(origins = "http://localhost:4200")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {


}

