package com.example.utspb.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    String TOKEN = "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";
    @GET("search/users")
    @Headers("Authorization: Bearer " + TOKEN)
    Call<Response> callUser(@Query("q") String username);
    @GET("users/{username}")
    Call<Items> callDetailUser(@Path("username") String username);

}
