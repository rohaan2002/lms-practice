package com.rohan.lms.model

import java.time.LocalDate

data class Borrower (
    val id: Long?, val memberId: Long, val borrowDate: LocalDate, val returnDate: LocalDate, val bookId : Long, val overDue: Boolean
)