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
        places.add(new Place(R.drawable.thinkery, getString(R.string.thinkery), getString(R.string.thinkery_info),
                getString(R.string.thinkery_address), getString(R.string.thinkery_phone), getString(R.string.thinkery_website),
                getString(R.string.thinkery_hours)));
        places.add(new Place(R.drawable.austin_central_library, getString(R.string.central_library),
                getString(R.string.central_info), getString(R.string.central_address), getString(R.string.central_phone),
                getString(R.string.central_website), getString(R.string.central_hours)));
        places.add(new Place(R.drawable.austin_nature_science_center, getString(R.string.ansc), getString(R.string.ansc_info),
                getString(R.string.ansc_address), getString(R.string.ansc_phone), getString(R.string.ansc_website),
                getString(R.string.ansc_hours)));
        places.add(new Place(R.drawable.lbj_wildflower_center, getString(R.string.wildflower), getString(R.string.wildflower_info),
                getString(R.string.wildflower_address), getString(R.string.wildflower_phone), getString(R.string.wildflower_website),
                getString(R.string.wildflower_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
