package com.astrum.wallet.wise.core.common.platform.entities

import com.astrum.wallet.wise.core.common.platform.enums.PlatformType

data class PlatformData(
    val platformType: PlatformType,
    val osVersion: String
) {
    override fun toString(): String = "${platformType.name} v. $osVersion"
}