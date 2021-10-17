package com.example.mvvmnewsapiclient.domain.usecases

import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.util.Resource
import com.example.mvvmnewsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute() : Resource<ApiResponse> {
        return newsRepository.getNewsHeadLines()
    }
}