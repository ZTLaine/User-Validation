import java.io.*;
import java.util.*;

public class FileServices {
    String filename;

    FileServices(String filename){
        this.filename = filename;
    }

    User[] readFile(User[] users) {
//        creates scanner outside scope of try catch, to
//        allow it to enter finally block
        try (Scanner scanner = new Scanner(new File(filename))) {
            scanner.useDelimiter("[,\n]");

            List<User> userList = new ArrayList<>();

            //instantiates a User with the file data and adds it to a List
            while (scanner.hasNextLine()) {
                String username = scanner.next();
                String password = scanner.next();
                String name = scanner.next();

                User user = new User(username, password, name);
                userList.add(user);
            }

            //populates an array of users to return
            users = userList.toArray(userList.toArray(new User[0]));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + filename);
        }
        return users;
    }
}