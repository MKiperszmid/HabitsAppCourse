# Habit Tracker App

Este proyecto es una aplicación de seguimiento de hábitos escrita en Kotlin para Android. La aplicación permite a los usuarios realizar un seguimiento de sus hábitos diarios y recibir recordatorios para ayudarles a mantenerse en el buen camino. Está diseñada siguiendo los principios de Clean Architecture y SOLID, y utiliza varias tecnologías y bibliotecas importantes para proporcionar una experiencia robusta y escalable.


La desarrollamos en el siguiente curso: https://www.androidavanzado.com/

Login             |  Registration
:-------------------------:|:-------------------------:
![Login Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/11e3d710-d2f3-4209-941c-7c59b0c27deb) | ![Registration Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/fc72f8ff-badd-48f4-99c6-23ba076b626f)

Home             |  Detail
:-------------------------:|:-------------------------:
![Home Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/84c02624-3043-4fd1-a889-ff82c0f62455) | ![Detail Screen](https://github.com/MKiperszmid/HabitsAppCourse/assets/16141845/a712bb7e-df63-4947-86e8-20057dd0f5d6)



## Características principales

- Clean Architecture: El proyecto está estructurado siguiendo el patrón de Clean Architecture, lo que facilita la separación de responsabilidades y mejora la mantenibilidad del código.
- SOLID: Los principios SOLID (Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) se aplican en el diseño de la aplicación para promover un código limpio, modular y extensible.
- Inyección de Dependencias - Dagger-Hilt: Se utiliza Dagger-Hilt para realizar la inyección de dependencias, lo que simplifica la gestión de las dependencias y permite una mejor escalabilidad y prueba unitaria del código.
- Jetpack Compose: La interfaz de usuario se desarrolla utilizando Jetpack Compose, el moderno toolkit de UI de Android que facilita la creación de interfaces de usuario flexibles y dinámicas.
- Firebase Authentication: Se integra Firebase Authentication para proporcionar un sistema de autenticación seguro y confiable para los usuarios de la aplicación.
- Room: Se utiliza Room, la biblioteca de persistencia de Android, para almacenar los datos de los hábitos en una base de datos local y permitir un acceso rápido y eficiente a ellos.
- Retrofit: Se utiliza Retrofit para realizar las llamadas a una API remota y obtener datos relacionados con los hábitos, lo que permite una sincronización eficiente y actualizada de la información.
- Notificaciones: La aplicación permite configurar recordatorios personalizados para cada hábito y muestra notificaciones en los días y horas especificados para ayudar a los usuarios a seguir sus rutinas diarias.
- AlarmManager: El componente AlarmManager de Android se utiliza para programar las notificaciones y garantizar que se muestren en los momentos adecuados.
- WorkManager: Se utiliza WorkManager para gestionar las tareas en segundo plano, lo que permite que los hábitos creados en modo avión se guarden automáticamente en la nube una vez que el dispositivo tenga conexión a Internet.
- Unit Test: Se incluyen pruebas unitarias para verificar el correcto funcionamiento de los componentes clave de la aplicación y garantizar la calidad del código.
- UI Test: Se proporcionan pruebas de interfaz de usuario para verificar que la aplicación se comporte correctamente y proporcione una experiencia de usuario fluida.
- Offline-First: La aplicación está diseñada siguiendo el enfoque "Offline-First", lo que significa que la funcionalidad principal está disponible incluso cuando el dispositivo está sin conexión a Internet. Los datos se sincronizan automáticamente una vez que la conexión está disponible utilizando WorkManager y la API remota.
- Broadcast Receivers: Se utilizan Broadcast Receivers para gestionar el agregado de alarmas cuando el usuario reinicia el dispositivo, y cuando suena una alarma, para configurar la siguiente.

## Uso

- Clona el repositorio del proyecto desde GitHub.
- Abre el proyecto en Android Studio.
- Configura Firebase Authentication en la consola de Firebase y agrega las credenciales necesarias en el proyecto.
- Configura tu API.
- Ejecuta la aplicación.
