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
public class LearnFragment extends Fragment {

    public LearnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to eat
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.thinkery,
                getResources().getString(R.string.thinkery),
                getResources().getString(R.string.thinkery_info),
                getResources().getString(R.string.thinkery_address),
                getResources().getString(R.string.thinkery_phone),
                getResources().getString(R.string.thinkery_website),
                getResources().getString(R.string.thinkery_hours)));
        places.add(new Place(R.drawable.austin_central_library,
                getResources().getString(R.string.central_library),
                getResources().getString(R.string.central_info),
                getResources().getString(R.string.central_address),
                getResources().getString(R.string.central_phone),
                getResources().getString(R.string.central_website),
                getResources().getString(R.string.central_hours)));
        places.add(new Place(R.drawable.austin_nature_science_center,
                getResources().getString(R.string.ansc),
                getResources().getString(R.string.ansc_info),
                getResources().getString(R.string.ansc_address),
                getResources().getString(R.string.ansc_phone),
                getResources().getString(R.string.ansc_website),
                getResources().getString(R.string.ansc_hours)));
        places.add(new Place(R.drawable.lbj_wildflower_center,
                getResources().getString(R.string.wildflower),
                getResources().getString(R.string.wildflower_info),
                getResources().getString(R.string.wildflower_address),
                getResources().getString(R.string.wildflower_phone),
                getResources().getString(R.string.wildflower_website),
                getResources().getString(R.string.wildflower_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
