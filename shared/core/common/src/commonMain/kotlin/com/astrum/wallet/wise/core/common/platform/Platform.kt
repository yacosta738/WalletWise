package com.astrum.wallet.wise.core.common.platform

import com.astrum.wallet.wise.core.common.platform.entities.PlatformData

interface Platform {
    val platformData: PlatformData
}

expect fun getPlatform(): Platform