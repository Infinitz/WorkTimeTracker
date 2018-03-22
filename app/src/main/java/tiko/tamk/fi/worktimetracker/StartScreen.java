package tiko.tamk.fi.worktimetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Start screen for the working time hours application.
 * User can browse past hours and add new ones in here.
 *
 * @author Risto Pulkkinen
 * @version 1.0
 * @since 1.0
 */

public class StartScreen extends AppCompatActivity {

    /**
     * listItems contains all the WorkTime items displayed in this activity.
     */
    ArrayList<WorkTime> listItems = new ArrayList<>();

    /**
     * adapter contains an instance of MyAdapter which is used to work with ListView.
     */
    MyAdapter adapter;

    /**
     * onCreate initializes the activity and keeps track of the ListView.
     *
     * @param savedInstanceState is a reference to a Bundle object that is passed into the onCreate
     *                           method of every Android Activiy.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        ListView listView = (ListView) findViewById(R.id.listView);

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

    /**
     * Initializes the action bar button which adds new hours.
     *
     * @param menu menu resource is inflated into this.
     * @return boolean of true for the menu to be dispalyed
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    /**
     * Starts new activity for adding new working hours when menu item is clicked.
     *
     * @param item A single menu item contained in action bar menu.
     * @return true if the menu item was clicked, false if not.
     */
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
