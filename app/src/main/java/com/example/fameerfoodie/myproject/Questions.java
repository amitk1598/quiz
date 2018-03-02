package com.example.fameerfoodie.myproject;

/**
 * Created by fameer foodie on 02-03-2018.
 */

public class Questions {
    public String mQuestions[] ={"which is the first planet in solar system",

            "which is the 2nd planet in solar system",
            "which is the 3rd planet in solar system",
            "which is the 4th planet in solar system",
            "which is the 5th planet in solar system",
            "which is the 6th planet in solar system",
            "which is the 7th planet in solar system",

    };

    private String mChoices[] [] = {
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},
            {"merucry","venus","mars","saturn"},

    };

private String mCorrectAnswer[] = {"murcury","venus","earth","jupiter","sturn","neptune"};

public String getQuestion(int a){
    String question = mQuestions[a];
    return question;

}
public String getChoice1(int a){

    String choice = mChoices[a][0];
    return choice;


}
    public String getChoice2(int a){

        String choice = mChoices[a][1];
        return choice;


    }
    public String getChoice3(int a){

        String choice = mChoices[a][2];
        return choice;


    }
    public String getChoice4(int a){

        String choice = mChoices[a][3];
        return choice;


    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}


