plugins {
    id("com.gradle.develocity") version "3.18.1"
}

develocity.buildScan.termsOfUseUrl = "https://gradle.com/help/legal-terms-of-use"
develocity.buildScan.termsOfUseAgree = "yes"

rootProject.name = "ip-parallel"

include("a")
include("b")
include("c")

// Example of using Isolated Projects-safe APIs

//gradle.lifecycle.beforeProject {
//    project.group = "org.example"
//}