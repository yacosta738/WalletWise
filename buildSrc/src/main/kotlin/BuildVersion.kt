import org.gradle.api.JavaVersion

object BuildVersion {
    object environment {
        const val applicationId = "com.astrum.wallet.wise"
        const val appName = "Wallet Wise"
        const val appVersion = 100
        const val appVersionCode = "1.0.0"
        val javaVersion = JavaVersion.VERSION_21
        const val jvmTarget = "21"
        const val appDatabaseName = "KmmDatabase"
    }

    object android {
        const val minSdk = 24
        const val compileSdk = 35
    }
}