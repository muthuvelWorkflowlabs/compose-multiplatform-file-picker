plugins {
	id("org.jetbrains.kotlin.multiplatform") version "1.9.22"
	id("org.jetbrains.compose") version "1.6.1"
}

kotlin {
	js(IR) {
		browser()
		binaries.executable()
	}
	sourceSets {
		val jsMain by getting {
			dependencies {
				implementation("org.jetbrains.kotlinx:kotlinx-html:0.11.0")
				implementation(kotlin("stdlib-js"))
				implementation(compose.html.core)
				implementation(compose.runtime)
				implementation(project(":mpfilepicker"))
			}
		}
	}
}
