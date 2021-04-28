public class Oldie  implements Tune{
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    public String getArtistName(){
        return artistName;
    }

    public String getDisplayTitle(){
        return songTitle + ": " + recordTitle;
    }

    public String getCategory(){
        return category;
    }
}
