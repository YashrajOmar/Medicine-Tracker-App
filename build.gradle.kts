// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    extra.apply {
//        set("room_version", "2.6.1")
//    }
//}
//
//plugins {
//    id("com.android.application") version "8.8.2" apply false
//    id("com.android.library") version "8.8.2" apply false
//    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
//    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
//
//    id("com.google.devtools.ksp") version "2.1.10-1.0.31" apply false
//    id("com.google.gms.google-services") version "4.4.2" apply false
//}
//
////plugins {
////    id("com.android.application") version "8.2.2" apply false
////    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
////    id("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
////}
//
//tasks.register("clean", Delete::class) {
//    delete(rootProject.buildDir)
//}

buildscript {
    extra.apply {
        set("room_version", "2.6.1")
    }
}

plugins {
    id("com.android.application") version "8.7.3" apply false
    id("com.android.library") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
