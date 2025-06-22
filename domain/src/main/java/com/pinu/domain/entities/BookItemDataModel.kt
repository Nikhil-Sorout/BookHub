package com.pinu.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book-item")
data class BookItemDataModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val imageUrl: String,
    val price: Double,
    val availableQuantity: Int,
    val genre: String,
    val description: String,
    val authorName: String,
    val publishedYear: Int,
    val sellerName: String,
    val numberOfPages: Int,
    val isWishListed : Boolean,
)
