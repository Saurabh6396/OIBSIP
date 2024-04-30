package com.example.quizapp;
// Code written by Saurabh Patel
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewQuestion, textViewResult;
    private RadioGroup radioGroupOptions;
    private Button buttonSubmit;

    private String[] questions = {"What is the capital of France?", "Which planet is known as the Red Planet?",
            "Who wrote the Harry Potter series?"};
    private String[] options = {"Paris", "Rome", "Berlin", "London",
            "Venus", "Mars", "Jupiter", "Saturn",
            "J.K. Rowling", "Stephen King", "George Orwell", "J.R.R. Tolkien"};
    private int[] answers = {0, 1, 0}; // Index of correct option for each question
    private int currentQuestionIndex = 0;
    private int score = 0;
    // Code written by Saurabh Patel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewResult = findViewById(R.id.textViewResult);
        radioGroupOptions = findViewById(R.id.radioGroupOptions);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        showQuestion();
        // Code written by Saurabh Patel
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedOptionId = radioGroupOptions.getCheckedRadioButtonId();
                if (selectedOptionId == -1) {
                    Toast.makeText(MainActivity.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton selectedOption = findViewById(selectedOptionId);
                int selectedAnswerIndex = radioGroupOptions.indexOfChild(selectedOption);
                checkAnswer(selectedAnswerIndex);
            }
        });
    }
    // Code written by Saurabh Patel
    private void showQuestion() {
        textViewQuestion.setText(questions[currentQuestionIndex]);

        radioGroupOptions.removeAllViews();
        for (int i = 0; i < 4; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(options[currentQuestionIndex * 4 + i]);
            radioGroupOptions.addView(radioButton);
        }
    }
    // Code written by Saurabh Patel
    private void checkAnswer(int selectedAnswerIndex) {
        if (selectedAnswerIndex == answers[currentQuestionIndex]) {
            score++;
        }
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            showQuestion();
        } else {
            showResult();
        }
    }
    // Code written by Saurabh Patel
    private void showResult() {
        buttonSubmit.setEnabled(false);
        textViewResult.setText("Your Score: " + score + " out of " + questions.length);
    }
}
