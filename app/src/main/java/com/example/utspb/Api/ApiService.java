package com.example.utspb.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    String TOKEN = "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";
    @GET("search/users")
    @Headers("Authorization: Bearer " + TOKEN )
    Call<Response> callUser(@Query("q") String username);
    @GET("users/{username}")
    Call<Items> callDetailUser(@Path("username") String username);

}
