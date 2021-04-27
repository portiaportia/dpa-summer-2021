import java.util.Random;
import java.util.Scanner;

public class MathGame {
    private static MathGame mathGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private String[] operands = new String[]{"+", "-", "*", "/"};

    private MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    public static MathGame getInstance(){
        if(mathGame == null) {
            mathGame = new MathGame();
        }

        return mathGame;
    }

    public void play() {
        while(true){
            System.out.print("(P)lay or (Q)uit: ");
            String command = reader.nextLine();

            if(command.equalsIgnoreCase("q")) break;

            if(!command.equalsIgnoreCase("p")) {
                System.out.println("Sorry, you must enter p or q");
                continue;
            }

            if(playRound()) {
                score++;
            }
        }

        System.out.println("You won " + score + " games!");
        System.out.println("Goodbye");
    }

    private boolean playRound() {
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;
        String operand = operands[rand.nextInt(operands.length)];
        double answer = getAnswer(num1, num2, operand);
        double userAnswer = getUserAnswer(num1, num2, operand);

        if(answer == userAnswer) {
            System.out.println("You got it!");
            return true;
        }

        System.out.println("The correct answer is: " + answer);
        return false;
    }

    private double getUserAnswer(int num1, int num2, String operand) {
        System.out.println("\nRound answer to 1 decimal place");
        System.out.print(num1 + " " + operand + " " + num2 + " = ");
        String userAnswer = reader.nextLine();
        return Double.parseDouble(userAnswer);
    }

    private double getAnswer(int num1, int num2, String operand) {
        double answer = 0;

        if(operand.equals("+")){
            answer = num1 + num2;
        } else if(operand.equals("-")){
            answer = num1 - num2;
        } else if(operand.equals("*")){
            answer = num1 * num2;
        } else if(operand.equals("/")){
            answer = Math.round(((double)num1 / num2) * 10) / 10.0;
        }

        return answer;
    }
}
