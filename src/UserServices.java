import java.util.*;

public class UserServices {
    static User[] users;

    static void login(){
        //read the stored users into an array from the file
        FileServices file = new FileServices("data.txt");
        users = file.readFile(users);

        User inputUser = userInput();
        inputUser.userContent();
//        for(User user : users){
//
//        }
    }

    static User userInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();

        scanner.close();
        return new User(username, password, "");

    }
}