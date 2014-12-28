/**
 * Created by deepak on 27/12/14.
 */
public class Whileloop {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("message will before the loop");
        while (x >5) {
            System.out.println("In the loop");
            System.out.println("Value of x :" + x);
            x= x-1;
        }

        System.out.println("message will After the loop");
    }

}