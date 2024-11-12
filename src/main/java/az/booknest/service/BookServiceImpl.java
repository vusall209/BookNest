package az.booknest.service;

import az.booknest.entity.Book;
import az.booknest.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl {
    private final BookRepository bookRepository;

    public Book addBook() {
        return bookRepository.save(new Book());
    }

    public void deleteBook(int id) {
        if(bookRepository.existsById(id)){
            bookRepository.deleteById(id);
        }
        else {
            new RuntimeException("There is no such book");
        }
    }

    public List<Book> bookListing() {
        return bookRepository.findAll();
    }
}
