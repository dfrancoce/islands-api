package com.islands.api.model

import com.fasterxml.jackson.annotation.JsonProperty

data class MapAttributesTiles (
        @JsonProperty("x") val x: Int,
        @JsonProperty("y") val y: Int,
        @JsonProperty("type") val type: String
)