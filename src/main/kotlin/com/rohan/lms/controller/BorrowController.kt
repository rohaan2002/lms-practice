package com.rohan.lms.controller

import com.rohan.lms.model.Book
import com.rohan.lms.service.BookService
import com.rohan.lms.service.BorrowReturnService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/borrow")
class BorrowController(val borrowReturnService: BorrowReturnService) {

    @PostMapping("/{memberId}")
    fun borrowBook(@PathVariable memberId: Long, bookId: Long) :String {
         borrowReturnService.borrowBook(memberId, bookId)
        return  "The member borrowing is $memberId and the book is $bookId"
    }

}

