plugins {
    //id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin)
}

secrets {
    propertiesFileName = "secrets.properties"
    defaultPropertiesFileName = "local.defaults.properties"
}

android {
    namespace = "com.example.santafeswaia"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.santafeswaia"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.play.services.maps)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
