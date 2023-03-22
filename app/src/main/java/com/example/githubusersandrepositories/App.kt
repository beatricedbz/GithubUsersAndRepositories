package com.example.githubusersandrepositories

import android.app.Application
import com.example.githubusersandrepositories.di.networkModule
import com.example.githubusersandrepositories.di.repositoryModule
import com.example.githubusersandrepositories.di.useCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(listOf(networkModule, repositoryModule, useCaseModule))
        }
    }
}