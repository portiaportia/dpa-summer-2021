import java.util.HashMap;

public class JukeBox {
    private HashMap<String, Song> songs;

    public JukeBox() {
        songs = new HashMap<>();
    }

    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

    public void play(String songName) {
        String songNameLower = songName.toLowerCase();
        if (songs.containsKey(songNameLower)) {
            System.out.println(songs.get(songNameLower));
        } else {
            System.out.println("Sorry " + songName + " is not in your juke box.");
        }
    }
}
