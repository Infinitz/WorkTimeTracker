package tiko.tamk.fi.worktimetracker;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by risto on 22.3.2018.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<WorkTime> listItems;

    public MyAdapter(Context context, ArrayList<WorkTime> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = (View) inflater.inflate(R.layout.listview_row, null);
        }

        TextView title = (TextView) view.findViewById(R.id.titleView);
        TextView hours = (TextView) view.findViewById(R.id.hoursView);
        TextView description = (TextView) view.findViewById(R.id.descriptionView);

        NumberFormat nm = NumberFormat.getNumberInstance();

        title.setText(listItems.get(position).getTitle());
        hours.setText("Hours: " + nm.format(listItems.get(position).getHours()));
        description.setText(listItems.get(position).getDescription());

        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
