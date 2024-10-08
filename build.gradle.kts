/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
            artifactUrls(
                "https://mirrors.cloud.tencent.com/nexus/repository/maven-public/",
                "https://mirrors.163.com/maven/repository/maven-public/",
                "https://repo.maven.apache.org/maven2/"
            )
        }
        maven {
            setUrl("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
            artifactUrls(
                "https://maven.aliyun.com/repository/public",
                "https://mirrors.163.com/maven/repository/maven-public/",
                "https://repo.maven.apache.org/maven2/"
            )
        }
        mavenCentral()
    }
}

var liquibaseVersion = "4.29.2"
var hibernateVersion = "6.3.1.Final"
var springVersion = "6.1.13"

dependencies {
    api("org.liquibase:liquibase-core:$liquibaseVersion")
    api("org.hibernate.orm:hibernate-core:$hibernateVersion")
    api("org.hibernate.orm:hibernate-envers:$hibernateVersion")

    compileOnly("org.springframework:spring-test:$springVersion")
    compileOnly("org.springframework:spring-jdbc:$springVersion")
    compileOnly("org.springframework:spring-beans:$springVersion")
    compileOnly("org.springframework:spring-context:$springVersion")
    compileOnly("org.springframework:spring-orm:$springVersion")

    testImplementation("junit:junit:4.13")
    testImplementation("org.hamcrest:hamcrest:3.0")
    testImplementation("com.h2database:h2:+")
    testImplementation("org.hsqldb:hsqldb:+")
    testImplementation("com.microsoft.sqlserver:mssql-jdbc:+")
    testImplementation("com.oracle.database.jdbc:ojdbc8:+")
    testImplementation("org.postgresql:postgresql:+")
    testImplementation("org.springframework:spring-test:$springVersion")
    testImplementation("org.springframework:spring-jdbc:$springVersion")
    testImplementation("org.springframework:spring-beans:$springVersion")
    testImplementation("org.springframework:spring-context:$springVersion")
    testImplementation("org.springframework:spring-orm:$springVersion")
}

group = "org.liquibase.ext"
version = "4.29.2-SNAPSHOT"
description = "Liquibase Hibernate Integration"
java.sourceCompatibility = JavaVersion.VERSION_17
