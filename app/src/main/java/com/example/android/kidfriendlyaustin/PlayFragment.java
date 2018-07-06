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
        places.add(new Place(R.drawable.crux_climbing,
                getResources().getString(R.string.crux),
                getResources().getString(R.string.crux_info),
                getResources().getString(R.string.crux_address),
                getResources().getString(R.string.crux_phone),
                getResources().getString(R.string.crux_website),
                getResources().getString(R.string.crux_hours)));
        places.add(new Place(R.drawable.peter_pan_mini_golf,
                getResources().getString(R.string.peter),
                getResources().getString(R.string.peter_info),
                getResources().getString(R.string.peter_address),
                getResources().getString(R.string.peter_phone),
                getResources().getString(R.string.peter_website),
                getResources().getString(R.string.peter_hours)));
        places.add(new Place(R.drawable.austin_roller_rink,
                getResources().getString(R.string.roller),
                getResources().getString(R.string.roller_info),
                getResources().getString(R.string.roller_address),
                getResources().getString(R.string.roller_phone),
                getResources().getString(R.string.roller_website),
                getResources().getString(R.string.roller_hours)));
        places.add(new Place(R.drawable.zilker_zephyr,
                getResources().getString(R.string.zephyr),
                getResources().getString(R.string.zephyr_info),
                getResources().getString(R.string.zephyr_address),
                getResources().getString(R.string.zephyr_phone),
                getResources().getString(R.string.zephyr_website),
                getResources().getString(R.string.zephyr_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
