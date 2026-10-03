# Jetpack Compose Learning

A modern Android application showcasing Jetpack Compose UI, Navigation, and Clean Architecture modular design principles.

---

## 📱 Features

- **Modules Dashboard**: A responsive 2-column grid created with `LazyVerticalGrid` showcasing available learning modules.
- **Basic Layout Module**: A dedicated screen module (`BasicLayoutWidget`) displaying a basic layout interface with gesture click navigation.
- **Image View Screen**: A nested sub-screen (`ImageViewScreen`) navigated directly from the Basic Layout Screen via tap gestures.
- **Hello World Module**: A dedicated screen module showcasing an interactive Hello World UI with back navigation.
- **Modular Navigation**: Built using Jetpack Navigation Compose with route management.

---

## 🏗️ Architecture & Project Structure

The project follows a clean, feature-based package hierarchy for scalability and code segregation:

```
com.example.jetpackcomposelearning
├── MainActivity.kt                       # App entry point displaying GridViewScreen
├── model
│   └── ModuleItem.kt                     # Data model for module grid cards
├── navigation
│   └── NavRoutes.kt                      # Centralized navigation route constants
├── modules                               # Feature modules
│   ├── buildingBasicLayout
│   │   ├── BasicLayoutScreen.kt          # Basic Layout UI module (BasicLayoutWidget)
│   │   └── ImageViewScreen.kt            # Image View UI screen (Navigated from BasicLayoutWidget)
│   └── helloworld
│       └── HelloWorldScreen.kt           # Hello World UI module
└── ui
    ├── grid
    │   ├── GridViewScreen.kt             # Main Grid Dashboard & NavHost container
    │   └── components
    │       └── GridModuleCard.kt         # Reusable card UI component for grid items
    └── theme
        ├── Color.kt                      # Color definitions
        ├── Theme.kt                      # MaterialTheme setup
        └── Type.kt                       # Typography definitions
```

---

## 🛠️ Tech Stack & Dependencies

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose (Material 3)
- **Navigation**: Navigation Compose (`androidx.navigation:navigation-compose`)
- **Build System**: Gradle with Version Catalogs (`libs.versions.toml`)
- **Compatibility**: Android SDK 24 (Min) to SDK 37 (Target)

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Open the project in **Android Studio**.
3. Let Gradle sync automatically.
4. Run the app on an Android Emulator or connected physical device (`Run > Run 'app'`).
