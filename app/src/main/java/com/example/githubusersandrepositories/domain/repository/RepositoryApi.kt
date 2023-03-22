package com.example.githubusersandrepositories.domain.repository

import com.example.githubusersandrepositories.domain.entity.Repository
import retrofit2.http.GET

interface RepositoryApi {

    @GET("search/repositories")
    suspend fun getRepositories(): List<Repository>
}