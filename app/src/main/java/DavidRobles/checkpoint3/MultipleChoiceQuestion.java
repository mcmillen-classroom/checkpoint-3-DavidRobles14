package DavidRobles.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question
{
    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int ans)
    {
        super(text);
        mOptions = options;
        mAnswer = ans;
    }

    @Override
    public boolean checkAnswer(int userAnswer)
    {
        return (mAnswer == userAnswer);
    }

    @Override
    public boolean isMultipleChoice()
    {
        return true;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.println("1)" + mOptions[0] + " 2)" + mOptions[1] + " 3)" + mOptions[2]);
        String in = input.nextLine();
        int inresult = Integer.parseInt(in);
        boolean boolResponse;

//        if(mOptions[0].equals("pizza") && in.equals(3))
//        {
//            boolResponse = true;
//        }
//        else
//        {
//            boolResponse = false;
//        }
//        System.out.println(mAnswer);
//        System.out.println(boolResponse);
        //System.out.println(inresult + " " + mAnswer);
        return checkAnswer(inresult);

    }
}
