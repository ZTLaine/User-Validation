//  3/22/24
//  Zack Laine
//  Assignment 3

import java.util.*;

public class UserLoginApplication {
//    I stuck scanner out here to ensure it'd be able to close System.in regardless of
//    how the code might expand.  It feels clunky, what would a better way be to manage that?
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserServices.login();
        scanner.close();
    }
}
