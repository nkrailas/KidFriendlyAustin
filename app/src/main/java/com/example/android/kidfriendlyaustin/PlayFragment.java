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
        places.add(new Place(R.drawable.crux_climbing, R.string.crux, R.string.crux_info,
                R.string.crux_address, R.string.crux_phone, R.string.crux_website,
                R.string.crux_hours));
        places.add(new Place(R.drawable.peter_pan_mini_golf, R.string.peter, R.string.peter_info,
                R.string.peter_address, R.string.peter_phone, R.string.peter_website,
                R.string.peter_hours));
        places.add(new Place(R.drawable.austin_roller_rink, R.string.roller, R.string.roller_info,
                R.string.roller_address, R.string.roller_phone, R.string.roller_website,
                R.string.roller_hours));
        places.add(new Place(R.drawable.zilker_zephyr, R.string.zephyr, R.string.zephyr_info,
                R.string.zephyr_address, R.string.zephyr_phone, R.string.zephyr_website,
                R.string.zephyr_hours));

        // Create PlaceAdapter whose data source is a list of Places creates list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
