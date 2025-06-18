package kr.ac.kopo.minn.bookmarket.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import kr.ac.kopo.minn.bookmarket.domain.Book;
import kr.ac.kopo.minn.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;


public class BookIdValidator  implements ConstraintValidator<BookId, String> {
    @Autowired
    private BookService bookService;

    @Override
    public void initialize(BookId constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Book book = null;
        try {
            book = bookService.getBookById(value);
        }catch (RuntimeException e){
            return true;
        }

        if(book != null){
            return false;
        }

        return true;
    }
}
