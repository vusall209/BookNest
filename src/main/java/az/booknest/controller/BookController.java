package az.booknest.controller;

import az.booknest.entity.Book;
import az.booknest.service.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookNest/books")
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookServiceImpl;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookServiceImpl.addBook();
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deletBook(@PathVariable int id) {
        bookServiceImpl.deleteBook(id);
    }

    @GetMapping("/bookListing")
    public List<Book> bookListing() {
       return bookServiceImpl.bookListing();
    }

}
