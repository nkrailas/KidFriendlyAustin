package com.example.android.kidfriendlyaustin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A Fragment that displays a list of places to play
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
        places.add(new Place(R.drawable.crux_poster,
                getString(R.string.crux),
                getString(R.string.crux_info),
                getString(R.string.crux_address),
                getString(R.string.crux_phone),
                getString(R.string.crux_website)));
        places.add(new Place(R.drawable.peter_pan,
                getString(R.string.peter),
                getString(R.string.peter_info),
                getString(R.string.peter_address),
                getString(R.string.peter_phone),
                getString(R.string.peter_website)));
        places.add(new Place(R.drawable.austin_roller,
                getString(R.string.roller),
                getString(R.string.roller_info),
                getString(R.string.roller_address),
                getString(R.string.roller_phone),
                getString(R.string.roller_website)));
        places.add(new Place(R.drawable.zephyr_logo,
                getString(R.string.zephyr),
                getString(R.string.zephyr_info),
                getString(R.string.zephyr_address),
                getString(R.string.zephyr_phone),
                getString(R.string.zephyr_website)));
        places.add(new Place(R.drawable.barton_springs,
                getString(R.string.barton),
                getString(R.string.barton_info),
                getString(R.string.barton_address),
                getString(R.string.barton_phone),
                getString(R.string.barton_website)));
        places.add(new Place(R.drawable.rowing_logo,
                getString(R.string.dock_atx),
                getString(R.string.dock_atx_info),
                getString(R.string.dock_atx_address),
                getString(R.string.dock_atx_phone),
                getString(R.string.dock_atx_website)));

        // Create PlaceAdapter whose data source is a list of Places to create list items for each place
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the Activity which is @id list_item_view in list_item_view.xml
        ListView listView = rootView.findViewById(R.id.list_item_view);

        // The ListView uses the PlaceAdapter to display list items for each Place in the list
        listView.setAdapter(adapter);

        return rootView;
    }

}

/**
 * Photo credits:
 * Crux Climbing Center (http://batchcreative.com/)
 * Peter Pan's Mini Golf (https://www.facebook.com/PeterPanMiniGolf/)
 * Austin Roller Rink (https://www.facebook.com/AustinRollerRink/)
 * Zilker Zephyr Miniature Train (https://foursquare.com/v/zilker-zephyr/4ba64144f964a5208e3f39e3)
 * Barton Springs Pool (https://www.yelp.com/biz/barton-springs-pool-austin?osq=ride&start=60)
 * Rowing Dock ATX (https://twitter.com/rowingdock)
 */

