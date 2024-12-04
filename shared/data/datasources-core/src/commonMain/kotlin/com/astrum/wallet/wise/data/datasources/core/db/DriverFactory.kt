package com.astrum.wallet.wise.data.datasources.core.db

import app.cash.sqldelight.db.SqlDriver

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): KmmDatabase {
    val driver = driverFactory.createDriver()
    val database = KmmDatabase(driver)

    // Do more work with the database (see below).
    return database
}
