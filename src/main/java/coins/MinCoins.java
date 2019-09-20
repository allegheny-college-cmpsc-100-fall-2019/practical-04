package gatorcash;

/** This class gives the gator as few coins as possible.
 *
 * @author Douglas Luman
 */
public class MinCoins {
  
  /** This is program's the entry point.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    /* 
     * Accept 1 argument as a double, turn it into an integer;
     * multiply by 100 to get the value in cents, rather than
     * dollars. Currency being base 10 is wonderful.
     */
    int inputValue;
    int totalCents;
    inputValue = totalCents = (int)(Double.parseDouble(args[0]) * 100);
    /*
    /*
     * Because we only care about the coins, remove the amount
     * of dollar bills required.
     */
    int dollars = totalCents / 100;
    totalCents -= dollars * 100;
    /*
     * "Initialize," or "create" the variable which will hold the
     * number of coins required at any given step.
     */
    int totalCoins = 0;
    // Calculate the number of coins per type; use quarters as an example.
    int quarters = totalCents / 25;
    totalCents -= quarters * 25;
    totalCoins += quarters;
    // TODO Print the number of coins in a formatted list.
  }
}