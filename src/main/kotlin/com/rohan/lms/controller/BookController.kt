package com.rohan.lms.controller

import com.rohan.lms.model.Book
import com.rohan.lms.service.BookService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/books")
class BookController(val bookService: BookService) {

    @PostMapping()
    fun addBook(@RequestBody book: Book): Book {
        return bookService.addBook(book);
    }

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Long): Book {
        return bookService.getBookById(id)
    }

    @PutMapping("/updateStatus/{id}")
    fun updateStatus(@PathVariable id: Long, status:Boolean){
        bookService.updateStatus(id,status)
    }


}

