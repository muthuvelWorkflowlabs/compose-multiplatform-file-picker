plugins {
	id("org.jetbrains.kotlin.multiplatform") version "1.9.22"
	id("org.jetbrains.compose") version "1.6.1"
}

kotlin {
	macosX64 {
		binaries {
			executable {
				entryPoint = "main"
			}
		}
	}

	sourceSets {
		val macosX64Main by getting {
			dependencies {
				implementation(compose.ui)
				implementation(compose.foundation)
				implementation(compose.material3)
				implementation(compose.runtime)
				implementation(project(":mpfilepicker"))
			}
		}
	}
}
