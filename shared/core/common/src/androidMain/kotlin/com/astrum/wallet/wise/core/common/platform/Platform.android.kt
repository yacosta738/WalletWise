package com.astrum.wallet.wise.core.common.platform

import android.os.Build
import com.astrum.wallet.wise.core.common.platform.entities.PlatformData
import com.astrum.wallet.wise.core.common.platform.enums.PlatformType

class AndroidPlatform : Platform {
    override val platformData: PlatformData
        get() = PlatformData(
            platformType = PlatformType.ANDROID,
            osVersion = Build.VERSION.SDK_INT.toString()
        )
}

actual fun getPlatform(): Platform = AndroidPlatform()