package tiko.tamk.fi.worktimetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Simple activity for adding new work times.
 *
 * @author Risto Pulkkinen
 * @version 1.0
 * @since 1.0
 */

public class AddWorkTimes extends AppCompatActivity {

    /**
     * EditText field for the WorkTime title.
     */
    private EditText titleEditText;

    /**
     * EditText field for the WorkTime hours.
     */
    private EditText hoursEditText;

    /**
     * EditText field for the WorkTime description.
     */
    private EditText descriptionEditText;

    /**
     * Initializes the activity and EditText's.
     *
     * @param savedInstanceState is a reference to a Bundle object that is passed into the onCreate
     *                           method of every Android Activiy.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_work_times);

        titleEditText = (EditText) findViewById(R.id.titleEditText);
        hoursEditText = (EditText) findViewById(R.id.hoursEditText);
        descriptionEditText = (EditText) findViewById(R.id.descriptionEditText);
    }

    /**
     * Sends all of the information in the EditText fields to the StartScreen activity for display.
     *
     * @param view Activity view.
     */
    public void saveHours(View view) {
        try {
            String title = titleEditText.getText().toString();
            Double hours = Double.parseDouble(hoursEditText.getText().toString());
            String description = descriptionEditText.getText().toString();

            Intent intent = new Intent(this, StartScreen.class);
            intent.putExtra("title", title);
            intent.putExtra("hours", hours);
            intent.putExtra("description", description);
            startActivity(intent);
        } catch (NumberFormatException|NullPointerException e) {
            e.printStackTrace();
            Toast.makeText(this, "Please give values to all fields", Toast.LENGTH_SHORT).show();
        }
    }
}
