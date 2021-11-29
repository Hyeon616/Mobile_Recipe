package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class kimchi_menu extends AppCompatActivity {
    ListView kimchi_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimchi_menu);
        ArrayList<String> kimchis =new ArrayList<>();
        kimchis.add("김치 볶음밥");
        kimchis.add("김치찌개");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,kimchis);
        kimchi_listView = (ListView) findViewById(R.id.menu);
        kimchi_listView.setAdapter(adapter);
    }
}