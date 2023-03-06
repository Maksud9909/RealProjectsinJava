package SimpleJavaProgramm;

import java.util.Random;

public class RollingDIce {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(124);
        System.out.println("You rolled a: " + x);


    }
}
