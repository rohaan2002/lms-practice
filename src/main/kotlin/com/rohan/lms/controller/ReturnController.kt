package com.rohan.lms.controller

import com.rohan.lms.model.Book
import com.rohan.lms.service.BookService
import com.rohan.lms.service.BorrowReturnService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/return")
class ReturnController(val borrowReturnService: BorrowReturnService) {

    @PostMapping("/{memberId}")
    fun returnBook(@PathVariable memberId: Long, bookId: Long): String {
        borrowReturnService.returnBook(memberId, bookId)
        return  "The member returning is $memberId and the book is $bookId"
    }

}

