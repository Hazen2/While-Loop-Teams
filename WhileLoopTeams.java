import javax.swing.JOptionPane;

/**
 * This program will calculate how many teams are possible with a given number of players.
 * Input will be verified with the while loop.
 */

public class WhileLoopTeams
{
  public static void main(String[] args)
  {
    final int MAX_PLAYERS = 15;   // The maximum amount of players on the team.
    final int MIN_PLAYERS = 9;   // The minimum amount of players on the team.
    int TOTAL_PLAYERS;   // The total amount of players entered.
    int PLAYERS_ENTERED; // The number of players the user entered.
    int NUMBER_TEAMS;    // The total number of teams possible from the entered data.
    String keyboardInput;   // Input from the JOptionPane.
    
    
    // Prompt the user for the amount of players on each team.    
    keyboardInput = JOptionPane.showInputDialog("Enter the number of players on each team.");
    
    // Convert input to integer variable.
    PLAYERS_ENTERED = Integer.parseInt(keyboardInput);
    
    // Validate number of players entered.
    while (PLAYERS_ENTERED < MIN_PLAYERS || PLAYERS_ENTERED > MAX_PLAYERS)
    {
      // Remind user that the number of players per team must fall between 9 and 15.
      JOptionPane.showMessageDialog(null, "The number of players must be between 9 and 15.");
      keyboardInput = JOptionPane.showInputDialog("Please enter the number of players on each team.");           
      
      // Convert keyboard input to int.
      PLAYERS_ENTERED = Integer.parseInt(keyboardInput);      
    }
    
    // System.out.println(PLAYERS_ENTERED);     // Verifying PLAYERS_ENTERED.
    
    // Prompt the user for the total number of players.0        
    keyboardInput = JOptionPane.showInputDialog("Enter the total number of players.");
    
    // Save total number of players to INT.
    TOTAL_PLAYERS = Integer.parseInt(keyboardInput);
    
    // System.out.println(TOTAL_PLAYERS);    // Verifying TOTAL_PLAYERS.
    
    // Calculate how many teams are possible with the entered data.
    NUMBER_TEAMS = TOTAL_PLAYERS / PLAYERS_ENTERED;
    
    // Display the results.
    JOptionPane.showMessageDialog(null, "With " + PLAYERS_ENTERED + " players a team, " +
                                  "and " + TOTAL_PLAYERS + " total players, there are enough " +
                                  "players to create " + NUMBER_TEAMS + " teams.");
    
    System.exit(0);
  }
  
}

