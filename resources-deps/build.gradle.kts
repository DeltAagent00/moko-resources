/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("org.jetbrains.kotlin.jvm") version("1.4.31")
}

repositories {
    mavenCentral()
    google()

    jcenter {
        content {
            includeGroup("org.jetbrains.trove4j")
        }
    }
}

dependencies {
    api("dev.icerock:mobile-multiplatform:0.9.1")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
    api("com.android.tools.build:gradle:4.1.2")
}

group = "gradle"
version = "1"
