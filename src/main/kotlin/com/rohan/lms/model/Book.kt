package com.rohan.lms.model;

data class Book(val id: Long, val title:String, val description: String, val author: String, val shelfLocation: Int, val genreId: Int, val borrowed: Boolean )

//title, description, author, shelf_location, genre_id, borrowed