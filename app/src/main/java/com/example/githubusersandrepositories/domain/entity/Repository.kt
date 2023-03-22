package com.example.githubusersandrepositories.domain.entity

import com.google.gson.annotations.SerializedName

data class Repository(
    val name: String,
    @SerializedName("forks_count")
    val forksCount: Int,
    val description: String?
)
