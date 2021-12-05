### Дисциплина : Технологии разработки программного обеспечения

### Силин Дмитрий Вячеславович группа МАС2131

### Цель : знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов)


### Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных

* #####  Убедится, в наличие зависимостей
    * maven
    * docker
```
docker -v

Docker version 20.10.11, build dea9396e18
```

```
mvn -v

Apache Maven 3.8.3 (NON_CANONICAL)
Maven home: /opt/maven
Java version: 11.0.13, vendor: Oracle Corporation, runtime: /usr/lib/jvm/java-11-openjdk
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.10.82-1-lts", arch: "amd64", family: "unix"
```

* ##### Клонирование репозитория:
```
git clone https://github.com/PliskinSnake/badbugtracker.git
```

## Необходимо настроить и подключить базу данных
* * *
```
docker run --name postgres_for_bug -e POSTGRES_PASSWORD=1 -d postgres
```
#### Также в файлах pom.xml и applications.properties изменить ip адрес на локальный адрес компьютера 

***

* ##### Установка проекта
```
sh init.sh
```

### У проекта 4 контроллера
* Bug Controller
* Developer Controller
* Host Controller
* Report Controller
# Host controller
* ##### получить hostname
```
curl http://localhost:8080/host/hostname
```
* ##### получить ip address
```
curl http://localhost:8080/host/ip
```
# Bug controller
* список всех багов
```
curl http://localhost:8080/bug/list
```
* для форматированого вывода 
```
curl http://localhost:8080/bug/list | python -m json.tool
```
* удаление записи
```
curl -XDELETE http://localhost:8080/bug/delete/1
```
* создание записи
```
curl -XPUT 'http://localhost:8080/bug/update' \
--header 'Content-Type: application/json' \
-d '{
  "title" : "test bug",
  "description" : "test description of the bug",
  "dateOfCreation" : "1991-10-25T21:00:00.000+00:00"
}'
```
* если в запросе указать id то будет изменение записи
```
curl -XPUT 'http://localhost:8080/bug/update' \
--header 'Content-Type: application/json' \
-d '{
  "id": 101,
  "title": "test_changed",
  "description": "test_changed",
  "dateOfCreation": "1992-10-25T21:00:00.000+00:00",
  "developer_id": {
    "id": 1,
    "firstName": "Giff",
    "secondName": "Darby",
    "email": "gdarby0@mapy.cz"
  },
  "status": {
    "name": "new",
    "description": "new bug"
  },
  "urgency": {
    "name": "blocker",
    "description": "crash"
  }
}
```
# Developer controller
* список всех разработчиков
```
curl http://localhost:8080/developer/list
```
* для форматированого вывода 
```
curl http://localhost:8080/developer/list | python -m json.tool
```
* удаление записи
```
curl -XDELETE http://localhost:8080/developer/delete/1
```
* создание записи
```
curl -XPOST 'http://localhost:8080/developer/create' \
--header 'Content-Type: application/json' \
-d '{
  "email": "testdeveloper@test.com",
  "firstName": "Ivan",
  "secondName": "Ivanych"
}'
```

* получение записи по email
```
curl http://localhost:8080/developer/testdeveloper@test.com 
```

* изменение записи
```
curl -XPUT 'http://localhost:8080/developer/update' \
--header 'Content-Type: application/json' \
-d '{
  "id": 5,
  "firstName": "big test",
  "secondName": "big test name",
  "email": "test@test.com"
}'
```

# Report controller
* список всех отчетов
```
curl http://localhost:8080/report/list
```





































