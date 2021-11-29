package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class dumpling_menu extends AppCompatActivity {
    ListView dumpling_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumpling_menu);
        ArrayList<String> dumplings =new ArrayList<>();
        dumplings.add("굽기");
        dumplings.add("찌기");
        dumplings.add("에어프라이어");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,dumplings);
        dumpling_list = (ListView) findViewById(R.id.menu);
        dumpling_list.setAdapter(adapter);
    }
}