package com.example.github_repository_query.network


import com.example.github_repository_query.model.Repo
import com.example.github_repository_query.model.UserDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {
    @Headers("Authorization : Bearer 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")
    @GET("users/{username}/repos")
    fun listRepos(@Path("username") username : String) : Call<List<Repo>>

    @Headers("Authorization : Bearer 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")
    @GET("search/users")
    fun searchUsers(@Query("q") query: String) : Call<UserDto>
}