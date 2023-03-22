package com.example.githubusersandrepositories.domain.repository

import com.example.githubusersandrepositories.domain.entity.User
import retrofit2.http.GET

interface UserApi {

    @GET("search/users")
    suspend fun getUsers(): List<User>
}