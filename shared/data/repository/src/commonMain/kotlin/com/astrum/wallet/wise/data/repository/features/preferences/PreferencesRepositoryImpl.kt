package com.astrum.wallet.wise.data.repository.features.preferences

import com.astrum.wallet.wise.data.datasources.features.preferences.AppPreferences
import com.astrum.wallet.wise.domain.repository.features.preferences.PreferencesRepository
import kotlinx.coroutines.flow.Flow

class PreferencesRepositoryImpl(private val preferences: AppPreferences) : PreferencesRepository {
    override fun getDeviceId(): Flow<Long> = this.preferences.getDeviceId()

    override suspend fun setDeviceId(deviceId: Long) = this.preferences.setDeviceId(deviceId)

}