package Objects;

public class UserTest {
    public static void main(String[] args) {

        User user = new User();  // 'user' is my INSTANCE
        user.setFirstName("Ridvan");
        user.setLastName("Ceko");


     //   System.out.println(user.firstName);

      //  user.output(); //for assigning int number I must use int parameter
        //so my output( int parameter)

        //since i want to use return type so I can assign and call with String
//        String message = user.output();
//        System.out.println(message);

        System.out.println(user.getFirstName() + " " + user.getLastName());



    }
}
