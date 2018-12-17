package com.example.joe.weekend6contentprovider.models

import com.google.gson.annotations.SerializedName

data class Attributes(@SerializedName("color") val color:String,
                      @SerializedName("productUrlText") val productUrlText:String,
                      @SerializedName("size") val size:String)