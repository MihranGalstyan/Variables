/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Var {
    public static void main(final String[] args) {
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;

        System.out.println("Distance is " + distance);

        byte a = 10;
        int b = a;

        a = (byte) b;

        System.out.println(a);
    }
}
