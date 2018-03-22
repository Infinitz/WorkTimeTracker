package tiko.tamk.fi.worktimetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class StartScreen extends AppCompatActivity {

    ArrayList<WorkTime> listItems = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        ListView listView = (ListView) findViewById(R.id.listView);

        listItems.add(new WorkTime("Title", 8, "Description"));

        adapter = new MyAdapter(this, listItems);

        listView.setAdapter(adapter);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            listItems.add(new WorkTime(
                    extras.getString("title"),
                    extras.getDouble("hours"),
                    extras.getString("description")
            ));
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case (R.id.menuAddButton):
                Intent intent = new Intent(this, AddWorkTimes.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
}
