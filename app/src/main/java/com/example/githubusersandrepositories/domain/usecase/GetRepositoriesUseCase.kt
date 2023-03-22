package com.example.githubusersandrepositories.domain.usecase

import com.example.githubusersandrepositories.data.repository.RepositoryRepo

class GetRepositoriesUseCase(
    private val repositoryRepo: RepositoryRepo
) {
    suspend fun execute() = repositoryRepo.getRepositories()
}