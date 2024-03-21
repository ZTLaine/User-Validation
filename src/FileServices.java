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
        Scanner scanner = null;
        try {
            System.out.println("Current working directory: " + System.getProperty("user.dir"));
            scanner = new Scanner(new File(filename));
            scanner.useDelimiter(",");

            List<User> userList = new ArrayList<>();

            //instantiates a User with the file data and adds it to a List
            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
                String username = scanner.next();
                String password = scanner.next();
                String name = scanner.next();

                User user = new User(username, password, name);
                user.userContent();
                System.out.println("~*~");
                userList.add(user);
            }

            //populates an array of users to return
            users = userList.toArray(userList.toArray(new User[0]));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally{
            if(scanner != null){
                scanner.close();
            }
        }
        return users;
    }
}