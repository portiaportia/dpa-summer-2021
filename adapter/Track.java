public class Track implements Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
    private String description;

    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public String getArtistFirstName(){
        return firstName;
    }

    public String getArtistLastName(){
        return lastName;
    }

    public Genre getGenre(){
        return genre;
    }
}
