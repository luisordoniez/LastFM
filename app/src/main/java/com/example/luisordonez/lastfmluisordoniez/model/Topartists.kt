package com.example.luisordonez.lastfmluisordoniez.model

import com.google.gson.annotations.SerializedName

data class Topartists(

	@field:SerializedName("@attr")
	val attr: Attr? = null,

	@field:SerializedName("artist")
	val artist: List<ArtistItem?>? = null
)