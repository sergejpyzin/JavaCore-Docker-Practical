## Урок 1. Компиляция и интерпретация кода

1. ### Создать приложение с вложенностью пакетов не менее 3х, где будет класс для входа и несколько классов с логикой. 

##### Решение:
        Приложение с внесением заметки во внешний файл
        с фиксацией даты и времени создания заметки
    
### Скомпилируйте и запустите посредством CLI

##### Решение:
        команда для компиляции:
            - javac -sourcepath .\src -d out src/ru/serjeypyzin/practicaltaskwithoutcontainer/sample/Main.java
        команда для запуска:
            - java -classpath .\out ru.serjeypyzin.practicaltaskwithoutcontainer.sample.Main

2. ### Создать два Docker-образа. Один должен компилировать Java-проект обратно в папку на компьютере пользователя, а второй забирать скомпилированные классы и исполнять их. Пример листинга для docker-compose приведен в презентации семинара

##### Решение:
        Для правильной работы приложениия в Docker-container было создано 
    отдельное приложение с фиксированным путем к файлу заметок(EXTERNAL_PATH_FILE)
        файл для создания контейнера:
            - docker-comopose-compile.yaml
        команда для создания контейнера:
            - docker compose -f docker-compose-compile.yaml up 

        файл для запуска приложения в контейнере:
            - docker-compose-run.yaml
        команда для запуска приложения:
            - docker compose -f docker-compose-run.yaml run app 
