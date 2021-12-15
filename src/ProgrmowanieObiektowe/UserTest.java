package ProgrmowanieObiektowe;

public class UserTest {

//    public static void main(String[] args) {
//
//       User user = new User();
//        User user2 = new User("hello", "abc");
//
//        user.username = "Anka";
//        user.password = "qwerty";
//        user.sayHello();
//    }


        public static void main(String[] args) {

      // User user = new User();
        User user = new User("hello", "abc");

//        user.username = "Anka";
//        user.password = "qwerty";
            System.out.println(user.username);
            System.out.println(user.password);
        user.sayHello();
    }

}
