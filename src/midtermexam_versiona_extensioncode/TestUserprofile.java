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
    public static void main(String args[]){
        UserProfile a=new UserProfile();
        //Scanner input = new Scanner(System.in);
        String userName="Astronedo";
        //String userName=input.nextLine();
        a.setUserID(userName);
        a.getUserID();
        //-------------------------------------------------------------Genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Genre options: ");
        for(int i=0;i<4;i++){//4 means genres length
            System.out.println(genres[i]);
        }
        System.out.println("CHOOSE ONE: ");
        //String genre=input.nextLine();
        String genre="Comedy";
        a.setGenre(genre);
        System.out.println(a.getGenre());
        
        //--------------------------------------------------------------End Message
        System.out.println(a.getMessage());
        
    }
}
