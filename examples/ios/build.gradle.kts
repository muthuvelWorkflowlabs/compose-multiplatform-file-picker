plugins {
	kotlin("native.cocoapods")
	id("org.jetbrains.kotlin.multiplatform") version "1.9.22"
	id("org.jetbrains.compose") version "1.6.1"
}

kotlin {
	iosX64()
	iosArm64()
	iosSimulatorArm64()

	sourceSets {
		iosMain.dependencies {
			implementation(compose.ui)
			implementation(compose.foundation)
			implementation(compose.material)
			implementation(compose.runtime)

			implementation(project(":mpfilepicker"))
		}
	}
}


kotlin.cocoapods {
	name = "ios"
	version = "3.1.0"
	summary =
		"A multiplatform compose widget for picking files with each platform''s Native File Picker Dialog."
	homepage = "https://github.com/Wavesonics/compose-multiplatform-file-picker"
	ios.deploymentTarget = "14.1"

	framework {
		baseName = "ios"
	}

	podfile = project.file("../iosApp/Podfile")
}
