import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new album
        Album album = new Album("Hybrid Theory", "Linkin Park");

        // Add songs to album
        album.addSong("In the End", 3);
        album.addSong("Crawling", 4);
        album.addSong("Papercut", 3);

        // Try adding a duplicate (should return false)
        boolean added = album.addSong("In the End", 3);
        System.out.println("Duplicate added? " + added); // false

        // Create a playlist
        LinkedList<Song> playList = new LinkedList<>();

        // Add by title
        album.addToPlayList("Crawling", playList);

        // Add by track number
        album.addToPlayList(3, playList); // Papercut

        // Try invalid title and track number
        album.addToPlayList("Faint", playList); // doesn't exist
        album.addToPlayList(10, playList); // invalid track

        // Print playlist
        System.out.println("\n--- Playlist ---");
        for (Song song : playList) {
            System.out.println(song);
        }
    }
}
