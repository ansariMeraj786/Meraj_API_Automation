package tests;

import org.testng.annotations.Test;

public class FirstQuestion {

    @Test
    public void Sum() {
        System.out.println("Added numbers.");
        int x = 100;
        int y = 200;
        int x+y = 300;
        System.out.println("Do addition");
        int z = x + y;
        System.out.println(z);
        System.out.println("Check result");

        System.out.println("Pass");
    }
}