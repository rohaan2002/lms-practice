package com.rohan.lms.service;

import com.rohan.lms.dao.BorrowReturnDao
import com.rohan.lms.model.Book
import com.rohan.lms.model.Borrower
import com.rohan.lms.model.Member

import org.springframework.stereotype.Service
import java.time.LocalDate
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@Service
class BorrowReturnService(val borrowReturnDao: BorrowReturnDao,val bookService: BookService) {

//    fun borrowBook(memberId: Long, bookId: Long):String{
fun borrowBook(memberId: Long, bookId: Long):String{
        val record = Borrower(
            id = null,
            memberId=memberId,
            borrowDate = LocalDate.now(),
            returnDate = LocalDate.now().plusWeeks(2),
            bookId = bookId,
            overDue = false
        )

        borrowReturnDao.borrowBook(record)
        bookService.updateStatus(bookId,true)

        return  "The member borrowing is $memberId and the book is $bookId"
    }

    fun returnBook(memberId: Long, bookId: Long): String{
        borrowReturnDao.returnBook(memberId,bookId)
        bookService.updateStatus(bookId,false)

        return  "The member retuning is $memberId and the book is $bookId"
    }
}