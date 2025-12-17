import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            int randomIndex = (int)(Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String selectedAnswer = answers[randomIndex];
            String selectedHint = hints[randomIndex];

            System.out.println("Riddle: " + selectedRiddle);

            //Get users answer
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(selectedAnswer)) {
                System.out.println("Correct you got it!");
                score++;
            } else {
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String getHint = sc.nextLine().toLowerCase();
                if (getHint.equals("yes")) {
                    System.out.println(selectedHint);
                }
            }

            System.out.println("Continue Playing? (yes/no)");
            String playAgain = sc.nextLine().toLowerCase();
            if(!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");

    }
}
