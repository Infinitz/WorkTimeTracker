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
 * Used to display ListView items in StartScreen in a nice format
 *
 * @author Risto Pulkkinen
 * @version 1.0
 * @since 1.0
 */
public class MyAdapter extends BaseAdapter {

    /**
     * Parent activity context
     */
    private Context context;

    /**
     * List of items to display in the ListView in StartScreen
     */
    private ArrayList<WorkTime> listItems;

    /**
     * Constructor
     *
     * @param context context from the parent activity.
     * @param listItems list of items to display from the parent activity.
     */
    public MyAdapter(Context context, ArrayList<WorkTime> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    /**
     * Getter for size of the list.
     *
     * @return listItems size
     */
    @Override
    public int getCount() {
        return listItems.size();
    }

    /**
     * Getter for a single item in the list.
     *
     * @param position of the wanted item.
     * @return object from the list at the given position.
     */
    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    /**
     * Supposedly returns objects ID from given position, but it isn't used or functioning.
     *
     * @param position position of the wanted item
     * @return 0, because it isn't used.
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Formats a single ListView item according to linked xml file
     *
     * @param position position of the wanted item.
     * @param view current view.
     * @param parent parent of the view
     * @return view for the item in the ListView.
     */
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

    /**
     * This isn't used either, but needed override for the parent class.
     *
     * @return empty CharSequence.
     */
    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
