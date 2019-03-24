package com.example.hp.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.hp.demo.model.ProfTest;

import java.util.ArrayList;


public class ProfActivity extends AppCompatActivity {
    private EditText question1_answer;
    Button finishBtn;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;
    private RadioGroup radio_group1_question2, radio_group1_question3, radio_group1_question4, radio_group1_question5
            , radio_group2_question1, radio_group2_question2, radio_group2_question3, radio_group2_question4, radio_group2_question5;

    private RadioGroup radio_group_question2, radio_group_question3, radio_group_question4, radio_group_question5
            , radio_group_question6, radio_group_question8, radio_group_question9, radio_group_question10;

    private RadioGroup radio_group3_question1, radio_group3_question2, radio_group3_question3, radio_group3_question4
            , radio_group3_question5, radio_group4_question1, radio_group4_question2, radio_group4_question3, radio_group4_question4, radio_group4_question5;

    private RadioGroup radio_group5_question1, radio_group5_question2, radio_group5_question3, radio_group5_question4
            , radio_group5_question5, radio_group6_question1, radio_group6_question2, radio_group6_question3, radio_group6_question4, radio_group6_question5;

    private RadioGroup radio_group7_question1, radio_group7_question2, radio_group7_question3, radio_group7_question4
            , radio_group7_question5, radio_group8_question1, radio_group8_question2, radio_group8_question3, radio_group8_question4, radio_group8_question5;

    private RadioGroup radio_group9_question1, radio_group9_question2, radio_group9_question3, radio_group9_question4
            , radio_group9_question5, radio_group10_question1, radio_group10_question2, radio_group10_question3, radio_group10_question4, radio_group10_question5;

    private CheckBox question7_A, question7_B, question7_C, question7_D;
    private ArrayList<Integer> radioButtonResults;
    private ArrayList<String> editTextResults;
    private boolean[] checkBoxResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profi);




        radioButtonResults = new ArrayList<>();
        editTextResults = new ArrayList<>();
        checkBoxResults = new boolean[]{false, false, false, false};

        radio_group_question2 = (RadioGroup) findViewById(R.id.radio_group_question2);
        radio_group_question3 = (RadioGroup) findViewById(R.id.radio_group_question3);
        radio_group_question4 = (RadioGroup) findViewById(R.id.radio_group_question4);
        radio_group_question5 = (RadioGroup) findViewById(R.id.radio_group_question5);
        radio_group_question6 = (RadioGroup) findViewById(R.id.radio_group_question6);
        radio_group_question8 = (RadioGroup) findViewById(R.id.radio_group_question8);
        radio_group_question9 = (RadioGroup) findViewById(R.id.radio_group_question9);
        radio_group_question10 = (RadioGroup) findViewById(R.id.radio_group_question10);

    }

    public void finishQuiz(View view) {
        FinishThisTest();
    }

    private void FinishThisTest(){
        finishBtn = (Button) findViewById(R.id.finish_btn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfActivity.this, ProfResultActivity.class);
                startActivity(intent);
            }
        });
    }

    public void answerTwo(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {
            ProfTest.programmer +=1;
        }else if (radioButton2.isChecked()){
            ProfTest.programmer +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.biologiest +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.designer +=1;
        }else {

        }

    }

    public void answerThree(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.architecter +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.chemistriest +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.programmer +=1;
        }else {
            ProfTest.designer +=1;
        }

    }

    public void answerFour(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.chemistriest +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.architecter +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.programmer +=1;
        }else {
            ProfTest.designer +=1;
        }
    }

    public void answerFive(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.chemistriest +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.programmer +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.designer +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.architecter +=1;
        }else {
            ProfTest.phuisics +=1;
        }

    }

    public void answerSix(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.designer +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.biologiest +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.programmer +=1;
        }else {
            ProfTest.chemistriest +=1;
        }

    }

    public void answerSeven(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.chemistriest +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.biologiest +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.biologiest +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.architecter +=1;
        }else {
            ProfTest.phuisics +=1;
        }

    }

    public void answerEight(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {
            ProfTest.architecter +=1;
        }else if (radioButton2.isChecked()){
            ProfTest.architecter +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.phuisics +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.biologiest +=1;
        }else {
            ProfTest.chemistriest +=1;
        }

    }

    public void answerNine(View view) {
        radioButton1 = (RadioButton) findViewById(R.id.question_2_choiceA);
        radioButton2 = (RadioButton) findViewById(R.id.question_2_choiceB);
        radioButton3 = (RadioButton) findViewById(R.id.question_2_choiceC);
        radioButton4 = (RadioButton) findViewById(R.id.question_2_choiceD);
        radioButton5 = (RadioButton) findViewById(R.id.question_2_choiceE);
        if (radioButton1.isChecked()) {

        }else if (radioButton2.isChecked()){
            ProfTest.architecter +=1;
        }else if (radioButton3.isChecked()){
            ProfTest.designer +=1;
        }else if (radioButton4.isChecked()){
            ProfTest.architecter +=1;
        }else if (radioButton5.isChecked()){
            ProfTest.programmer +=1;
        }else {
            ProfTest.designer +=1;
        }

    }

}


