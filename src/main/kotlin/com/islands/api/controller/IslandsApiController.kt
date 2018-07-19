package com.islands.api.controller

import com.islands.api.service.MapService
import com.islands.api.model.Map
import io.swagger.annotations.ApiOperation
import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

/**
 * This class provides the endpoint to get test data of a map of islands
 */
@RestController
@RequestMapping("/api/map")
class IslandsApiController (private val mapService : MapService) {
    companion object : KLogging()

    @ApiOperation(value = "Returns a map of islands ")
    @GetMapping("/islands")
    @ResponseStatus(HttpStatus.OK)
    fun getMapOfIslands(): Map {
        logger.debug { "IslandsApiController - getMapOfIslands - start" }
        return mapService.createMap()
    }
}