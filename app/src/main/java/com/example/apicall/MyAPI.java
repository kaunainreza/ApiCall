package com.example.apicall;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("posts")
    Call<List<Model>> getmodels();
}
