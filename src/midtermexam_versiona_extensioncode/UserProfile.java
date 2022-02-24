package midtermexam_versiona_extensioncode;

public class UserProfile 
{
    
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    //private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
    
    
}//end class