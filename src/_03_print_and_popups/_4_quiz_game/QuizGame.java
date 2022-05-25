package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String FirstQuestion = JOptionPane.showInputDialog("What is 2+2?");
		// 2. Ask the user a question

		// 3. Use an if statement to check if their answer is correct
		if (FirstQuestion.equals("4")) {
			JOptionPane.showMessageDialog(null, "Correct! Nice Work!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, your answer was incorrect.");
			score -=1;
		}
		// 4. if the user's answer was correct, add one to their score
		FirstQuestion =JOptionPane.showInputDialog("What color is the sky?");
		if (FirstQuestion.equals("blue")) {
			JOptionPane.showMessageDialog(null, "Correct! Nice Work!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, your answer was incorrect.");
			score -=1;
		}
		
		FirstQuestion =JOptionPane.showInputDialog("How many days are in a year?");
		if (FirstQuestion.equals("365")) {
			JOptionPane.showMessageDialog(null, "Correct! Nice Work!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, your answer was incorrect.");
			score -=1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer

		// After all the questions have been asked, tell the user their final score
		JOptionPane.showMessageDialog(null, "Your total points is "+score+"");

	}
}
