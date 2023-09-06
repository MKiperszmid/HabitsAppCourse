# Habit Tracker App

Habit tracking application written in Kotlin for Android. The application allows users to track their daily habits and receive reminders to help them stay on track. It is designed following the principles of Clean Architecture and SOLID, and it uses several important technologies and libraries to provide a robust and scalable experience.

Video Course coding and explaining the development of the app: https://www.androidavanzado.com/

Login             |  Registration
:-------------------------:|:-------------------------:
![Login Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/11e3d710-d2f3-4209-941c-7c59b0c27deb) | ![Registration Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/fc72f8ff-badd-48f4-99c6-23ba076b626f)

Home             |  Detail
:-------------------------:|:-------------------------:
![Home Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/84c02624-3043-4fd1-a889-ff82c0f62455) | ![Detail Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/a712bb7e-df63-4947-86e8-20057dd0f5d6)



## Tech Stack

- Clean Architecture: The project is structured following the Clean Architecture pattern, which facilitates separation of responsibilities and improves code maintainability.
- SOLID: The SOLID principles (Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) are applied in the design of the application to promote clean, modular, and extensible code.
- Dependency Injection - Dagger-Hilt: Dagger-Hilt is used for dependency injection, simplifying dependency management and enabling better scalability and unit testing of the code.
- Jetpack Compose: The user interface is developed using Jetpack Compose, the modern UI toolkit for Android that makes it easy to create flexible and dynamic user interfaces.
- Firebase Authentication: Firebase Authentication is integrated to provide a secure and reliable authentication system for the application's users.
- Room: Room, the Android persistence library, is used to store habit data in a local database and allow fast and efficient access to it.
- Retrofit: Retrofit is used to make calls to a remote API and retrieve habit-related data, enabling efficient and up-to-date synchronization of information.
- Notifications: The application allows users to configure custom reminders for each habit and displays notifications on specified days and times to help users follow their daily routines.
- AlarmManager: The Android AlarmManager component is used to schedule notifications and ensure they are displayed at the appropriate times.
- WorkManager: WorkManager is used to manage background tasks, allowing habits created in airplane mode to be automatically saved to the cloud once the device has an internet connection.
- Unit Test: Unit tests are included to verify the correct operation of key components of the application and ensure code quality.
- UI Test: UI tests are provided to verify that the application behaves correctly and provides a smooth user experience.
- Offline-First: The application is designed following the "Offline-First" approach, meaning that core functionality is available even when the device is offline. Data is automatically synchronized once a connection is available using WorkManager and the remote API.
- Broadcast Receivers: Broadcast Receivers are used to handle the addition of alarms when the user restarts the device and to set up the next alarm when a current alarm rings.

## How to use

- Clone the project repository from GitHub.
- Open the project in Android Studio.
- Configure Firebase Authentication in the Firebase console and add the necessary credentials to the project.
- Set up your API.
- Run the application.
