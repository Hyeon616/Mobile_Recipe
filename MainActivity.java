package com.example.recipe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //  이미지를 배열에 넣음
    int[] ImageTop = {R.drawable.fridge_top_open, R.drawable.fridge_top_close};
    int[] ImageBottom = {R.drawable.fridge_bottom_open, R.drawable.fridge_bottom_close};

    ImageView top;
    ImageView bottom;
    ImageButton meat;
    ImageButton egg;
    ImageButton kimchi;
    ImageButton dumpling;
    ImageButton ice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        냉장고
        top = (ImageView) findViewById(R.id.fridge_top);
        bottom = (ImageView) findViewById(R.id.fridge_bottom);
        meat = (ImageButton) findViewById(R.id.meat);
        egg = (ImageButton) findViewById(R.id.egg);
        kimchi = (ImageButton) findViewById(R.id.kimchi);
        dumpling = (ImageButton) findViewById(R.id.dumpling);
        ice = (ImageButton) findViewById(R.id.ice);

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
            if (view.getId() == R.id.fridge_top) {
                top.setImageResource(ImageTop[i]);
                if(i==0){
                    dumpling.setVisibility(View.VISIBLE);               //문열때 재료버튼
                    ice.setVisibility(View.VISIBLE);
                } else if (i==1) {
                    dumpling.setVisibility(View.GONE);
                    ice.setVisibility(View.GONE);
                }
                i += 1;
                if (i == ImageTop.length) i = 0;

            } else if (view.getId() == R.id.fridge_bottom) {
                bottom.setImageResource(ImageBottom[j]);
                if(j==0){
                    meat.setVisibility(View.VISIBLE);               //문열때 재료버튼
                    egg.setVisibility(View.VISIBLE);
                    kimchi.setVisibility(View.VISIBLE);
                } else if (j==1) {
                    meat.setVisibility(View.GONE);
                    egg.setVisibility(View.GONE);
                    kimchi.setVisibility(View.GONE);
                }
                j += 1;
                if (j == ImageBottom.length) j = 0;
            }


        }


    }

}