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
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to eat
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.kerbey_lane, R.string.kerbey, R.string.kerbey_info,
                R.string.kerbey_address, R.string.kerbey_phone, R.string.kerbey_website, R.string.kerbey_hours));
        places.add(new Place(R.drawable.mandolas, R.string.mandolas, R.string.mandolas_info,
                R.string.mandolas_address, R.string.mandolas_phone, R.string.mandolas_website, R.string.mandolas_hours));
        places.add(new Place(R.drawable.phils_icehouse, R.string.phils, R.string.phils_info,
                R.string.phils_address, R.string.phils_phone, R.string.phils_website, R.string.phils_hours));
        places.add(new Place(R.drawable.cherrywood, R.string.cherrywood, R.string.cherrywood_info,
                R.string.cherrywood_address, R.string.cherrywood_phone, R.string.cherrywood_website, R.string.cherrywood_hours));

        // Create PlaceAdapter whose data source is a list of Places creates list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
