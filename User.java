package practice;

import java.util.*;

class User {
    String name;
    String email;
    String rol;

    public User(String name, String email, String rol) {
        this.name = name;
        this.email = email;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
class UserManager{
    List<User> users = new ArrayList<>();
    void AddUser(User user){
        users.add(user);
    }
    void RemoveUser(User user){
        users.remove(user);
    }
    void UpdateUser(User user){
        users.add(user);
    }
}
class Main{
    public static void main(String[] args) {
        User user1 = new User("Assiya", "asiya@gmail.com", "student");
        User user2 = new User("Aisha", "aisha@gmail.com", "student");
        User user3 = new User("Abdulla", "abdulla@gmail.com", "student");
        UserManager userManager = new UserManager();
        userManager.AddUser(user1);
        userManager.AddUser(user2);
        userManager.AddUser(user3);
        System.out.println("Users before delete");
        for (User u: userManager.users){
            System.out.println(u);
        }
        userManager.RemoveUser(user1);
        System.out.println("Users after delete");
        for (User u: userManager.users){
            System.out.println(u);
        }
    }
}