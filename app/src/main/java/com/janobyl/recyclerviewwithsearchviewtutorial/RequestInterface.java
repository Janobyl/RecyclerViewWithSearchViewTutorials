package com.janobyl.recyclerviewwithsearchviewtutorial;

/**
 * Created by Abdul Jamil on 6/14/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}