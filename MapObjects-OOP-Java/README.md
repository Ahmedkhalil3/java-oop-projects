# MapObjects-OOP-Java

This Java project models real-world map entities like **buildings** and **utility lines** using advanced **Object-Oriented Programming (OOP)** concepts. It was inspired by a challenge from the Tim Buchalka Java Masterclass course on Udemy.

## 🧩 Overview
The application defines a shared interface `Mappable` that is implemented by different map entities. Each entity defines how it should appear on a map using its label, marker type, and geometry (point, line, polygon). The objects are then serialized into a JSON-like format suitable for map rendering.

## 🛠 Features
- `Mappable` interface with:
  - Abstract methods: `getLabel()`, `getShape()`, `getMarker()`
  - Default method: `toJSON()`
  - Static method: `mapIt()` to print out a formatted representation
- Classes:
  - `Building` with `UsageType` (e.g. Government, Entertainment)
  - `UtilityLine` with `UtilityType` (e.g. Electrical, Fiber Optic)
- Enums:
  - `Geometry` — POINT, LINE, POLYGON
  - `Color`, `PointMarkers`, `LineMarkers`
- Polymorphic list of `Mappable` objects displayed in uniform format

## 🔍 Sample Output
```
"properties": {"type": POINT, "label": Sydney Opera House (ENTERTAINMENT), "marker": GREEN TRIANGLE, "name": Sydney Opera House, "usage": ENTERTAINMENT}
"properties": {"type": LINE, "label": College St (ELECTRICAL), "marker": RED DASHED, "name": College St, "type": ELECTRICAL}
```

## 🎯 Concepts Practiced
- Interfaces & default/static methods
- Enums and switch expressions
- Overriding and polymorphism
- Encapsulation and clean design

## 🚀 How to Run
1. Clone the repo or download the source files.
2. Compile and run the `Main.java` file.
3. Output will show JSON-like representations of all mapped objects.

---

**Made with 💻 and ☕ by Ahmed**
