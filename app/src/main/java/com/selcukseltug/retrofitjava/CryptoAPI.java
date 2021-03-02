package com.selcukseltug.retrofitjava;

import com.selcukseltug.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    @GET("prices?key=ed9af08654299cefc4b9d907ab5eaf76\n")
    Call<List<CryptoModel>>getData();

}
