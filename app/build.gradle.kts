plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id ("kotlin-kapt") // Required for annotation processing
}

android {
    namespace = "com.example.expensetraclerapp"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.expensetraclerapp"
        minSdk = 24
        targetSdk = 36
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    //Navigation Dependency
    implementation("androidx.navigation:navigation-compose:2.7.0")

    //RoomDB Dependencies
    implementation("androidx.room:room-runtime:2.8.4")
    kapt("androidx.room:room-compiler:2.8.4")
    implementation("androidx.room:room-ktx:2.8.4")

    // Optional extras
    testImplementation("androidx.room:room-testing:2.8.4")
    implementation("androidx.room:room-rxjava3:2.8.4")

    //ViewModel dependencies
    val lifecycle_version = "2.8.4"

    // Core ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version")

    // Kotlin extensions + coroutines support
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // Lifecycle runtime (needed for coroutines + LiveData)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    // Optional: LiveData support
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Optional: SavedStateHandle support
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    // Optional: Testing
    testImplementation("androidx.arch.core:core-testing:$lifecycle_version")

}