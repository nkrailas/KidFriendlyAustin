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
        places.add(new Place(R.drawable.south_congress_bridge_bats,
                getResources().getString(R.string.bats),
                getResources().getString(R.string.bats_info),
                getResources().getString(R.string.bats_address),
                getResources().getString(R.string.bats_phone),
                getResources().getString(R.string.bats_website),
                getResources().getString(R.string.bats_hours)));
        places.add(new Place(R.drawable.zilker_botanical_garden,
                getResources().getString(R.string.botanical),
                getResources().getString(R.string.botanical_info),
                getResources().getString(R.string.botanical_address),
                getResources().getString(R.string.botanical_phone),
                getResources().getString(R.string.botanical_website),
                getResources().getString(R.string.botanical_hours)));
        places.add(new Place(R.drawable.barton_springs_pool,
                getResources().getString(R.string.barton),
                getResources().getString(R.string.barton_info),
                getResources().getString(R.string.barton_address),
                getResources().getString(R.string.barton_phone),
                getResources().getString(R.string.barton_website),
                getResources().getString(R.string.barton_hours)));
        places.add(new Place(R.drawable.rowing_dock_atx,
                getResources().getString(R.string.dock_atx),
                getResources().getString(R.string.dock_atx_info),
                getResources().getString(R.string.dock_atx_address),
                getResources().getString(R.string.dock_atx_phone),
                getResources().getString(R.string.dock_atx_website),
                getResources().getString(R.string.dock_atx_hours)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
