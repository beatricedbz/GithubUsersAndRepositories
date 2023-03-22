package com.example.githubusersandrepositories.di

import com.example.githubusersandrepositories.domain.usecase.GetRepositoriesUseCase
import com.example.githubusersandrepositories.domain.usecase.GetUsersUseCase
import org.koin.dsl.module

val useCaseModule = module {

    factory {
        GetRepositoriesUseCase(
            repositoryRepo = get()
        )
    }
    factory {
        GetUsersUseCase(
            userRepo = get()
        )
    }
}