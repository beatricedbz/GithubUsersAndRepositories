package com.example.githubusersandrepositories.data.repository

import com.example.githubusersandrepositories.domain.repository.RepositoryApi

class RepositoryRepo(private val repositoryApi: RepositoryApi)  {

    suspend fun getRepositories() = repositoryApi.getRepositories()
}