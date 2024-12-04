package com.astrum.wallet.wise.domain.usecases.features.preferences

import com.astrum.wallet.wise.domain.repository.features.preferences.PreferencesRepository

class SetDeviceIdUseCase(private val repository: PreferencesRepository) {
    suspend operator fun invoke(deviceId: Long) = this.repository.setDeviceId(deviceId)
}
