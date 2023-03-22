package com.example.githubusersandrepositories.data.repository

import com.example.githubusersandrepositories.domain.repository.UserApi

class UserRepo(private val userApi: UserApi) {

    suspend fun getUsers() = userApi.getUsers()
}