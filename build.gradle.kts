plugins {
    java
    application
}
application {
    mainClass.set("FormRecognizer")
}
repositories {
    mavenCentral()
}
dependencies {
    implementation(group = "com.azure", name = "azure-ai-formrecognizer", version = "4.0.0")
    implementation(group = "com.google.code.gson", name = "gson", version = "2.7")
}


