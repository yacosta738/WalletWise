package com.astrum.wallet.wise.domain.usecases.di

import com.astrum.wallet.wise.core.common.di.KoinModuleLoader
import com.astrum.wallet.wise.domain.usecases.features.preferences.GetDeviceIdUseCase
import com.astrum.wallet.wise.domain.usecases.features.preferences.SetDeviceIdUseCase
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

object DomainUseCasesDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            module {
                factoryOf(::GetDeviceIdUseCase)
                factoryOf(::SetDeviceIdUseCase)
            }
        )
}
