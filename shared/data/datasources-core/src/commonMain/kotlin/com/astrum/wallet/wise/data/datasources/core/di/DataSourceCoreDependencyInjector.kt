package com.astrum.wallet.wise.data.datasources.core.di

import com.astrum.wallet.wise.core.common.di.KoinModuleLoader
import com.astrum.wallet.wise.data.datasources.core.db.Database
import com.astrum.wallet.wise.data.datasources.core.features.preferences.AppPreferencesImpl
import com.astrum.wallet.wise.data.datasources.core.remote.ApiService
import com.astrum.wallet.wise.data.datasources.features.preferences.AppPreferences
import de.jensklingenberg.ktorfit.Ktorfit
import com.astrum.wallet.wise.data.datasources.core.remote.createApiService
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

expect fun getPlatformInjects(): List<Module>

object DataSourceCoreDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = getPlatformInjects().union(
            listOf(
                module {
                    single<ApiService> {
                        Ktorfit
                            .Builder()
                            .baseUrl(ApiService.API_URL)
                            .build()
                            .createApiService()
                    }
                    singleOf(::Database)
                    single<AppPreferences> { AppPreferencesImpl(get()) }
                }
            )
        ).toList()
}
