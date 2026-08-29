package pl.coderslab.workshop6.mapper;

import org.springframework.stereotype.Component;
import pl.coderslab.workshop6.dto.BookDTO;
import pl.coderslab.workshop6.entity.Book;

@Component
public class BookMapper {
    public BookDTO toDTO(Book book){
        return new BookDTO(
                book.getId(),
                book.getIsbn(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getType()
        );
    }
    public Book toEntity(BookDTO bookDTO){
        Book book = new Book();

        book.setId(bookDTO.getId());
        book.setIsbn(bookDTO.getIsbn());
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setPublisher(bookDTO.getPublisher());
        book.setType(bookDTO.getType());

        return book;
    }
}
