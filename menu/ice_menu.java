package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ice_menu extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_menu);

        ArrayList<String> ices =new ArrayList<>();
        ices.add("하이볼");
        ices.add("블루 사파이어");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,ices);
        listView = (ListView) findViewById(R.id.menu);
        listView.setAdapter(adapter);

    }
}