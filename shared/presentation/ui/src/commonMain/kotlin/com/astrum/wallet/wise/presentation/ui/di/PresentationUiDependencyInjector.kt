package com.astrum.wallet.wise.presentation.ui.di

import com.astrum.wallet.wise.core.common.di.KoinModuleLoader
import com.astrum.wallet.wise.core.di.CoreDiDependencyInjector
import org.koin.core.module.Module

object PresentationUiDependencyInjector : KoinModuleLoader {
    override val modules: List<Module>
        get() = listOf(
            CoreDiDependencyInjector.modules,
            listOf(

            )
        ).flatten()

}