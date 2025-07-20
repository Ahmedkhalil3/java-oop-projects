# Album Playlist Manager 🎵

This is a simple Java application that manages music albums and song playlists using object-oriented principles, including inner classes.

## 💡 Features
- Create music albums with a name and artist.
- Add songs to an album with title and duration.
- Manage a playlist (`LinkedList<Song>`) by:
  - Adding a song by track number.
  - Adding a song by title.
- Ensures no duplicate songs are added.

## 🛠️ Technologies Used
- Java
- OOP Principles (Encapsulation, Composition, Inner Classes)
- Collections Framework (ArrayList, LinkedList)

## 📁 Project Structure
```
├── Album.java         // Main class with inner class SongList
├── Song.java          // Simple class representing a song
└── Main.java          // Testing functionality
```

## ✅ How It Works
Each `Album` contains a private inner class `SongList` that manages the songs internally using an `ArrayList<Song>`. This structure provides better encapsulation.

You can then build a playlist (`LinkedList<Song>`) using songs from different albums by title or track number.

## ▶️ How to Run
1. Compile all `.java` files:
   ```
   javac *.java
   ```
2. Run the `Main` class:
   ```
   java Main
   ```

## 👨‍💻 Author
Developed by Khalil as part of a Java Udemy Challenge. 🚀
