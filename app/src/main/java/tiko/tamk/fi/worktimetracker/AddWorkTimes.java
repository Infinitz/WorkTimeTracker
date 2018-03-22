package tiko.tamk.fi.worktimetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddWorkTimes extends AppCompatActivity {

    private EditText titleEditText;
    private EditText hoursEditText;
    private EditText descriptionEditText;

    private String title;
    private Double hours;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_work_times);

        titleEditText = (EditText) findViewById(R.id.titleEditText);
        hoursEditText = (EditText) findViewById(R.id.hoursEditText);
        descriptionEditText = (EditText) findViewById(R.id.descriptionEditText);
    }

    public void saveHours(View view) {
        try {
            title = titleEditText.getText().toString();
            hours = Double.parseDouble(hoursEditText.getText().toString());
            description = descriptionEditText.getText().toString();

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
