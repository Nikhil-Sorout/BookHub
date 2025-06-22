# BookHub 📚 – Modular Android Book Store App

**BookHub** is a modern, modular Android application that demonstrates advanced Android development best practices including **MVI architecture**, **Clean Architecture**, **Jetpack Compose UI**, and **scalable dependency management**.

---

## 🔧 Tech Stack

- **Kotlin 2.0** + **Jetpack Compose** (declarative UI)
- **Model-View-Intent (MVI)** Architecture
- **Clean Architecture** with modular layers
- **Retrofit** – API integration and safe network calls
- **Hilt** – Dependency injection framework
- **Room** – Local persistence (if integrated)
- **Coil** – Async image loading
- **Kotlin Flow** – Reactive programming
- **KSP (Kotlin Symbol Processing)** – Fast compile-time annotation processing
- **TOML** – Centralized dependency management

---

## 📁 Modular Architecture

The codebase is split into 3 core modules for clarity and scalability:

- **Data Module**: Handles API calls and local storage responsibilities.
- **Domain Module**: Business logic, use cases, and domain models.
- **Presentation Module**: Compose UI, ViewModels, and user interaction handling.

---

## ✨ Project Highlights

- ✅ **MVI Architecture** for predictable, unidirectional state management.
- ✅ **Clean Architecture** to enforce separation of concerns and scalability.
- ✅ **Retrofit-based API** with safe error handling utilities.
- ✅ **Hilt for DI**, ensuring testability and modular injection.
- ✅ **Image loading** with **Coil**, including a shared image picker with permission handling.
- ✅ **Reactive data flow** using **Kotlin Flow** and coroutines.
- ✅ **TOML**-based centralized dependency versioning.
- ✅ Uses **KSP** over KAPT for improved build performance and reduced annotation overhead.

---