package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//  이미지를 배열에 넣음
    int [] ImageTop = {R.drawable.fridge_top_open, R.drawable.fridge_top_close};
    int [] ImageBottom = {R.drawable.fridge_bottom_open, R.drawable.fridge_bottom_close};

    ImageView top;
    ImageView bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        냉장고
        top = (ImageView) findViewById(R.id.fridge_top);
        bottom = (ImageView) findViewById(R.id.fridge_bottom);

        // 이미지를 폴더에 있는 이미지로 셋팅
        top.setImageResource(R.drawable.fridge_top_close);
        bottom.setImageResource(R.drawable.fridge_bottom_close);

        top.setOnClickListener(new MyListener());
        bottom.setOnClickListener(new MyListener());

    }
    class MyListener implements View.OnClickListener {

        int i = 0;
        int j = 0;

        int lengthTop = ImageTop.length;
        int lengthBottom = ImageBottom.length;


        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.fridge_top){
                top.setImageResource(ImageTop[i]);
                i+=1;
                if(i == ImageTop.length) i = 0;

            } else if (view.getId() == R.id.fridge_bottom){
                bottom.setImageResource(ImageBottom[j]);
                j+=1;
                if(j == ImageBottom.length) j = 0;
            }


        }


    }

}