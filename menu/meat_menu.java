package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class meat_menu extends AppCompatActivity {
    ListView meat_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_menu);
        ArrayList<String> meats =new ArrayList<>();
        meats.add("돼지 불백");
        meats.add("수육");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,meats);
        meat_listView = (ListView) findViewById(R.id.menu);
        meat_listView.setAdapter(adapter);
    }
}