package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class egg_menu extends AppCompatActivity {
    ListView egg_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_menu);
        ArrayList<String> eggs =new ArrayList<>();
        eggs.add("반숙");
        eggs.add("완숙");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, eggs);
        egg_listView = (ListView) findViewById(R.id.menu);
        egg_listView.setAdapter(adapter);
    }
}