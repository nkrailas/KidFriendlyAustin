package com.example.android.kidfriendlyaustin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A Fragment that displays a list of places to shop
 */
public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item_view, container, false);

        // Create a list of places to shop
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.bookpeople,
                getString(R.string.bookpeople),
                getString(R.string.bookpeople_info),
                getString(R.string.bookpeople_address),
                getString(R.string.bookpeople_phone),
                getString(R.string.bookpeople_website)));
        places.add(new Place(R.drawable.toyjoy_sign,
                getString(R.string.toyjoy),
                getString(R.string.toyjoy_info),
                getString(R.string.toyjoy_address),
                getString(R.string.toyjoy_phone),
                getString(R.string.toyjoy_website)));
        places.add(new Place(R.drawable.terratoys,
                getString(R.string.terra),
                getString(R.string.terra_info),
                getString(R.string.terra_address),
                getString(R.string.terra_phone),
                getString(R.string.terra_website)));
        places.add(new Place(R.drawable.lions,
                getString(R.string.lions),
                getString(R.string.lions_info),
                getString(R.string.lions_address),
                getString(R.string.lions_phone),
                getString(R.string.lions_website)));
        places.add(new Place(R.drawable.whole_earth,
                getString(R.string.whole_earth),
                getString(R.string.whole_earth_info),
                getString(R.string.whole_earth_address),
                getString(R.string.whole_earth_phone),
                getString(R.string.whole_earth_website)));
        places.add(new Place(R.drawable.kidtokid,
                getString(R.string.kidtokid),
                getString(R.string.kidtokid_info),
                getString(R.string.kidtokid_address),
                getString(R.string.kidtokid_phone),
                getString(R.string.kidtokid_website)));

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
 * BookPeople (https://www.brandsoftheworld.com/logo/book-people-of-austin)
 * Toy Joy (https://www.yelp.com/biz/toy-joy-austin)
 * Terra Toys (https://www.facebook.com/terratoys/)
 * Lions & Tigers & Toys (http://www.toystoreaustintx.com/)
 * Whole Earth Provisions (https://www.locally.com/store/67228/whole-earth-provision-co)
 * Kid To Kid (https://www.entrepreneur.com/franchises/kidtokid/282496)
 */

