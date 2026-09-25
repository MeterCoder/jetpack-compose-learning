# Jetpack Compose Learning

A modern Android application showcasing Jetpack Compose UI, Navigation, and Clean Architecture modular design principles.

---

## 📱 Features

- **Modules Dashboard**: A responsive 2-column grid created with `LazyVerticalGrid` showcasing available learning modules.
- **Hello Module**: A dedicated screen module displaying a custom greeting interface with back navigation.
- **Hello World Module**: A dedicated screen module showcasing an interactive Hello World UI with back navigation.
- **Modular Navigation**: Built using Jetpack Navigation Compose with type-safe route management.

---

## 🏗️ Architecture & Project Structure

The project follows a clean, feature-based package hierarchy for scalability and code segregation:

```
com.example.jetpackcomposelearning
├── MainActivity.kt                       # App entry point displaying GridViewScreen
├── model
│   └── ModuleItem.kt                     # Data model for module grid cards
├── navigation
│   └── NavRoutes.kt                      # Centralized navigation route definitions
├── modules                               # Feature modules
│   ├── hello
│   │   └── HelloScreen.kt                # Hello Screen UI module
│   └── helloworld
│       └── HelloWorldScreen.kt           # Hello World UI module
└── ui
    └── grid
        ├── GridViewScreen.kt             # Main Grid Dashboard & NavHost container
        └── components
            └── GridModuleCard.kt         # Reusable card UI component for grid items
```

---

## 🛠️ Tech Stack & Dependencies

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose (Material 3)
- **Navigation**: Navigation Compose
- **Build System**: Gradle with Version Catalogs (`libs.versions.toml`)
- **Compatibility**: Android SDK 24 (Min) to SDK 35+ (Target)

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Open the project in **Android Studio** (Ladybug / Jellyfish or newer).
3. Let Gradle sync automatically.
4. Run the app on an Android Emulator or connected device (`Run > Run 'app'`).
  