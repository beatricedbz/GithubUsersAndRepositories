package com.example.githubusersandrepositories.domain.usecase

import com.example.githubusersandrepositories.data.repository.UserRepo

class GetUsersUseCase(
    private val userRepo: UserRepo
) {
    suspend fun execute() = userRepo.getUsers()
}