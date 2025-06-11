<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">

<img src="readmeai/assets/logos/purple.svg" width="30%" style="position: relative; top: 0; right: 0;" alt="Project Logo"/>

# STREAKIFY

<em>Transform streaks into unstoppable progress, every day.</em>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/ViktorKaderabek/Streakify?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
<img src="https://img.shields.io/github/last-commit/ViktorKaderabek/Streakify?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/ViktorKaderabek/Streakify?style=default&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/ViktorKaderabek/Streakify?style=default&color=0080ff" alt="repo-language-count">

<!-- default option, no dependency badges. -->


<!-- default option, no dependency badges. -->

</div>
<br>

---

## Table of Contents

- [Table of Contents](#table-of-contents)
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
    - [Project Index](#project-index)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Usage](#usage)
    - [Testing](#testing)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Overview

Streakify revolutionizes cross-platform app development, offering a unified solution for building exceptional Android and iOS applications with ease.

**Why Streakify?**

This project promotes efficient and scalable mobile app development. The core features include:

- **🍀 Multiplatform Support:** Develop apps efficiently for both Android and iOS using Kotlin Multiplatform, simplifying maintenance and updates.
- **🚀 Dependency Injection with Koin:** Enhance code modularity and testability through streamlined dependency management.
- **🔥 Firebase Integration:** Enjoy seamless backend support for authentication, cloud storage, and app management, accelerating backend service setup.
- **🎨 Modern UI Development:** Leverage Jetpack Compose and SwiftUI for creating responsive and visually appealing user interfaces.
- **🛡️ Code Quality Assurance:** Maintain high code quality and consistency with Detekt for static code analysis and centralized version management.

---

## Features

|      | Component       | Details                              |
| :--- | :-------------- | :----------------------------------- |
| ⚙️  | **Architecture**  | <ul><li>Kotlin & Swift for cross-platform</li><li>Android & iOS apps</li><li>Modular structure with Gradle</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Static analysis with **Detekt** (Kotlin)</li><li>Consistent coding conventions</li></ul> |
| 📄 | **Documentation** | <ul><li>No comprehensive documentation provided</li><li>Minimal comments within code</li></ul> |
| 🔌 | **Integrations**  | <ul><li>Google Services integration</li><li>Gradle for build automation</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Multiple Gradle modules: **shared**, **features/home**</li><li>`project.pbxproj` for iOS projects</li></ul> |
| 🧪 | **Testing**       | <ul><li>No visible unit/integration tests</li><li>Potential for JUnit and XCTest usage</li></ul> |
| ⚡️  | **Performance**   | <ul><li>No performance optimizations noted</li><li>Scalable architecture potential</li></ul> |
| 🛡️ | **Security**      | <ul><li>Usage of `google-services.json` for config</li><li>No evident security audits</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Kotlin & Swift standard libraries</li><li>Third-party dependencies managed via Gradle</li></ul> |
| 🚀 | **Scalability**   | <ul><li>Designed for both Android/iOS platforms</li><li>Potential for high scalability with modular design</li></ul> |
```

---

## Project Structure

```sh
└── Streakify/
    ├── Changelog.md
    ├── README.md
    ├── android
    │   ├── Streakify_AN
    │   │   ├── build.gradle.kts
    │   │   ├── google-services.json
    │   │   └── src
    │   │       └── main
    │   └── features
    │       └── home
    │           ├── .gitignore
    │           ├── build.gradle.kts
    │           └── src
    ├── build.gradle.kts
    ├── config
    │   └── detekt
    │       └── detekt.yml
    ├── gradle
    │   ├── libs.versions.toml
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── ios
    │   ├── Streakify_IOS
    │   │   ├── Assets.xcassets
    │   │   │   └── AccentColor.colorset
    │   │   ├── ContentView.swift
    │   │   ├── GoogleService-Info.plist
    │   │   ├── Info.plist
    │   │   ├── Preview Content
    │   │   │   └── Preview Assets.xcassets
    │   │   └── iOSApp.swift
    │   └── Streakify_IOS.xcodeproj
    │       ├── project.pbxproj
    │       └── project.xcworkspace
    │           ├── contents.xcworkspacedata
    │           └── xcshareddata
    ├── settings.gradle.kts
    └── shared
        ├── build.gradle.kts
        └── src
            ├── androidMain
            │   └── kotlin
            ├── commonMain
            │   └── kotlin
            └── iosMain
                └── kotlin
```

### Project Index

<details open>
	<summary><b><code>STREAKIFY/</code></b></summary>
	<!-- __root__ Submodule -->
	<details>
		<summary><b>__root__</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ __root__</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- Configuration of Gradle plugins sets up the project environment for both Android and Kotlin Multiplatform development, ensuring that applications can be built efficiently across different platforms<br>- It incorporates essential tools for linting and code quality checks with ktlint and detekt, and supports Firebase integration by organizing necessary dependencies<br>- This structure contributes to a well-maintained and scalable codebase, optimizing development processes.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/settings.gradle.kts'>settings.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- The <code>settings.gradle.kts</code> file configures the initial setup for the Streakify project by defining the project name, managing plugin and dependency repositories, and organizing module inclusions<br>- It enhances controlled access to project dependencies and enables features for project accessors<br>- Establishing these settings ensures efficient build configurations, aiding in the seamless integration and management of different project components and dependencies within the Streakify architecture.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
					<td style='padding: 8px;'>- Gradlew.bat serves as a Windows-specific startup script for Gradle, facilitating the building and automation of project tasks<br>- It ensures the correct Java environment is set up by locating the Java installation and configuring JVM options, then initiates the Gradle Wrapper main class<br>- Effective in managing project dependencies and builds in a portable, environment-independent manner across Windows systems.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- shared Submodule -->
	<details>
		<summary><b>shared</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ shared</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/build.gradle.kts'>build.gradle.kts</a></b></td>
					<td style='padding: 8px;'>- Facilitates the configuration of a Kotlin Multiplatform project by setting up plugins and dependencies for Android and iOS targets<br>- Establishes Android and iOS compilation settings, ensuring compatibility with specified SDK versions and JVM targets<br>- Integrates Compose for UI and Koin for dependency injection, providing a cohesive environment for building shared code between Android and iOS platforms within the Streakify namespace.</td>
				</tr>
			</table>
			<!-- src Submodule -->
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ shared.src</b></code>
					<!-- androidMain Submodule -->
					<details>
						<summary><b>androidMain</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ shared.src.androidMain</b></code>
							<!-- kotlin Submodule -->
							<details>
								<summary><b>kotlin</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ shared.src.androidMain.kotlin</b></code>
									<!-- cz Submodule -->
									<details>
										<summary><b>cz</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ shared.src.androidMain.kotlin.cz</b></code>
											<!-- streakify Submodule -->
											<details>
												<summary><b>streakify</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify</b></code>
													<!-- streakify Submodule -->
													<details>
														<summary><b>streakify</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify</b></code>
															<!-- di Submodule -->
															<details>
																<summary><b>di</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.di</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/androidMain/kotlin/cz/streakify/streakify/di/moduleAndroid.kt'>moduleAndroid.kt</a></b></td>
																			<td style='padding: 8px;'>- Defines the Android-specific dependency injection module using Koin within the Streakify project, contributing to the modular architecture by facilitating the platform-specific integrations<br>- This setup promotes code reusability and maintainability across different platforms supported by the project, aligning with the broader aim to ensure seamless operation and configuration of dependencies on Android devices.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- util Submodule -->
															<details>
																<summary><b>util</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.util</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/androidMain/kotlin/cz/streakify/streakify/util/Result.kt'>Result.kt</a></b></td>
																			<td style='padding: 8px;'>- Defines a Result type hierarchy to standardize success and error handling across the project<br>- This construct simplifies the process of indicating operation outcomes by encapsulating data on success or specific error details when failures occur<br>- It enhances code reliability and readability, aiding developers in managing various operational result scenarios within the Streakify application, fostering consistent practices and reducing error-prone code.</td>
																		</tr>
																	</table>
																	<!-- usecase Submodule -->
																	<details>
																		<summary><b>usecase</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.util.usecase</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/androidMain/kotlin/cz/streakify/streakify/util/usecase/UseCaseResult.kt'>UseCaseResult.kt</a></b></td>
																					<td style='padding: 8px;'>- Facilitates the execution of use cases within the Android component of the Streakify project, providing a consistent pattern for handling results and errors<br>- Defines interfaces for use cases with and without expected results, and includes a utility function to manage operations in a coroutine context<br>- Enhances error management by encapsulating unhandled exceptions, contributing to robust and maintainable asynchronous processing.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- features Submodule -->
															<details>
																<summary><b>features</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.features</b></code>
																	<!-- vm Submodule -->
																	<details>
																		<summary><b>vm</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.features.vm</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/androidMain/kotlin/cz/streakify/streakify/features/vm/BaseIntentViewModel.kt'>BaseIntentViewModel.kt</a></b></td>
																					<td style='padding: 8px;'>- BaseIntentViewModel.kt serves as a foundational component in the Android architecture of the Streakify app<br>- It abstracts the handling of UI intents within the ViewModel layer, allowing state management through coroutines<br>- By defining a contract for handling user actions, it enhances the modularity and testability of feature-specific ViewModels<br>- This setup supports seamless integration of state and actions across the user interface.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- base Submodule -->
																	<details>
																		<summary><b>base</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ shared.src.androidMain.kotlin.cz.streakify.streakify.features.base</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/androidMain/kotlin/cz/streakify/streakify/features/base/Dimens.kt'>Dimens.kt</a></b></td>
																					<td style='padding: 8px;'>- Define a set of standardized spacing, radius, and elevation dimensions for consistent UI design across the Android section of the Streakify project<br>- By centralizing these UI metrics, the system achieves a coherent look and feel, ensuring that elements are visually appealing and well-aligned<br>- This foundational approach not only enhances maintainability but also streamlines design adjustments across the applications components.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- commonMain Submodule -->
					<details>
						<summary><b>commonMain</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ shared.src.commonMain</b></code>
							<!-- kotlin Submodule -->
							<details>
								<summary><b>kotlin</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ shared.src.commonMain.kotlin</b></code>
									<!-- cz Submodule -->
									<details>
										<summary><b>cz</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ shared.src.commonMain.kotlin.cz</b></code>
											<!-- streakify Submodule -->
											<details>
												<summary><b>streakify</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify</b></code>
													<!-- streakify Submodule -->
													<details>
														<summary><b>streakify</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify.streakify</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/commonMain/kotlin/cz/streakify/streakify/Platform.kt'>Platform.kt</a></b></td>
																	<td style='padding: 8px;'>- Initialize the dependency injection framework using Koin by setting up necessary application modules<br>- Facilitate the configuration of platform-specific and core modules, streamlining the injection of dependencies throughout the application<br>- Enable this centralized configuration to promote modular architecture, improve testability, and ensure efficient resource management across different components within the Streakify project.</td>
																</tr>
															</table>
															<!-- di Submodule -->
															<details>
																<summary><b>di</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify.streakify.di</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/commonMain/kotlin/cz/streakify/streakify/di/module.kt'>module.kt</a></b></td>
																			<td style='padding: 8px;'>- Facilitates dependency injection within the Streakify project by defining a core module and an expected platform module using Koin, a lightweight dependency injection framework<br>- Aims to streamline object creation and management across different platforms, ensuring coherent and maintainable architecture<br>- Contributes to a modular and scalable codebase, enhancing testability and flexibility when integrating various components of the application.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- features Submodule -->
															<details>
																<summary><b>features</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify.streakify.features</b></code>
																	<!-- home Submodule -->
																	<details>
																		<summary><b>home</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify.streakify.features.home</b></code>
																			<!-- presentation Submodule -->
																			<details>
																				<summary><b>presentation</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ shared.src.commonMain.kotlin.cz.streakify.streakify.features.home.presentation</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/commonMain/kotlin/cz/streakify/streakify/features/home/presentation/HomeScreen.kt'>HomeScreen.kt</a></b></td>
																							<td style='padding: 8px;'>- HomeScreen function defines the main user interface for the home feature of the Streakify application, using Jetpack Compose to render components<br>- It arranges UI elements in a vertically centered column, providing a responsive layout that fills the entire screen<br>- Serving as a foundational UI component, HomeScreen establishes the visual hierarchy for the home feature, ensuring a consistent user experience within the overall app architecture.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- iosMain Submodule -->
					<details>
						<summary><b>iosMain</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ shared.src.iosMain</b></code>
							<!-- kotlin Submodule -->
							<details>
								<summary><b>kotlin</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ shared.src.iosMain.kotlin</b></code>
									<!-- cz Submodule -->
									<details>
										<summary><b>cz</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ shared.src.iosMain.kotlin.cz</b></code>
											<!-- streakify Submodule -->
											<details>
												<summary><b>streakify</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ shared.src.iosMain.kotlin.cz.streakify</b></code>
													<!-- streakify Submodule -->
													<details>
														<summary><b>streakify</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ shared.src.iosMain.kotlin.cz.streakify.streakify</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/iosMain/kotlin/cz/streakify/streakify/PlatformIOS.kt'>PlatformIOS.kt</a></b></td>
																	<td style='padding: 8px;'>- Acts as the entry point for initializing the dependency injection framework Koin on the iOS platform within the Streakify project<br>- Facilitates the setup of shared dependencies necessary for the seamless integration of iOS-specific components<br>- Strengthens the project’s architecture by ensuring consistent dependency management across multiple platforms, enhancing modularity and maintainability in the shared codebase.</td>
																</tr>
															</table>
															<!-- di Submodule -->
															<details>
																<summary><b>di</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.iosMain.kotlin.cz.streakify.streakify.di</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/iosMain/kotlin/cz/streakify/streakify/di/moduleIOS.kt'>moduleIOS.kt</a></b></td>
																			<td style='padding: 8px;'>- Defines the platform-specific dependency injection module for iOS in the Streakify project<br>- Integrates with Koin, a popular dependency injection framework, to manage and provide necessary services or components tailored to the iOS platform<br>- Enhances the modularity and reusability of the codebase by ensuring platform-centric dependencies are encapsulated and easily manageable within the architecture of the application.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- features Submodule -->
															<details>
																<summary><b>features</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ shared.src.iosMain.kotlin.cz.streakify.streakify.features</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/shared/src/iosMain/kotlin/cz/streakify/streakify/features/App.kt'>App.kt</a></b></td>
																			<td style='padding: 8px;'>- Serves as the entry point for the iOS application feature within the codebase, creating a user interface controller using Jetpack Compose for iOS<br>- It integrates seamlessly with the HomeScreen component to provide a starting screen for the application<br>- This setup leverages cross-platform UI development, allowing shared UI logic between Android and iOS platforms, enhancing code reuse and maintainability.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- gradle Submodule -->
	<details>
		<summary><b>gradle</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ gradle</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/gradle/libs.versions.toml'>libs.versions.toml</a></b></td>
					<td style='padding: 8px;'>- The <code>gradle/libs.versions.toml</code> file centralizes version management for dependencies and plugins in the project<br>- By defining versions once and referencing them across various modules, it ensures consistency and simplifies updates<br>- This approach enhances maintainability and supports scalable development, particularly for projects using AndroidX, Jetpack Compose, Koin, Firebase, and Kotlin Multiplatform technologies, by streamlining version control and integration.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- android Submodule -->
	<details>
		<summary><b>android</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ android</b></code>
			<!-- Streakify_AN Submodule -->
			<details>
				<summary><b>Streakify_AN</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ android.Streakify_AN</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/build.gradle.kts'>build.gradle.kts</a></b></td>
							<td style='padding: 8px;'>- The build.gradle.kts file configures the Android app module for the Streakify project<br>- It establishes project settings like namespace, SDK versions, and build types<br>- It integrates Kotlin, Jetpack Compose, Firebase, and other plugins for application development and linting<br>- Additionally, it defines dependencies for shared components and Compose UI libraries, setting up source compatibility with Java 8.</td>
						</tr>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/google-services.json'>google-services.json</a></b></td>
							<td style='padding: 8px;'>- Integrating Streakifys Android app with Firebase services, the google-services.json configuration facilitates essential Google APIs and services such as authentication, cloud storage, and app invites<br>- It links the apps unique identifiers and project details with Firebase's infrastructure, enabling seamless backend communication and support for dynamic functionalities, improving user experience and application's overall feature set within the Streakify environment.</td>
						</tr>
					</table>
					<!-- src Submodule -->
					<details>
						<summary><b>src</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ android.Streakify_AN.src</b></code>
							<!-- main Submodule -->
							<details>
								<summary><b>main</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ android.Streakify_AN.src.main</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/src/main/AndroidManifest.xml'>AndroidManifest.xml</a></b></td>
											<td style='padding: 8px;'>- Defines the essential configuration for the Android app, specifying the main application properties and entry point<br>- Establishes the MainActivity as the default activity that launches when the app starts, ensures compatibility with right-to-left languages, and applies the overall app theme<br>- Key declarations such as backup preferences and initial permissions structure the app’s execution within the Android operating system, aligning it with user expectations and platform norms.</td>
										</tr>
									</table>
									<!-- java Submodule -->
									<details>
										<summary><b>java</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ android.Streakify_AN.src.main.java</b></code>
											<!-- cz Submodule -->
											<details>
												<summary><b>cz</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ android.Streakify_AN.src.main.java.cz</b></code>
													<!-- streakify Submodule -->
													<details>
														<summary><b>streakify</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ android.Streakify_AN.src.main.java.cz.streakify</b></code>
															<!-- streakify Submodule -->
															<details>
																<summary><b>streakify</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ android.Streakify_AN.src.main.java.cz.streakify.streakify</b></code>
																	<!-- android Submodule -->
																	<details>
																		<summary><b>android</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ android.Streakify_AN.src.main.java.cz.streakify.streakify.android</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/src/main/java/cz/streakify/streakify/android/App.kt'>App.kt</a></b></td>
																					<td style='padding: 8px;'>- Serves as the entry point for initializing the Android application within the Streakify project<br>- Establishes a foundational setup by configuring the Koin dependency injection framework, which utilizes the android context for seamless integration<br>- Plays a crucial role in ensuring that all necessary dependencies are available to various components of the application, thereby facilitating efficient application launch and functioning within the overall project architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/src/main/java/cz/streakify/streakify/android/MainActivity.kt'>MainActivity.kt</a></b></td>
																					<td style='padding: 8px;'>- MainActivity in the Streakify Android application serves as the entry point for the app, setting up the main user interface<br>- By implementing the HomeScreen as its content within the Android activity lifecycle, it establishes the primary navigation and user interaction hub<br>- This component plays a crucial role in the seamless integration of presentation logic, user interface setup, and supporting overall app functionality within the Android architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- res Submodule -->
									<details>
										<summary><b>res</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ android.Streakify_AN.src.main.res</b></code>
											<!-- values Submodule -->
											<details>
												<summary><b>values</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ android.Streakify_AN.src.main.res.values</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/Streakify_AN/src/main/res/values/styles.xml'>styles.xml</a></b></td>
															<td style='padding: 8px;'>- Defines the visual theme of the Android app, utilizing Material Design principles by extending the <code>Theme.Material.NoActionBar</code><br>- This styling choice dictates the apps overall aesthetic, ensuring consistency and coherence across the user interface<br>- By modifying this theme, developers can efficiently manage the apps appearance and customize it to align with branding or design requirements while maintaining a modern, minimalist look devoid of the default Android action bar.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<!-- features Submodule -->
			<details>
				<summary><b>features</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ android.features</b></code>
					<!-- home Submodule -->
					<details>
						<summary><b>home</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ android.features.home</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/features/home/build.gradle.kts'>build.gradle.kts</a></b></td>
									<td style='padding: 8px;'>- Configure the Android home feature module by setting the appropriate build environment, compile options, and dependencies<br>- Define properties for compilation such as the compile SDK version, namespace, and Java compatibility<br>- Include necessary plugins and dependencies for ensuring functionality and testing support<br>- This setup is crucial for maintaining a consistent and optimally performing module within the overall project architecture.</td>
								</tr>
							</table>
							<!-- src Submodule -->
							<details>
								<summary><b>src</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ android.features.home.src</b></code>
									<!-- main Submodule -->
									<details>
										<summary><b>main</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ android.features.home.src.main</b></code>
											<!-- java Submodule -->
											<details>
												<summary><b>java</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ android.features.home.src.main.java</b></code>
													<!-- cz Submodule -->
													<details>
														<summary><b>cz</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ android.features.home.src.main.java.cz</b></code>
															<!-- streakify Submodule -->
															<details>
																<summary><b>streakify</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ android.features.home.src.main.java.cz.streakify</b></code>
																	<!-- home Submodule -->
																	<details>
																		<summary><b>home</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ android.features.home.src.main.java.cz.streakify.home</b></code>
																			<!-- di Submodule -->
																			<details>
																				<summary><b>di</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ android.features.home.src.main.java.cz.streakify.home.di</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/features/home/src/main/java/cz/streakify/home/di/Module.kt'>Module.kt</a></b></td>
																							<td style='padding: 8px;'>- Defines the dependency injection configuration for the home feature within the Streakify Android application<br>- By organizing dependencies in a modular fashion, it facilitates efficient management and scalability of the codebase<br>- Integrating with the larger architecture, it streamlines the setup of necessary components for the home module, promoting maintainability and enhancing the overall modularity of the application.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- test Submodule -->
									<details>
										<summary><b>test</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ android.features.home.src.test</b></code>
											<!-- java Submodule -->
											<details>
												<summary><b>java</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ android.features.home.src.test.java</b></code>
													<!-- cz Submodule -->
													<details>
														<summary><b>cz</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ android.features.home.src.test.java.cz</b></code>
															<!-- streakify Submodule -->
															<details>
																<summary><b>streakify</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ android.features.home.src.test.java.cz.streakify</b></code>
																	<!-- home Submodule -->
																	<details>
																		<summary><b>home</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ android.features.home.src.test.java.cz.streakify.home</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/features/home/src/test/java/cz/streakify/home/ExampleUnitTest.kt'>ExampleUnitTest.kt</a></b></td>
																					<td style='padding: 8px;'>- ExampleUnitTest serves as a foundational local unit test within the Streakify apps home feature, ensuring basic arithmetic operations like addition function accurately<br>- By verifying that mathematical logic is correct, it provides initial validation of code integrity within the Android development environment<br>- This contributes to the overall robustness and reliability of the home feature, aligning with the projects commitment to quality assurance.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- androidTest Submodule -->
									<details>
										<summary><b>androidTest</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ android.features.home.src.androidTest</b></code>
											<!-- java Submodule -->
											<details>
												<summary><b>java</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ android.features.home.src.androidTest.java</b></code>
													<!-- cz Submodule -->
													<details>
														<summary><b>cz</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ android.features.home.src.androidTest.java.cz</b></code>
															<!-- streakify Submodule -->
															<details>
																<summary><b>streakify</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ android.features.home.src.androidTest.java.cz.streakify</b></code>
																	<!-- home Submodule -->
																	<details>
																		<summary><b>home</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ android.features.home.src.androidTest.java.cz.streakify.home</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/android/features/home/src/androidTest/java/cz/streakify/home/ExampleInstrumentedTest.kt'>ExampleInstrumentedTest.kt</a></b></td>
																					<td style='padding: 8px;'>- Facilitates the execution of an instrumented test for the home feature in the Streakify Android application<br>- Validates that the applications context is correctly set up by checking the package name, ensuring the apps environment is correctly configured<br>- Part of the broader test suite, this functionality supports maintaining robust, reliable app performance by verifying expected behavior on actual Android devices.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- ios Submodule -->
	<details>
		<summary><b>ios</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ ios</b></code>
			<!-- Streakify_IOS Submodule -->
			<details>
				<summary><b>Streakify_IOS</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ ios.Streakify_IOS</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/GoogleService-Info.plist'>GoogleService-Info.plist</a></b></td>
							<td style='padding: 8px;'>- Configuration of integration with Firebase services for the iOS app Streakify is facilitated through this GoogleService-Info.plist file<br>- It includes essential keys such as API keys and project identifiers vital for services like Google Cloud Messaging and app invites<br>- This integration supports project-specific functionalities like user sign-in and Cloud Messaging, crucial for maintaining seamless user experience and backend communication in the app.</td>
						</tr>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/iOSApp.swift'>iOSApp.swift</a></b></td>
							<td style='padding: 8px;'>- Acts as the entry point for the iOS version of the Streakify app, initializing critical components required for the apps lifecycle, including Firebase and Koin<br>- It utilizes SwiftUI for the apps user interface and integrates seamlessly with the shared Kotlin codebase, establishing a clear bridge between iOS and shared features<br>- Ensures a smooth startup process and prepares the UI for interaction through ContentView.</td>
						</tr>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/ContentView.swift'>ContentView.swift</a></b></td>
							<td style='padding: 8px;'>- ContentView.swift serves as the main entry point for the iOS interface of the Streakify application<br>- Leveraging SwiftUI, it displays a greeting message by integrating with shared application logic<br>- This file contributes to a cross-platform architecture by connecting the visual elements of the iOS app with business logic shared across different platforms, facilitating consistency and streamlined updates.</td>
						</tr>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/Info.plist'>Info.plist</a></b></td>
							<td style='padding: 8px;'>- The Info.plist file configures essential metadata for the Streakify iOS application, defining details such as the app’s bundle identifier, versioning, and device compatibility settings<br>- It ensures the app is correctly recognized by the iOS operating system and supports required features, laying the groundwork for app behavior including supported device orientations, executable name, and interface<br>- This forms a critical part of the apps deployment package.</td>
						</tr>
					</table>
					<!-- Preview Content Submodule -->
					<details>
						<summary><b>Preview Content</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ ios.Streakify_IOS.Preview Content</b></code>
							<!-- Preview Assets.xcassets Submodule -->
							<details>
								<summary><b>Preview Assets.xcassets</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ ios.Streakify_IOS.Preview Content.Preview Assets.xcassets</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/Preview Content/Preview Assets.xcassets/Contents.json'>Contents.json</a></b></td>
											<td style='padding: 8px;'>- Define metadata for preview assets used in the iOS component of the Streakify application<br>- By doing so, it ensures the proper handling and organization of asset previews within the development environment<br>- This structure aids in maintaining consistency and compatibility with the Xcode platform, enabling developers to efficiently manage and visualize assets during the design and development phases of the app.</td>
										</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- Assets.xcassets Submodule -->
					<details>
						<summary><b>Assets.xcassets</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ ios.Streakify_IOS.Assets.xcassets</b></code>
							<!-- AccentColor.colorset Submodule -->
							<details>
								<summary><b>AccentColor.colorset</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ ios.Streakify_IOS.Assets.xcassets.AccentColor.colorset</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS/Assets.xcassets/AccentColor.colorset/Contents.json'>Contents.json</a></b></td>
											<td style='padding: 8px;'>- Defines a universal accent color scheme for the Streakify iOS application<br>- This color configuration underpins the app’s visual identity by ensuring consistency across various devices<br>- Stored within the iOS asset catalog, it leverages Xcodes resource management capabilities to streamline color management, enhancing the development process and contributing to a cohesive user experience throughout the apps interface.</td>
										</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<!-- Streakify_IOS.xcodeproj Submodule -->
			<details>
				<summary><b>Streakify_IOS.xcodeproj</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ ios.Streakify_IOS.xcodeproj</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS.xcodeproj/project.pbxproj'>project.pbxproj</a></b></td>
							<td style='padding: 8px;'>- The file located at <code>ios/Streakify_IOS.xcodeproj/project.pbxproj</code> serves as a configuration and management hub for the Xcode project associated with the iOS version of the application Streakify<br>- This project file is crucial in the overall architecture as it organizes various resources, source files, and dependencies needed to build the iOS application<br>- Specifically, it defines the build settings and file references, including assets, source code, and frameworks required for compiling the app<br>- By coordinating how these components are linked and accessed, it ensures a streamlined build process and facilitates integration with third-party services, such as Firebase, through included resources like <code>GoogleService-Info.plist</code><br>- This allows developers to efficiently manage the project as it grows and evolves, making it a pivotal component in the app development lifecycle.</td>
						</tr>
					</table>
					<!-- project.xcworkspace Submodule -->
					<details>
						<summary><b>project.xcworkspace</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ ios.Streakify_IOS.xcodeproj.project.xcworkspace</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS.xcodeproj/project.xcworkspace/contents.xcworkspacedata'>contents.xcworkspacedata</a></b></td>
									<td style='padding: 8px;'>- Define the structural configuration for the Streakify iOS project workspace by managing references and dependencies essential for development within Xcode<br>- This workspace file orchestrates the integration of different project components, ensuring a unified environment for iOS app development<br>- By maintaining the organizational framework, it facilitates collaborative development and streamlined navigation across various modules of the Streakify codebase.</td>
								</tr>
							</table>
							<!-- xcshareddata Submodule -->
							<details>
								<summary><b>xcshareddata</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ ios.Streakify_IOS.xcodeproj.project.xcworkspace.xcshareddata</b></code>
									<!-- swiftpm Submodule -->
									<details>
										<summary><b>swiftpm</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ ios.Streakify_IOS.xcodeproj.project.xcworkspace.xcshareddata.swiftpm</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/ios/Streakify_IOS.xcodeproj/project.xcworkspace/xcshareddata/swiftpm/Package.resolved'>Package.resolved</a></b></td>
													<td style='padding: 8px;'>- The Package.resolved file in the Streakify iOS project determines the exact package dependencies and their versions used in the applications build process<br>- It ensures consistency by locking these dependencies across different development environments, aligning with the projects overall architecture to integrate various libraries, including Firebase and Google SDKs, which are essential for analytics, data transport, and device-specific functionalities.</td>
												</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- config Submodule -->
	<details>
		<summary><b>config</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ config</b></code>
			<!-- detekt Submodule -->
			<details>
				<summary><b>detekt</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ config.detekt</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/ViktorKaderabek/Streakify/blob/master/config/detekt/detekt.yml'>detekt.yml</a></b></td>
							<td style='padding: 8px;'>- The <code>detekt.yml</code> file located in the <code>config/detekt</code> directory is an essential configuration file for managing code quality within the project<br>- It governs how static code analysis is conducted using the Detekt tool, which is specifically targeted at code written in Kotlin<br>- This file defines the rules and parameters to identify, analyze, and report code issues.Mainly, it sets up the criteria for code complexity and style checks, specifies which reports are to be generated, and determines how the analysis findings are to be handled<br>- By configuring thresholds and enabling or disabling certain rules and reports, it helps maintain the codes health by enforcing coding standards and promoting readability and simplicity across the codebase<br>- This file is crucial in closing gaps in the development process by offering actionable insights for developers to improve code quality continuously.</td>
						</tr>
					</table>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square

---
