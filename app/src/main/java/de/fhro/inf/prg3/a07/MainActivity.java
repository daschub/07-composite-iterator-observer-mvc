package de.fhro.inf.prg3.a07;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvMeals;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this will inflate the layout from res/layout/activity_main.xml
        setContentView(R.layout.activity_main);

        // add your code here
        Button btnRefresh = (Button) findViewById(R.id.btnRefresh);
        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] strings = {"I'm still hungry"};
            }
            });

        Resources resources = getResources();
        lvMeals = (ListView) findViewById(R.id.lvMeals);

        items = resources.getStringArray(R.array.mealItems);

        lvMeals.setAdapter(new ArrayAdapter<String>(
                MainActivity.this,     // context we're in; typically the activity
                R.layout.meal_entry,   // where to find the layout for each item
                items//new String[] {"Hello", "world"} // your data
        ));
    }
}
