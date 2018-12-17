package com.example.joe.weekend6contentprovider.models

import com.google.gson.annotations.SerializedName

data class Example(@SerializedName("itemId") val item_Id:Int,
                   @SerializedName("parentItemId") val parentItemId:Int,
                   @SerializedName("name") val name:String,
                   @SerializedName("salePrice") val salePrice:Double,
                   @SerializedName("categoryPath") val categoryPath:String,
                   @SerializedName("shortDescription") val shortDesc:String,
                   @SerializedName("longDescription") val longDesc:String,
                   @SerializedName("brandName") val brandName:String,
                   @SerializedName("thumbnailImage") val thumbnailImage: String,
                   @SerializedName("mediumImage") val mediumImage:String,
                   @SerializedName("largeImage") val largeImage:String,
                   @SerializedName("productTrackingUrl")val productTrackingUrl:String,
                   @SerializedName("standardShipRate")val standardShipRate:Double,
                   @SerializedName("size") val size:String,
                   @SerializedName("color") val color: String)