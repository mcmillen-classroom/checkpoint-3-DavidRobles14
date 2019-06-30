package DavidRobles.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{
    //This is where the app starts
    public static void main(String[] args)
    {
        String[] mMCOptions1 = {"Pizza", "Tacos", "Laptop"};
        String[] mMCOptions2 = {"Falcon", "Dog", "Cat"};


        Question[] questions = new Question[5];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe Never");
        questions[3] = new MultipleChoiceQuestion("What is not Food?", mMCOptions1, 3);
        questions[4] = new MultipleChoiceQuestion("Which animal can fly?", mMCOptions2, 1);

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");


        while(index < questions.length)
        {
            System.out.println(questions[index].getText());

            if(questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are incorrect!");
            }


            index++;
        }

    }


}
