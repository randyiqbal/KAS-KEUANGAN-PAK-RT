package id.co.kas_rt.network

import id.co.kas_rt.model.ResponseUser

import retrofit2.Call

import retrofit2.http.GET

interface ApiService {
    @GET(".")
    fun getUsers(): Call<ResponseUser>
    @GET(".")
    fun getPemanfaatan(): Call<ResponseUser>

}
