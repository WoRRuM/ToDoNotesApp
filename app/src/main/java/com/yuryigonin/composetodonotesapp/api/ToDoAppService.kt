package com.yuryigonin.composetodonotesapp.api

import com.yuryigonin.composetodonotesapp.data.models.ToDoTask
import retrofit2.Call
import retrofit2.http.*

interface ToDoApiService {
    @GET("tasks")
    fun getAllTasks(): Call<List<ToDoTask>>

    @GET("tasks/{id}")
    fun getSelectedTask(@Path("id") taskId: Int): Call<ToDoTask>

    @POST("tasks")
    fun addTask(@Body toDoTask: ToDoTask): Call<Void>

    @PUT("tasks/{id}")
    fun updateTask(@Path("id") taskId: Int, @Body toDoTask: ToDoTask): Call<Void>

    @DELETE("tasks/{id}")
    fun deleteTask(@Path("id") taskId: Int): Call<Void>

    @DELETE("tasks")
    fun deleteAllTasks(): Call<Void>

    @GET("tasks/search")
    fun searchDatabase(@Query("query") searchQuery: String): Call<List<ToDoTask>>

    @GET("tasks/sort/highPriority")
    fun sortByHighPriority(): Call<List<ToDoTask>>

    @GET("tasks/sort/lowPriority")
    fun sortByLowPriority(): Call<List<ToDoTask>>
}
