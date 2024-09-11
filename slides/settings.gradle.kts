pluginManagement {
    repositories {
        maven {
            url = uri("https://repo.gradle.org/artifactory/jcenter-backup/")
            content {
                includeGroup("com.burgstaller") // Legacy dependency only on JCenter
            }
        }
        gradlePluginPortal()
    }
}
rootProject.name = "devoxxbe-gradle9"
