MUD Game: Builder & Prototype Patterns
Описание проекта 

Этот проект демонстрирует использование шаблонов проектирования Builder и Prototype в контексте MUD-игры (Multi-User Dungeon).

Builder используется для пошагового создания сложных объектов, таких как Dungeon.
Prototype позволяет эффективно клонировать сущности, такие как Room и NPC.
Комбинированная версия объединяет оба шаблона для более гибкого создания игровых объектов.
Структура проекта
perl
Копировать
Редактировать
MUDGame/
│── src/
│   ├── builder/           # Папка с реализацией Builder
│   │   ├── IDungeonBuilder.java
│   │   ├── SimpleDungeonBuilder.java
│   │   ├── Dungeon.java
│   ├── prototype/         # Папка с реализацией Prototype
│   │   ├── CloneableGameEntity.java
│   │   ├── Room.java
│   │   ├── NPC.java
│   ├── demo/              # Демонстрационные классы
│   │   ├── MUDBuilderDemo.java
│   │   ├── MUDPrototypeDemo.java
│   │   ├── MUDCombinedDemo.java
│── README.md              # Описание проекта
│── .gitignore             # Исключения для Git
│── pom.xml / build.gradle # Для управления зависимостями
Установка и запуск
1. Клонирование репозитория
sh
Копировать
Редактировать
git clone <URL_репозитория>
cd MUDGame
2. Компиляция и запуск
Запуск демонстрации Builder
sh
Копировать
Редактировать
javac -d out src/builder/*.java src/prototype/*.java src/demo/MUDBuilderDemo.java
java -cp out demo.MUDBuilderDemo
Запуск демонстрации Prototype
sh
Копировать
Редактировать
javac -d out src/builder/*.java src/prototype/*.java src/demo/MUDPrototypeDemo.java
java -cp out demo.MUDPrototypeDemo
Запуск комбинированной демонстрации
sh
Копировать
Редактировать
javac -d out src/builder/*.java src/prototype/*.java src/demo/MUDCombinedDemo.java
java -cp out demo.MUDCombinedDemo
Примеры вывода
MUDBuilderDemo
makefile
Копировать
Редактировать
Dungeon: Ancient Ruins
Rooms: [Entrance Hall, Throne Room]
NPCs: [Guardian]
MUDPrototypeDemo
sql
Копировать
Редактировать
Original Room: Library (Filled with old books)
Cloned Room: Library (Filled with old books)
Original NPC: Mage (Master of fire magic)
Cloned NPC: Mage (Master of fire magic)
MUDCombinedDemo
vbnet
Копировать
Редактировать
Dungeon: Dark Cave
Rooms: [Treasure Room]
NPCs: [Dragon]
Cloned Room: Treasure Room (Filled with gold)
