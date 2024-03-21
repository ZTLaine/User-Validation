public class User {
    String username;
    String password;
    String name;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    User(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }

    void userContent(){
        System.out.println("username: " + this.username);
        System.out.println("password: " + this.password);
        System.out.println("name: " + this.name);
    }

    boolean compareUser(User user1, User user2){
        return user1.username.equalsIgnoreCase(user2.username) &&
                user1.password.equals(user2.password);
    }
}
