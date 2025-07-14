# 🌍 GeoMapper

GeoMapper is a simple Java-based mapping system that demonstrates the power of **generics**, **interfaces**, and **abstraction** through a real-world example: rendering geographic elements like **parks** and **rivers** as **points** and **lines** on a map.

This project is part of a Java Masterclass challenge and showcases how to use abstract classes, generic classes, and polymorphism in a structured and meaningful way.

---

## 📦 Features

- `Mappable` Interface for all renderable map elements
- Abstract classes: `Point` and `Line` as base for geographic elements
- Concrete classes: 
  - `Park` extends `Point`
  - `River` extends `Line`
- `Layer<T>` generic class for rendering groups of map elements
- Location parsing from Strings (e.g. `"22.234, -120.33"`) into coordinate arrays
- Neat, extendable, and clean design

---

## 🧱 Class Structure

```
Mappable (Interface)
│
├── Point (Abstract) ──> Park
│
└── Line  (Abstract) ──> River

Layer<T extends Mappable>
Main (Demo class)
```

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/GeoMapper.git
   ```

2. Compile and run the project:
   ```bash
   javac *.java
   java Main
   ```

---

## 🖨️ Sample Output

```
Render Park 1 National Park as POINT ([22.234, -1203.33])
Render Park 2 National Park as POINT ([19.234, -122.33])
Render Park 3 National Park as POINT ([21.234, -113.32])
Render River 1 National River as LINE ([[22.234, -1203.33], [22.234, -1203.33]])
Render River 2 National River as LINE ([[19.234, -122.33], [22.234, -1203.33]])
Render River 3 National River as LINE ([[21.234, -113.32], [22.234, -1203.33]])
```

---

## 🛠️ Technologies Used

- Java (OOP)
- Java Generics
- Collections (List)
- Static utility methods
- String manipulation

---

## 📚 Learning Highlights

- How to design reusable generic classes
- Proper use of interfaces and abstraction
- Real-world application of inheritance in Java

---


**Happy Mapping!**
