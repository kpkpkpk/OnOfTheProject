package com.kponomarev.oneofthenewproject.core.di.modules

import com.kponomarev.oneofthenewproject.feature.data.api.CoinsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module
class NetworkModule {

    @Provides
    fun provideCoinsApi(): CoinsApi {
        return Retrofit.Builder()
            .baseUrl("https://api.coingecko.com/api/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }
}