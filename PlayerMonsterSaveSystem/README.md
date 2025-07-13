# PlayerMonsterSaveSystem

A simple Java project demonstrating how to implement a save/load mechanism using interfaces, with `Player` and `Monster` classes that persist their data via the `ISaveable` interface.

## 💡 Overview

This project simulates saving and restoring game characters using a custom interface `ISaveable`. It includes two entities:

- `Player` (with name, hitPoints, strength, and weapon)
- `Monster` (with name, hitPoints, and strength)

Both implement the `ISaveable` interface to:
- Serialize their state to a `List<String>`
- Restore their state from a `List<String>`

## 📁 Project Structure

```
PlayerMonsterSaveSystem/
├── ISaveable.java
├── Player.java
├── Monster.java
└── TestMain.java
```

## 🔧 ISaveable Interface

```java
public interface ISaveable {
    List<String> write();
    void read(List<String> savedData);
}
```

## 🧪 Example Output

```
Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
Saved Data: [Tim, 10, 15, Sword]
After reset: Player{name='Unknown', hitPoints=0, strength=0, weapon='Stick'}
After reading saved data: Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
```

## 📚 Concepts Covered

- Interfaces and polymorphism
- Encapsulation and data hiding
- Object serialization using `List<String>`
- Clean OOP design principles

## 🚀 How to Run

1. Clone the repo
2. Compile with `javac *.java`
3. Run `TestMain`

```bash
javac *.java
java TestMain
```

## 🧠 Author

Built by Ahmed Khalil as part of an OOP learning journey.
