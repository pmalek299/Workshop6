package pl.coderslab.workshop6.service;

import pl.coderslab.workshop6.dto.BookDTO;
import pl.coderslab.workshop6.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookDTO> getBooks();

    BookDTO get(Long id);

    BookDTO add(BookDTO bookDTO);

    void delete(Long id);

    BookDTO update(Long id, BookDTO bookDTO);
}
