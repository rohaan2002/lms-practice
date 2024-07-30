package com.rohan.lms.dao

import com.rohan.lms.model.Book
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BookDao {
    fun addBook(book: Book)
    fun getBookById(id: Long): Book
    fun updateStatus(id: Long, status: Boolean)
}