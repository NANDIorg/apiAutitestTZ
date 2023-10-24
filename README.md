# API-автотесты
![junit](https://img.shields.io/maven-central/v/junit/junit?versionSuffix=4.13.2&label=Junit) ![rest assured](https://img.shields.io/maven-central/v/io.rest-assured/rest-assured?versionSuffix=5.3.2&label=Rest%20Assured) ![Allure](https://img.shields.io/maven-central/v/io.qameta.allure/allure-junit4?versionSuffix=2.23.0&label=Allure) JDK 17
___
Написать API - автотесты для сайта [https://petstore.swagger.io/](https://petstore.swagger.io/) по одному методу из любых блоков (GET,PUT,POST,DELETE). Ожидаем выполнение данной задачи со следующим стеком технологий:

1.  Java
2.  Junit
3.  Maven
4.  Rest Assured
5.  Allure
## Структура проекта
**src/test/java/org/nandi/ApiTest.java** - Основной файл с тестами

**src/test/java/org/nandi/ResponsCreateUser.java** - Класс-ответ от некоторых запросов

**src/test/java/org/nandi/UserData.java** - Класс с данными пользователя

**allure-results** - папка в которой сохраняются отчёты Allure

## Запуск проекта
Для запуска тестирования, в консоли прописываем
```
mvn install
```
После запуска установятся все используемые библиотеки, и выполнятся тесты
