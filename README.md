# Jetpack Compose Learning

A modern, production-grade Android application showcasing Jetpack Compose UI, Navigation, and Clean Architecture modular design principles.

---

## 📱 Modules & Demos

### 1. Modules Dashboard
- A responsive 2-column grid built using `LazyVerticalGrid`.
- Dynamic module cards routing to individual learning features.

| Dashboard Grid View |
| :---: |
| *(Add screenshot in `docs/media/dashboard.png`)* |

---

### 2. Building Basic Layout & Image View Screen
- **`BasicLayoutWidget`**: Demonstrates layout components and gesture detection (`Modifier.clickable`).
- **`ImageViewScreen`**: Sub-screen navigated seamlessly on tap gestures.

| Basic Layout Screen | Image View Screen |
| :---: | :---: |
| *(Add screenshot in `docs/media/basic_layout.png`)* | *(Add screenshot in `docs/media/image_view.png`)* |

---

### 3. Hello World Module
- Showcases custom text styling and TopAppBar back navigation.

| Hello World Screen |
| :---: |
| *(Add screenshot in `docs/media/hello_world.png`)* |

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
