package com.example.luisordonez.lastfmluisordoniez.model

import com.google.gson.annotations.SerializedName

data class ImageItem(

	@field:SerializedName("#text")
	val text: String? = null,

	@field:SerializedName("size")
	val size: String? = null
)