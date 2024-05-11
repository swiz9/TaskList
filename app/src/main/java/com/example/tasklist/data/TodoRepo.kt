package com.example.tasklist.data


import com.example.tasklist.model.Todo
import kotlinx.coroutines.flow.Flow

class TodoRepo(private val todoDao: TodoDao) {

    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }

    suspend fun update(todo: Todo) {
        todoDao.update(todo)
    }

    suspend fun delete(todo: Todo) {
        todoDao.delete(todo)
    }

    fun getAllTodos(): Flow<List<Todo>> {
        return todoDao.getAllTodos()
    }

}