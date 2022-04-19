public abstract class Song {
    public abstract String getTitle();

    public abstract String getAlbum();

    public abstract String getArtistFirstName();

    public abstract String getArtistLastName();

    public abstract Genre getGenre();

    public String toString() {
        String result = "";

        result += "\n" + getTitle() + "\n";
        result += "Album: " + getAlbum() + "\n";
        result += "By: " + getArtistFirstName() + " " + getArtistLastName() + "\n";
        result += "Genre: " + toTitleCase(getGenre().toString());
        return result;
    }

    private String toTitleCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
