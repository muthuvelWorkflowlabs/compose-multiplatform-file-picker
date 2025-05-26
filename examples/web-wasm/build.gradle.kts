import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
	id("org.jetbrains.kotlin.multiplatform") version "1.9.22"
	id("org.jetbrains.compose") version "1.6.1"
}

kotlin {
	@OptIn(ExperimentalWasmDsl::class)
	wasmJs {
		browser {
			commonWebpackConfig {
				outputFileName = "composeApp.js"
			}
		}
		binaries.executable()
	}
	sourceSets {
		val wasmJsMain by getting {
			dependencies {
				implementation(compose.runtime)
				implementation(compose.foundation)
				implementation(compose.material3)
				implementation(project(":mpfilepicker"))
			}
		}
	}
}

compose.experimental {
	web.application {}
}
