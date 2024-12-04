package com.astrum.wallet.wise.core.di

import com.astrum.wallet.wise.core.common.di.KoinModuleLoader
import com.astrum.wallet.wise.data.datasources.core.di.DataSourceCoreDependencyInjector
import com.astrum.wallet.wise.data.repository.di.DataRepositoryDependencyInjector
import com.astrum.wallet.wise.domain.usecases.di.DomainUseCasesDependencyInjector
import com.astrum.wallet.wise.presentation.viewmodels.di.PresentationViewModelsDependencyInjector
import org.koin.core.module.Module

object CoreDiDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            DataSourceCoreDependencyInjector.modules,
            DataRepositoryDependencyInjector.modules,
            DomainUseCasesDependencyInjector.modules,
            PresentationViewModelsDependencyInjector.modules,
        ).flatten()
}
