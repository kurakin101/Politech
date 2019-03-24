package com.example.hp.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.hp.demo.model.ProfTest.phuisics;
import static com.example.hp.demo.model.ProfTest.programmer;

public class ProfResultActivity extends AppCompatActivity {

    private TextView professionResult;
    private Button nextBtb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_result);

        professionResult = (TextView) findViewById(R.id.professionResult);
        nextBtb = (Button) findViewById(R.id.btn_main);
        nextBtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if (programmer == 1){
            professionResult.setText("Прораммист");
        }else if (programmer == 2){
            professionResult.setText("Прораммист");
        }else if (programmer == 3 | phuisics == 1){
            professionResult.setText("Инженер");
        }else {

        }

    }
}
