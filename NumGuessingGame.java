
import javax.swing.*;

class NumGuessingGame {
    public static void main(String[] args) {
        int computeNumber = (int) (Math.random() * 100 + 1);
        int userInput = 0;
        int attempts = 1;

        try {
            while (userInput != computeNumber || attempts <= 5) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userInput = Integer.parseInt(response);
                if (attempts > 5)
                    JOptionPane.showMessageDialog(null, "OOPs !! Maximum attempts are over !!");
                else {
                    JOptionPane.showMessageDialog(null, " " + guess(userInput, computeNumber, attempts));
                    attempts++;
                }
            }
        } catch (Exception e) {

        }
    }

    public static String guess(int userInput, int computeNumber, int attempts) {
        if (userInput == computeNumber)
            return "Yeahhhh!, Your Guessed the number right. You Win the Game!";
        else if (userInput > 100)
            return "Invalid Number";
        else if (userInput < computeNumber)
            return "Your Guessed the number too low....";
        else if (userInput > computeNumber)
            return "Your Guessed the number too high....";
        else
            return null;
    }
}