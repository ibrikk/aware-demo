pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Aware"
include(":app")
include(":aware_core")
project(":aware_core").projectDir = File(rootDir, "com.awareframework.android.core/library/")


include(":aware_accelerometer")
project(":aware_accelerometer").projectDir =
    File(rootDir, "com.awareframework.android.sensor.accelerometer/library/")

