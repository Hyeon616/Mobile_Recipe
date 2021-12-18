package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class kimchi_rice extends AppCompatActivity {

    // 타이머 선언
    Button startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimchi_rice);

        // 타이머 액티비티 버튼 id 설정
        startTime =(Button) findViewById(R.id.startTimer);

        // 버튼누르면 타이머 실행
        startTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

    }



}