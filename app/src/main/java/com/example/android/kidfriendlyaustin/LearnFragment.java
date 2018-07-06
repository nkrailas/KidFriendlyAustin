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
        places.add(new Place(R.drawable.thinkery, R.string.thinkery, R.string.thinkery_info,
                R.string.thinkery_address, R.string.thinkery_phone, R.string.thinkery_website,
                R.string.thinkery_hours));
        places.add(new Place(R.drawable.austin_central_library, R.string.central_library,
                R.string.central_info, R.string.central_address, R.string.central_phone,
                R.string.central_website, R.string.central_hours));
        places.add(new Place(R.drawable.austin_nature_science_center, R.string.ansc,
                R.string.ansc_info, R.string.ansc_address, R.string.ansc_phone, R.string.ansc_website,
                R.string.ansc_hours));
        places.add(new Place(R.drawable.lbj_wildflower_center, R.string.wildflower,
                R.string.wildflower_info, R.string.wildflower_address, R.string.wildflower_phone,
                R.string.wildflower_website, R.string.wildflower_hours));

        // Create PlaceAdapter whose data source is a list of Places creates list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
