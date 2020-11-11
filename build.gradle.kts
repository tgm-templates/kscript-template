plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation(kotlin("script-runtime"))
    implementation(kotlin("reflect"))
    implementation("khttp:khttp:1.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

sourceSets.getByName("main").java.srcDirs("src")
sourceSets.getByName("test").java.srcDirs("src")

