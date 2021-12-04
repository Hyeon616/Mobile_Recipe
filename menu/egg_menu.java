package com.example.recipe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class egg_menu extends AppCompatActivity {
    ListView egg_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ArrayList<String> eggs =new ArrayList<>();
        eggs.add("반숙");
        eggs.add("완숙");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, eggs);
        egg_listView = (ListView) findViewById(R.id.menu);
        egg_listView.setAdapter(adapter);

        egg_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), hard_boiled.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(getApplicationContext(), half_boiled.class);
                        startActivity(intent);
                        break;

                }


            }
        });
    }
}
