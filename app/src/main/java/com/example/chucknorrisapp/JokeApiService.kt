package com.example.chucknorrisapp


import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET
import io.reactivex.Single
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.create


interface JokeApiService {

    @GET("url_path_extension")
    fun giveMeAJoke(): Single<Joke>

    object JokeApiServiceFactory{
        fun myFactory(): JokeApiService{
            val builder = Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/jokes/random")
                .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json")))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            return builder.create(JokeApiService::class.java)
        }
    }


}