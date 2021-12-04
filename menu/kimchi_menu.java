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

public class kimchi_menu extends AppCompatActivity {
    ListView kimchi_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimchi_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ArrayList<String> kimchis =new ArrayList<>();
        kimchis.add("김치 볶음밥");
        kimchis.add("김치찌개");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,kimchis);
        kimchi_listView = (ListView) findViewById(R.id.menu);
        kimchi_listView.setAdapter(adapter);

        kimchi_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), kimchi_rice.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(getApplicationContext(), kimchi_jjigae.class);
                        startActivity(intent);
                        break;
                }


            }
        });
    }
}
