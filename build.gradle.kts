plugins {
    java
    application
}

group = "com.nwankees"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // PostgreSQL driver
    implementation("org.postgresql:postgresql:42.7.3")

    // HikariCP connection pool
    implementation("com.zaxxer:HikariCP:5.1.0")

    // logging
    implementation("org.slf4j:slf4j-simple:2.0.13")

    // Testing
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("com.nwankees.warehouse.App")
}

tasks.test {
    useJUnitPlatform()
}