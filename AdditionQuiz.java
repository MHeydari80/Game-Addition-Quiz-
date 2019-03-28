package additionquiz;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int nom1, nom2, entery, multiplier = 10, counter = 0, score = 0;

        while (true) {

            if (counter == 10) {

                multiplier *= 10;
                counter = 0;

            }

            nom1 = (int) (Math.random() * multiplier);
            nom2 = (int) (Math.random() * multiplier);

            System.out.printf("%d + %d is equal to \t", nom1, nom2);

            entery = input.nextInt();

            if (nom1 + nom2 == entery) {

                System.out.println("well done!");
                counter++;
                score++;

            } else {

                System.out.println("You lost!");
                System.out.printf("You score is %d (You've answered %d questions correctly!) ", score,score);
                break;
            }

        }

    }

}
