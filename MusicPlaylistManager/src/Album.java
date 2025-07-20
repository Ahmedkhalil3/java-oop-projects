import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
        this.songs = songList.songs;
    }

    public boolean addSong(String title, double duration) {
        return songList.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song song = songList.findSong(trackNumber);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = songList.findSong(title);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }

    private static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song s) {
            Song song = findSong(s.getTitle());
            if (song == null) {
                this.songs.add(s);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}
