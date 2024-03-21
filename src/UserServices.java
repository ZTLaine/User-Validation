public class UserServices {
    static User[] users;

    static void login(){
        FileServices file = new FileServices("data.txt");
        users = file.readFile(users);
    }
}