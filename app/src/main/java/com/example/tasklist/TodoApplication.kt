package com.example.tasklist


import android.app.Application
import com.example.tasklist.data.TodoDatabase
import com.example.tasklist.data.TodoRepo

class TodoApplication: Application() {

    val database by lazy { TodoDatabase.getDatabase(this) }
    val repository by lazy { TodoRepo(database.todoDao()) }
}