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

public class meat_menu extends AppCompatActivity {
    ListView meat_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ArrayList<String> meats =new ArrayList<>();
        meats.add("돼지 불백");
        meats.add("수육");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,meats);
        meat_listView = (ListView) findViewById(R.id.menu);
        meat_listView.setAdapter(adapter);

        meat_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), meat_bowl.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(getApplicationContext(), suyuk.class);
                        startActivity(intent);
                        break;
                }


            }
        });
    }
}
