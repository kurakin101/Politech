package com.example.hp.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hp.demo.model.ProfTest;

import static com.example.hp.demo.model.ProfTest.architecter;
import static com.example.hp.demo.model.ProfTest.biologiest;
import static com.example.hp.demo.model.ProfTest.chemistriest;
import static com.example.hp.demo.model.ProfTest.designer;
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

        if (programmer >= phuisics | programmer >= biologiest | programmer >= chemistriest | programmer >= designer |
                programmer >= architecter){
            professionResult.setText("Прораммист");
            ProfTest.profStatus += "Прораммист";
        }else if (phuisics >= programmer | phuisics >= biologiest | phuisics >= chemistriest | phuisics >= designer |
                phuisics >= architecter){
            professionResult.setText("Физик");
            ProfTest.profStatus += "Физик";
        }else if (biologiest >= phuisics | biologiest >= programmer | biologiest >= chemistriest | biologiest >= designer |
                biologiest >= architecter){
            professionResult.setText("Биолог");
            ProfTest.profStatus += "Биолог";
        }else if (architecter >= phuisics | architecter >= programmer | architecter >= chemistriest | architecter >= designer |
                architecter >= biologiest){
            professionResult.setText("Архитектор");
            ProfTest.profStatus += "Архитектор";
        }else if (designer >= phuisics | designer >= programmer | designer >= chemistriest | designer >= biologiest |
                designer >= architecter){
            professionResult.setText("Дизайнер");
            ProfTest.profStatus += "Дизайнер";
        }else if (chemistriest >= phuisics | chemistriest >= programmer | chemistriest >= biologiest | chemistriest >= designer |
                chemistriest >= architecter){
            professionResult.setText("Химик");
            ProfTest.profStatus += "Химик";
        }else {

        }

    }
}


