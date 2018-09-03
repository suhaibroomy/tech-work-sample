package com.suroid.weatherapp.models

import android.arch.persistence.room.Entity
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

val CITY_ARRAY_LIST_TYPE = object : TypeToken<ArrayList<City>>() {}.type!!

@Entity(primaryKeys = ["id"])
data class City(
        @field:SerializedName("name")
        val name: String,
        @field:SerializedName("country")
        val country: String,
        @field:SerializedName("id")
        val id: Int
)