package com.example.mobileproject.model.models
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
@Entity(tableName = "Users")
    data class Users(
        @PrimaryKey(autoGenerate = true)
        @NotNull
        @ColumnInfo(name = "id")
        val id: Int = 0,

        @ColumnInfo(name = "username")
        val username: String,

        @ColumnInfo(name = "email")
        val email: String,

        @ColumnInfo(name = "password")
        val password: String
    )
