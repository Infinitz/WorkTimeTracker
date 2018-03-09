package tiko.tamk.fi.worktimetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SaveWorkTimeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_work_time_screen);

        EditText workHourEdit = (EditText) findViewById(R.id.workHourEdit);
    }
}
