package com.islands.api.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class MapData (
        @JsonProperty("id") val id: String,
        @JsonProperty("type") val type: String
)