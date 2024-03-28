//  3/22/24
//  Zack Laine
//  Assignment 3

import java.util.*;

public class UserLoginApplication {
//    I stuck scanner out here to ensure it'd be able to close System.in regardless of
//    how the code might expand.  It feels clunky, what would a better way be to manage that?
//    ~~
//    Better code organization provided in review for assignment 2 will take care of this, but I have no idea if
//    this code is currently in review so I am hesitant to change a bunch atm.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserServices.login();
        scanner.close();
    }
}
