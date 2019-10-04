package com.example.demo.Controllers;

import com.example.demo.Models.Book;
import com.example.demo.Models.BookCategory;
import com.example.demo.Models.Customer;
import com.example.demo.Models.Orderr;
import com.example.demo.Services.AuthentificationService;
import com.example.demo.Services.BookService;
import com.example.demo.Services.OrderingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="My Book Store", description="API for Used For showing Book and creating an order")
public class HomeController {


    @Autowired
    private BookService bookService;

    @Autowired
    private AuthentificationService authentificationService;

    @Autowired
    private OrderingService orderingService;

    //--------------------------------API Methods--------------------------------------------------------

    @ApiOperation(value = "View a list of available Categories", response = List.class)
    @GetMapping("/getCateory")
    public List<BookCategory> showAllCategory() {
        return bookService.getAllCategory();
    }

    @ApiOperation(value = "View the list of books for a specific Category", response = List.class)
    @GetMapping (path = "/getBooksOfSelectedCategory/{idCategory}")
    public List<Book> showBooksOfSelectedCategory( @PathVariable("idCategory") Long bookCategory_id) {
        return bookService.getBooksById(bookCategory_id);
    }

    @ApiOperation(value = "Get the book by ID", response = Book.class)
    @GetMapping (path = "/getBook/{idBook}")
    public Book getBookByID(  @ApiParam(value = "id Book", required = true) @PathVariable("idBook") Long idBook) {
        return bookService.getBookByID(idBook);
    }

     @PostMapping(path="/registerCustomer")
     public void registerCustomer(@ApiParam(value = "customer to register", required = true) @Valid @RequestBody Customer customer){
        this.authentificationService.registerCustomer(customer);
     }

    @PostMapping(path="/login")
    public boolean login(@ApiParam(value = "customer to login", required = true) @Valid @RequestBody Customer customer){
        return this.authentificationService.login(customer);
    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }

    @PostMapping("/createOrder")
    public void createOrder(@ApiParam(value = "Order to save in DB", required = true) @Valid @RequestBody Orderr order){
        System.out.println("########################################"+order.toString());
        this.orderingService.createOrder(order);
    }
}

