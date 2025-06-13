//
//plugins {
//    //id("org.jetbrains.kotlin.android")
//
//    id("org.jetbrains.kotlin.plugin.compose")
//    id("com.google.devtools.ksp") version "2.1.0-1.0.31"
//
//    id("com.android.application")
//    id("com.google.gms.google-services")
//    kotlin("android") version "2.1.0"
//
//}
//
////composeOptions {
////    kotlinCompilerExtensionVersion = "1.5.4"
////}
//
//
////
//////plugins {
//////    id("com.android.application")
//////    id("org.jetbrains.kotlin.android")
//////    id("com.google.devtools.ksp")
//////}
////
////
////android {
////    compileSdk = 35
////
////    defaultConfig {
////        applicationId = "com.example.medical"
////        minSdk = 24
////        targetSdk = 35
////        versionCode = 1
////        versionName = "1.0"
////
////        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
////        vectorDrawables {
////            useSupportLibrary = true
////        }
////    }
////
////    buildTypes {
////        release {
////            isMinifyEnabled = false
////            proguardFiles(
////                getDefaultProguardFile("proguard-android-optimize.txt"),
////                "proguard-rules.pro"
////            )
////        }
////    }
////    compileOptions {
////        sourceCompatibility = JavaVersion.VERSION_17
////        targetCompatibility = JavaVersion.VERSION_17
////    }
////    kotlinOptions {
////        jvmTarget = "17"
////    }
////    buildFeatures {
////        compose = true
////    }
////    packaging {
////        resources {
////            excludes += "/META-INF/{AL2.0,LGPL2.1}"
////        }
////    }
////    namespace = "com.example.medical"
////}
////
////dependencies {
////    // Import the Compose BOM
////    implementation(platform("androidx.compose:compose-bom:2025.03.00"))
////    implementation("androidx.activity:activity-compose:1.10.1")
////    implementation("androidx.compose.material3:material3")
////    implementation("androidx.compose.ui:ui")
////    implementation("androidx.compose.ui:ui-tooling")
////    implementation("androidx.compose.ui:ui-tooling-preview")
////    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
////    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
////    implementation("androidx.navigation:navigation-compose:2.8.5")
////
////    //Room
////    implementation("androidx.room:room-runtime:${rootProject.extra["room_version"]}")
////    implementation("androidx.core:core-ktx:1.15.0")
////    implementation(libs.firebase.auth.ktx)
////    implementation(libs.androidx.appcompat)
////    implementation(libs.material)
////    implementation(libs.androidx.activity)
////    implementation(libs.androidx.constraintlayout)
////    implementation(libs.androidx.runtime.livedata)
////    testImplementation(libs.junit.junit)
////    testImplementation(libs.junit.junit)
////    testImplementation(libs.junit.junit)
////    testImplementation(libs.junit.junit)
////    //ksp("androidx.room:room-compiler:${rootProject.extra["room_version"]}")
////    implementation("androidx.room:room-ktx:${rootProject.extra["room_version"]}")
////
////    // Testing
////    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
////    androidTestImplementation("androidx.test.ext:junit:1.2.1")
////
////    implementation(platform("com.google.firebase:firebase-bom:33.11.0"))
////    implementation(libs.firebase.analytics)
////}
////
//
//
//dependencies {
//    // Compose BOM (Bill of Materials)
//    implementation(platform("androidx.compose:compose-bom:2025.03.00"))
//    implementation("androidx.activity:activity-compose:1.10.1")
//    implementation("androidx.compose.material3:material3")
//    implementation("androidx.compose.ui:ui")
//    implementation("androidx.compose.ui:ui-tooling")
//    implementation("androidx.compose.ui:ui-tooling-preview")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
//    implementation("androidx.navigation:navigation-compose:2.8.5")
//    implementation("androidx.core:core-ktx:1.15.0")
//
//    // Room
//    implementation("androidx.room:room-runtime:${rootProject.extra["room_version"]}")
//    implementation("androidx.room:room-ktx:${rootProject.extra["room_version"]}")
//    implementation(libs.androidx.annotation)
//    implementation(libs.support.v13)
//    ksp("androidx.room:room-compiler:${rootProject.extra["room_version"]}")
//
//    // Firebase
//    implementation(platform("com.google.firebase:firebase-bom:33.11.0"))
//    implementation(libs.firebase.analytics)
//    implementation(libs.firebase.auth.ktx)
//
//    // AndroidX and Material
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    implementation(libs.androidx.activity)
//    implementation(libs.androidx.constraintlayout)
//    implementation(libs.androidx.runtime.livedata)
//    implementation(libs.support.annotations)
//    implementation(libs.support.v4)
//
//    // Testing
//    testImplementation(libs.junit.junit)
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
//    androidTestImplementation("androidx.test.ext:junit:1.2.1")
//}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp") version "2.1.0-1.0.29"
    id("org.jetbrains.kotlin.plugin.compose")
    id("com.google.gms.google-services")
}

android {
    compileSdk = 35
    buildFeatures{
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.medical"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    namespace = "com.example.medical"
}

dependencies {
    // Import the Compose BOM
    implementation(platform("androidx.compose:compose-bom:2024.12.01"))
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
    implementation("androidx.navigation:navigation-compose:2.8.5")

    //Room
    implementation("androidx.room:room-runtime:${rootProject.extra["room_version"]}")
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.activity:activity:1.9.3")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.google.firebase:firebase-auth-ktx:23.1.0")
    implementation("com.google.firebase:firebase-auth:23.1.0")
    implementation("com.google.firebase:firebase-crashlytics-buildtools:3.0.2")
    implementation("androidx.compose.runtime:runtime-livedata:1.7.7")
    implementation(libs.support.annotations)
    ksp("androidx.room:room-compiler:${rootProject.extra["room_version"]}")
    implementation("androidx.room:room-ktx:${rootProject.extra["room_version"]}")

    // Testing
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
}
