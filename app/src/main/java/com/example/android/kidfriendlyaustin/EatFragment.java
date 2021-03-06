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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to eat
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.kerbey_logo,
                getString(R.string.kerbey),
                getString(R.string.kerbey_info),
                getString(R.string.kerbey_address),
                getString(R.string.kerbey_phone),
                getString(R.string.kerbey_website)));
        places.add(new Place(R.drawable.mandolas_logo,
                getString(R.string.mandolas),
                getString(R.string.mandolas_info),
                getString(R.string.mandolas_address),
                getString(R.string.mandolas_phone),
                getString(R.string.mandolas_website)));
        places.add(new Place(R.drawable.phils_logo,
                getString(R.string.phils),
                getString(R.string.phils_info),
                getString(R.string.phils_address),
                getString(R.string.phils_phone),
                getString(R.string.phils_website)));
        places.add(new Place(R.drawable.cherrywood_logo,
                getString(R.string.cherrywood),
                getString(R.string.cherrywood_info),
                getString(R.string.cherrywood_address),
                getString(R.string.cherrywood_phone),
                getString(R.string.cherrywood_website)));
        places.add(new Place(R.drawable.wfm_logo,
                getString(R.string.wholefoods),
                getString(R.string.wholefoods_info),
                getString(R.string.wholefoods_address),
                getString(R.string.wholefoods_phone),
                getString(R.string.wholefoods_website)));
        places.add(new Place(R.drawable.lick,
                getString(R.string.lick),
                getString(R.string.lick_info),
                getString(R.string.lick_address),
                getString(R.string.lick_phone),
                getString(R.string.lick_website)));

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
 * Kerbey Lane (https://twitter.com/kerbeylanecafe)
 * Mandola's Italian (http://www.iacctexas.com/happy-hour-mandolas-italian/)
 * Phil's Icehouse (https://onelink.quickgifts.com/merchant/phils-ice-house/)
 * Cherrywood Coffeehouse (https://www.pinterest.com/pin/101964379038438752/?lp=true)
 * Whole Foods Market (https://patch.com/texas/downtownaustin/fda-raps-austin-based-whole-foods-markets-food-safety-violations)
 * Lick Honest Ice Creams (https://patch.com/texas/downtownaustin/fda-raps-austin-based-whole-foods-markets-food-safety-violations)
 */

