## <img src="https://github.com/ioomoon/QA-guru-homework-mobile/blob/master/img/icon2.png?raw=true" width="25">  Примеры UI автотестов для Android приложения Wikipedia

<img src="https://github.com/ioomoon/QA-guru-homework-mobile/blob/master/img/wikipedia.jpg?raw=true" width="500">

## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon5.png?raw=true" width="25"> Автоматизированны тест-кейсы:
- Отображение результатов поиска 'BrowserStack'
- Поиск осуществляется на английском языке 
- Проверка текста начальных страниц (для запуска на эмуляторе или реальном устройстве)

### Стек технологий:
![](img/Intelij_IDEA.png)
![](img/Java.png)
![](img/Gradle.png)
![](img/JUnit5.png)
![](img/Appium.png)
![](img/Selenide.png)
![](img/Selenoid.png)
![](img/Allure_Report.png)
![](img/allureTestOps.png)
![](img/Browserstack.png)
![](img/Github.png)
![](img/Jenkins.png)
![](img/Rest-Assured.png)
<img src="https://github.com/ioomoon/QA-guru-homework-mobile/blob/master/img/androidstudio.png?raw=true" width="40">

## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon4.png?raw=true" width="25"> Запуск проекта:
- для запуска проектов локально необходимо создать файлы: browserstack_config.properties, emulation_config.properties, real_config.properties и определить в них параметры конфигурации

Локально для запуска всех тестов:
```bash
gradle clean test
```
Локально для запуска тестов только на browserstack/на эмуляторе/на реальном устройстве:
```bash
gradle clean browserstack / emulation / real
```

- для удаленного запуска воспользуйтесь [Jenkins](https://jenkins.autotests.cloud/job/009-ioomoon-unit20/):

> Вы можете запускать тесты, настроив следующие параметры:
>> * ENVIRONMENT (default TEST)
>> * COMMENT (комментарий для уведомления в telegram)


## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon6.png?raw=true" width="25"> Отчеты в Allure Report
![](img/allure1.png)
![](img/allure2.png)
![](img/allure3.png)

## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon6.png?raw=true" width="25"> Интеграция тестов c тест-менеджмент системой Allure TestOps
![](img/allure_testOps.png)
![](img/allure_testOps2.png)

## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon1.png?raw=true" width="25"> Интеграция тестов c таск-трекер системой Jira
![](img/jira.png)

## <img src="https://github.com/ioomoon/QA-guru-graduation/blob/master/img/icon1.png?raw=true" width="25"> Telegram-уведомления о прохождении тестов
![](img/notification.png)