package com.example.amphibians.data

import com.example.amphibians.model.AmphibianModel
import com.example.amphibians.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<AmphibianModel>
}

class NetworkAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
): AmphibiansRepository {
    override suspend fun getAmphibians(): List<AmphibianModel> = amphibiansApiService.getAmphibians()
}