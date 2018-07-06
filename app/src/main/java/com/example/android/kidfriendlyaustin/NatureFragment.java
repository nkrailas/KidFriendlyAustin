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
public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to eat
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.south_congress_bridge_bats, getString(R.string.bats), getString(R.string.bats_info),
                getString(R.string.bats_address), getString(R.string.bats_phone), getString(R.string.bats_website),
                getString(R.string.bats_hours)));
        places.add(new Place(R.drawable.zilker_botanical_garden, getString(R.string.botanical),
                getString(R.string.botanical_info), getString(R.string.botanical_address), getString(R.string.botanical_phone),
                getString(R.string.botanical_website), getString(R.string.botanical_hours)));
        places.add(new Place(R.drawable.barton_springs_pool, getString(R.string.barton), getString(R.string.barton_info),
                getString(R.string.barton_address), getString(R.string.barton_phone), getString(R.string.barton_website),
                getString(R.string.barton_hours)));
        places.add(new Place(R.drawable.rowing_dock_atx, getString(R.string.dock_atx), getString(R.string.dock_atx_info),
                getString(R.string.dock_atx_address), getString(R.string.dock_atx_phone), getString(R.string.dock_atx_website),
                getString(R.string.dock_atx_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
