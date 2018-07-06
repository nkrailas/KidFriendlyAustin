package com.example.android.kidfriendlyaustin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A Fragment that displays a list of places to eat
 */
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to play
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.crux_climbing, getString(R.string.crux), getString(R.string.crux_info),
                getString(R.string.crux_address), getString(R.string.crux_phone), getString(R.string.crux_website),
                getString(R.string.crux_hours)));
        places.add(new Place(R.drawable.peter_pan_mini_golf, getString(R.string.peter), getString(R.string.peter_info),
                getString(R.string.peter_address), getString(R.string.peter_phone), getString(R.string.peter_website),
                getString(R.string.peter_hours)));
        places.add(new Place(R.drawable.austin_roller_rink, getString(R.string.roller), getString(R.string.roller_info),
                getString(R.string.roller_address), getString(R.string.roller_phone), getString(R.string.roller_website),
                getString(R.string.roller_hours)));
        places.add(new Place(R.drawable.zilker_zephyr, getString(R.string.zephyr), getString(R.string.zephyr_info),
                getString(R.string.zephyr_address), getString(R.string.zephyr_phone), getString(R.string.zephyr_website),
                getString(R.string.zephyr_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
