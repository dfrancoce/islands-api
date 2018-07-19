package com.islands.api.model

import com.fasterxml.jackson.annotation.JsonProperty

data class MapAttributes (@JsonProperty("tiles") val tiles: List<MapAttributesTiles>)