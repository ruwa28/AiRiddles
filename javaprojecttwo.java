package airiddles;
import java.util.Scanner;
public class javaprojecttwo {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;

	        // Define an array of riddles and their corresponding answers.
	        String[] riddles = {
	            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
	            "The more you take, the more you leave behind. What am I?",
	            "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?"
	        };

	        String[] answers = {
	            "An echo",
	            "Footsteps",
	            "A fire"
	        };

	        // Define hints for each riddle.
	        String[] hints = {
	            "Hint: This thing is known for its ability to reflect sound.",
	            "Hint: Think about what you leave behind when you walk.",
	            "Hint: It produces heat and light."
	        };

	        int numRiddles = riddles.length;

	        while (true) {
	            int randomIndex = (int) (Math.random() * numRiddles);
	            String selectedRiddle = riddles[randomIndex];
	            String correctAnswer = answers[randomIndex];
	            String hint = hints[randomIndex];

	            boolean answeredCorrectly = false;

	            System.out.println("\nRiddle: " + selectedRiddle);

	            while (!answeredCorrectly) {
	                System.out.print("Your answer: ");
	                String userAnswer = scanner.nextLine();

	                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
	                    System.out.println("✅ Correct!");
	                    score++;
	                    answeredCorrectly = true;
	                } else {
	                    System.out.println("❌ Wrong! Would you like a hint? (yes/no)");
	                    String giveHint = scanner.nextLine().toLowerCase();
	                    if (giveHint.equals("yes")) {
	                        System.out.println(hint);
	                    }

	                    // Ask if they want to skip or try again
	                    System.out.println("Do you want to try again or skip? (try/skip)");
	                    String choice = scanner.nextLine().toLowerCase();
	                    if (choice.equals("skip")) {
	                        answeredCorrectly = true; // exit loop and move to next riddle
	                    }
	                }
	            }

	            // Ask to continue
	            System.out.println("\nContinue playing? (yes/no)");
	            String playAgain = scanner.nextLine().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        }

	        

	        // Display final score.
	    System.out.println("Your final score: " + score);
	        System.out.println("Thanks for playing!");
	    }
	
}

