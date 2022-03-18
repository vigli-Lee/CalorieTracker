// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
    dependencies {
        classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.8.0-SNAPSHOT")
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

}
apply(plugin = "com.vanniktech.dependency.graph.generator")

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}