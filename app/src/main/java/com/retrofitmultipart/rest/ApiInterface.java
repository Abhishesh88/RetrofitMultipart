package com.retrofitmultipart.rest;

import com.retrofitmultipart.model.DemoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Abhishesh on 04-11-2016.
 */

public interface ApiInterface {
    @GET("movie/550")
    Call<DemoResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<DemoResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}