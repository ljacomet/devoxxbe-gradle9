import java.time.LocalTime
import java.time.format.DateTimeFormatter

plugins {
    java
}

val sleep = 5_000L
fun now(): String = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))

println("Demo-configuring $project, waiting... (${now()})")
Thread.sleep(sleep)
println("Demo-configuring $project, done waiting (${now()})")

tasks.named("compileJava") {
    doLast {
        Thread.sleep(1000)
    }
}