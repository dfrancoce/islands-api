package com.islands.api.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class Map (
        @JsonProperty("data") val data: MapData,
        @JsonProperty("attributes") val attributes: MapAttributes
) {
    class Deserializer : ResponseDeserializable<Map> {
        override fun deserialize(content: String) = Gson().fromJson(content, Map::class.java)
    }
}