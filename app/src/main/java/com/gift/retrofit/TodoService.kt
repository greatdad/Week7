package com.gift.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface TodoService {
    @GET("Todos")

    suspend fun getAllTodos(): List<Todo>

}

