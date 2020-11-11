plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-script-runtime")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("khttp:khttp:1.0.0")
}

sourceSets.getByName("main").java.srcDirs("src")
sourceSets.getByName("test").java.srcDirs("src")

