package driver;
import main.BalancingBrackets;
public class Driver {
	 public static void main(String[] args) {
	        String input = "([[]])";
	        BalancingBrackets driver = new BalancingBrackets(input);
	        driver.checkBalance();
	    }

}
