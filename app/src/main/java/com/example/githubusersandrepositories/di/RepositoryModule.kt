package com.example.githubusersandrepositories.di

import com.example.githubusersandrepositories.data.repository.RepositoryRepo
import com.example.githubusersandrepositories.data.repository.UserRepo
import org.koin.dsl.module

val repositoryModule = module {
    factory { UserRepo(get()) }
    factory { RepositoryRepo(get()) }
}