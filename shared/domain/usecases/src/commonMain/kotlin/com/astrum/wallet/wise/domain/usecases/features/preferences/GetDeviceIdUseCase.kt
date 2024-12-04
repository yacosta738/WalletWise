package com.astrum.wallet.wise.domain.usecases.features.preferences

import com.astrum.wallet.wise.domain.repository.features.preferences.PreferencesRepository
import kotlinx.coroutines.flow.Flow

class GetDeviceIdUseCase(private val repository: PreferencesRepository) {
    operator fun invoke(): Flow<Long> = this.repository.getDeviceId()
}