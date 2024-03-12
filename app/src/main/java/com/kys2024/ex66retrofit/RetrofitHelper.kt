package com.kys2024.ex66retrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {

    //동반 객체 - 자바의 static 을 대신하는 영역
    companion object{
        fun getRetrofitInstance():Retrofit{
            val builder:Retrofit.Builder = Retrofit.Builder()
            builder.baseUrl("http://kys2024.dothome.co.kr")
            builder.addConverterFactory(GsonConverterFactory.create())
            val retrofit: Retrofit=builder.build()

            return retrofit


        }

    }


}