package com.yuryigonin.composetodonotesapp.injection

import android.content.Context
import androidx.room.Room
import com.yuryigonin.composetodonotesapp.api.ApiClient
import com.yuryigonin.composetodonotesapp.api.ToDoApiService
import com.yuryigonin.composetodonotesapp.data.ToDoDao
import com.yuryigonin.composetodonotesapp.data.ToDoDatabase
import com.yuryigonin.composetodonotesapp.data.reposotories.ToDoRepository
import com.yuryigonin.composetodonotesapp.util.Constants.DATABASE_NAME
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: ToDoDatabase) = database.toDoDao()

    @Singleton
    @Provides
    fun provideApiService(): ToDoApiService = ApiClient.instance

}