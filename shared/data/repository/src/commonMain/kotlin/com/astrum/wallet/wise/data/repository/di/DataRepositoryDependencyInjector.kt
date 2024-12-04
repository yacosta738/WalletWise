package com.astrum.wallet.wise.data.repository.di

import com.astrum.wallet.wise.core.common.di.KoinModuleLoader
import com.astrum.wallet.wise.data.repository.features.preferences.PreferencesRepositoryImpl
import com.astrum.wallet.wise.domain.repository.features.preferences.PreferencesRepository
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

object DataRepositoryDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            module {
                factoryOf(::PreferencesRepositoryImpl) bind PreferencesRepository::class
            }
        )
}
