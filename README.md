# Task Manager (Java)

A small command-line task manager I wrote while learning Java and object-oriented programming. You can add tasks, list them, mark them as done and delete them from a text menu.

```
===== MAIN MENU =====
1. Add Task
2. View All Tasks
3. Mark Task as Completed
4. Delete Task
5. Exit Program
=====================
```

## What it covers

- Classes and encapsulation: `Task` holds the data, `TaskManager` handles the list, and `Main` handles the user interaction
- `ArrayList` for storing tasks, with an auto-incremented ID for each task
- Input validation, so typing a letter where a number is expected asks again instead of crashing
- Java 17 features such as switch expressions (`case 1 -> ...`)

Tasks are kept in memory only, so they are lost when the program closes.

## Running it

Requires JDK 17 or newer.

```bash
git clone https://github.com/yavuzkrm/task-manager-java.git
cd task-manager-java
javac -d out src/*.java
java -cp out Main
```

## Project structure

```
src/
├── Main.java          # menu and user input
├── Task.java          # task model (id, description, completed)
└── TaskManager.java   # add / list / complete / delete
```

## License

MIT
