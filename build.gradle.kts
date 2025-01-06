plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.sourceforge.tess4j:tess4j:5.6.0") // Tesseract OCR dependency
}
dependencies {
    implementation ("org.slf4j:slf4j-simple:2.0.9")
}


