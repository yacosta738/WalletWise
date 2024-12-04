package com.astrum.wallet.wise.data.datasources.core.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            KmmDatabase.Schema,
            Database.databaseName
        )
    }
}
