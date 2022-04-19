import java.util.HashMap;

public class SongAdapter extends Song {
    private Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    public String getTitle() {
        return tune.getDisplayTitle().split(":")[0].trim();
    }

    public String getAlbum() {
        return tune.getDisplayTitle().split(":")[1].trim();
    }

    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0].trim();
    }

    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1].trim();
    }

    public Genre getGenre() {
        String category = tune.getCategory().toLowerCase();
        HashMap<String, Genre> genreMapping = new HashMap<>();
        genreMapping.put("country and western", Genre.COUNTRY);
        genreMapping.put("r&b and soul", Genre.HIPHOP);
        genreMapping.put("easy listening", Genre.POP);
        genreMapping.put("rock", Genre.ROCK);
        genreMapping.put("classic rock", Genre.ROCK);

        if (genreMapping.containsKey(category)) {
            return genreMapping.get(category);
        }
        return Genre.OTHER;
    }
}
