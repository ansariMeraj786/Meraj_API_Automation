
import org.testng.annotations.Test;

public class FirstQuestion {

    @Test
    public void Sum() {
        System.out.println("Added numbers.");
        int x = 300;
        int y = 200;
        int x+y = 500;
        System.out.println("Do addition");
        int z = x + y;
        System.out.println(z);
        System.out.println("Check result");
    }
}