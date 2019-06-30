package DavidRobles.checkpoint3;

import java.util.Scanner;

public class Question
{
    private String mText;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text)
    {
        mText = text;
    }

    //Stub method - intentionally does nothing
    //only applies to True false Questions
    public boolean checkAnswer(boolean boolResponse)
    {
        return false;
    }

    //Stub method
    //only applies to fill the blank question
    public Boolean checkAnswer(String userAnswer)
    {
        return false;
    }

    //Stub method
    //only applies to Multiple Choice question
    public boolean checkAnswer(int userAnswer)
    {
        return false;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }


    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    //Stub
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        return false;
    }

    public boolean isMultipleChoice()
    {
        return true;
    }
}
