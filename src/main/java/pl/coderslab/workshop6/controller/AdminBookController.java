package pl.coderslab.workshop6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.workshop6.service.BookService;

@Controller
public class AdminBookController {

    private final BookService bookService;

    public AdminBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/admin/books")
    public String books(Model model){
        model.addAttribute("books", bookService.getBooks());

        return "books/list";
    }
}
