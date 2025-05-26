plugins {
	kotlin("jvm")
	id("org.jetbrains.compose") version "1.6.1"
}

dependencies {
	implementation(project(":mpfilepicker"))
	implementation(compose.desktop.currentOs)
}
