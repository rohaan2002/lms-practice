package com.rohan.lms.dao

import com.rohan.lms.model.Book
import com.rohan.lms.model.Borrower
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BorrowReturnDao {
    fun borrowBook(record: Borrower)
    fun returnBook(memberId: Long, bookId: Long )
}