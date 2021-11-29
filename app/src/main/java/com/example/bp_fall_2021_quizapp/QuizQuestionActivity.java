package com.example.bp_fall_2021_quizapp;
import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    // UI components here
    private TextView tvQuestion, tv_progress;
    private RadioButton tvAnswer1;
    private RadioButton tvAnswer2;
    private RadioButton tvAnswer3;
    private RadioButton tvAnswer4;
    private ProgressBar tvProgress;

    // other variables here
    ArrayList <QuestionModel> quizQuestions = new ArrayList <QuestionModel> (5);
    ArrayList <String> questions;
    int questionsTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question);

        // create arraylist of questions
        questions = new ArrayList <String> ();

        // get username intent from main activity screen


        // initialize views using findViewByID
        tvQuestion = findViewById(R.id.quizQuestion);
        tvAnswer1 = findViewById(R.id.answer1);
        tvAnswer1 = findViewById(R.id.answer2);
        tvAnswer1 = findViewById(R.id.answer3);
        tvAnswer1 = findViewById(R.id.answer4);

        // use helper method to add question content to arraylist
        questions.add("How many calories are in a watermelon?");
        questions.add("Where were french fries invented?");
        questions.add("Which famous soft drink was invented in 1892?");
        questions.add("About how many drink combinations does Starbucks have?");
        questions.add("What is the most stolen food in the world?");

        // get total number of questions
        questionsTotal = questions.size();

        // set progress bar
        tvProgress = findViewById(R.id.progress);

        // use helper method to proceed to next question

    }

    /**
     * Method that adds questions to our questions arraylist, using the Question Model constructor
     */
    private void addQuestions(){
        // question 1
        quizQuestions.add(new QuestionModel ("How many calories are in a watermelon?", "30 calories", "85 calories", "350 calories", "120 calories", 2));

        // question 2
        quizQuestions.add(new QuestionModel ("Where were french fries invented?", "Belgium", "Italy", "Spain", "USA", 1));

        // question 3
        quizQuestions.add(new QuestionModel ("Which famous soft drink was invented in 1892?", "Pepsi", "Mountain Dew", "Dr. Pepper", "Coca Cola", 4));

        // question 4
        quizQuestions.add(new QuestionModel ("About how many drink combinations does Starbucks have?", "28,000", "87,000", "92,000", "100,000", 2));

        // question 5
        quizQuestions.add(new QuestionModel ("What is the most stolen food in the world?", "Bread", "Milk", "Cheese", "Chocolate Bars", 3));
    }

    /**
     * Check the answer when user clicks submit and move on to next question
     */
    public void submitQuestion(View view){
        // if no options have been selected, prompt user to select an answer

        // use helper methods to check the answer and show the next question

    }

    /**
     * Display next question. If finished, move onto results screen
     */
    private void showNextQuestion(){

        // clear previous button selections

        // if you haven't gone through all the questions yet
            // set the question & text to the next question
            // increase question number
            // set progress bar

        // if finished with quiz, start Results activity

    }

    /**
     * Checks the answer and increases score if correct
     */
    private void checkAnswer(){
        // see which answer they picked

        // increase score if correct

    }
}