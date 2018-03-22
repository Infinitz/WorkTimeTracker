package tiko.tamk.fi.worktimetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        ListView listView = (ListView) findViewById(R.id.listView);

        WorkTime[] items = {
                new WorkTime("Title1", 8, "Description1"),
                new WorkTime("Title2", 8, "Description2"),
                new WorkTime("Title3", 8, "Description3"),
        };

        ArrayAdapter<WorkTime> adapter = new ArrayAdapter<WorkTime>(this,
                android.R.layout.simple_list_item_1, items);

        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
