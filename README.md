# Food Order Processing System - Design Pattern Assignment

This project demonstrates four design patterns in a single scenario:

- Strategy Pattern for selecting payment methods
- Decorator Pattern for adding item customizations
- Factory Pattern for creating payment strategies and order processors
- Template Method Pattern for defining the order processing workflow

## Run Instructions

From the project root:

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out com.fariya.order.app.Main
```

For Windows PowerShell:

```powershell
Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object { $_.FullName } > sources.txt
javac -d out @sources.txt
java -cp out com.fariya.order.app.Main
```
