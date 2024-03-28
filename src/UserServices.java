//  3/22/24
//  Zack Laine
//  Assignment 3

import java.util.*;

public class UserServices {
    static User[] users;
    static boolean loginSuccess = false;
    static int attempts = 0;
    static final int MAX_ATTEMPTS = 5;
    static Scanner scanner = UserLoginApplication.scanner;

    static void login(){
        //read the stored users into an array from the file
        FileServices file = new FileServices("data.txt");
        users = file.readFile(users);

        while(attempts < MAX_ATTEMPTS && !loginSuccess) {
            User inputUser = userInput();
            for (User user : users) {
                if (inputUser.compareUser(user)) {
                    loginSuccess = true;
                    System.out.println("Welcome " + user.name);
                }
            }
            if(!loginSuccess){
                attempts++;
                System.out.println("Invalid login, please try again.");
            }
        }
        if(attempts == MAX_ATTEMPTS){
            System.out.println("Too many failed attempts, you are now locked out.");
        }
    }

    static User userInput(){
        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();

        return new User(username, password, "");
    }
}