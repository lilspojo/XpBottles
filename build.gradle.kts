plugins {
    id("java")

    id("com.rikonardo.papermake") version "1.0.6"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

allprojects {
    group = "me.codedred"
    version = project.property("version")!!
}

dependencies {
    implementation(project(":core"))
    implementation(project(":v1_8_R3"))
    implementation(project(":v1_9_R2"))
    implementation(project(":v1_10_R1"))
    implementation(project(":v1_11_R1"))
    implementation(project(":v1_12_R1"))
    implementation(project(":v1_13_R2"))
    implementation(project(":v1_14_R1"))
    implementation(project(":v1_15_R1"))
    implementation(project(":v1_16_R1"))
    implementation(project(":v1_16_R2"))
    implementation(project(":v1_16_R3"))
    implementation(project(":v1_17_R1", "reobf"))
    implementation(project(":v1_18_R2", "reobf"))
    implementation(project(":v1_19_R1", "reobf"))
    implementation(project(":v1_19_R2", "reobf"))
    implementation(project(":v1_19_R3", "reobf"))
    implementation(project(":v1_20_R1", "reobf"))
    implementation(project(":v1_20_R2", "reobf"))
    implementation(project(":v1_21_R1", "reobf"))
}

tasks {
    jar {
        enabled = false
    }

    shadowJar {
        archiveClassifier.set("")
    }

    build {
        dependsOn(shadowJar)
    }
}
