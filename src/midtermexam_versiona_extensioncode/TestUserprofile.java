/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

//import java.util.Scanner;

/**
 *
 * @author astro
 */
public class TestUserprofile {
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
    public static void main(String args[]){
        UserProfile a=new UserProfile();
        //Scanner input = new Scanner(System.in);
        String userName="Astronedo";
        //String userName=input.nextLine();
        a.setUserID(userName);
        a.getUserID();
        //-------------------------------------------------------------Genre
        System.out.println(a.getGenres());
        //String genre=input.nextLine();
        String genre="Comedy";
        a.setGenre(genre);
        
    }
}
