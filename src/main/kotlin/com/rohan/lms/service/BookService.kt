package com.rohan.lms.service;

import com.rohan.lms.dao.BookDao
import com.rohan.lms.model.Book

import org.springframework.stereotype.Service

@Service
class BookService( val bookDao: BookDao) {

    fun addBook(book: Book):Book{
        bookDao.addBook(book)
        return book
    }

    fun getBookById(id: Long): Book{
       return bookDao.getBookById(id)
    }

    fun updateStatus(id: Long, status: Boolean){
        bookDao.updateStatus(id, status)
    }

}