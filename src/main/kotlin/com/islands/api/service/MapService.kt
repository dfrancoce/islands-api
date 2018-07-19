package com.islands.api.service

import com.islands.api.model.Map
import com.islands.api.model.MapAttributes
import com.islands.api.model.MapAttributesTiles
import com.islands.api.model.MapData
import org.springframework.stereotype.Service

/**
 * This class is responsible of creating the test data to return in the IslandsApiController endpoint
 */
@Service
class MapService {
    fun createMap(): Map = Map(createMapData(), createMapAttributes())

    private fun createMapAttributes(): MapAttributes = MapAttributes(createMapTiles())

    private fun createMapTiles(): List<MapAttributesTiles> = MapTilesGenerator.generateTiles()

    private fun createMapData(): MapData = MapData("MAP", "map")
}