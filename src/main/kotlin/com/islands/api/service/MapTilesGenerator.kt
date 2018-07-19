package com.islands.api.service

import com.islands.api.model.MapAttributesTiles

/**
 * This class generates the tiles of the islands that compose the map
 */
object MapTilesGenerator {
    private val landTiles = listOf(Pair(1, 1), Pair(2, 1), Pair(5, 1), Pair(2, 2), Pair(5, 3), Pair(3, 4), Pair(4, 4), Pair(5, 4), Pair(4, 5))

    fun generateTiles(): List<MapAttributesTiles> {
        val tiles: MutableList<MapAttributesTiles> = mutableListOf()

        for (i in 1..6) {
            for (j in 1..5) {
                val tile = MapAttributesTiles(x = i, y = j, type = getTileType(i, j))
                tiles.add(tile)
            }
        }

        return tiles
    }

    private fun getTileType(x: Int, y: Int): String {
        val pair = Pair(x, y)
        return if (landTiles.contains(pair)) "land" else "water"
    }
}