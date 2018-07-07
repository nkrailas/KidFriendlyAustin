package com.example.android.kidfriendlyaustin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * PlaceAdapter is an ArrayAdapter that provide the layout for each list item based on a data
 * source, which is a list of Place objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new PlaceAdapter object
     *
     * @param context Current context that the PlaceAdapter is being created in
     * @param places  List of Place objects to be displayed
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        // Get the Place object location at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item_layout with the @id place_image
        ImageView image = listItemView.findViewById(R.id.place_image);
        image.setImageResource(currentPlace.getPlaceImage());

        // Find the TextView in the list_item_layout with the @id name_text_view
        TextView name = listItemView.findViewById(R.id.name_text_view);
        name.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item_layout with the @id info_text_view
        TextView info = listItemView.findViewById(R.id.info_text_view);
        info.setText(currentPlace.getPlaceInfo());

        // Find the TextView in the list_item_layout with the @id address_text_view
        TextView address = listItemView.findViewById(R.id.address_text_view);
        address.setText(currentPlace.getPlaceAddress());

        // Find the TextView in the list_item_layout with the @id phone_text_view
        TextView phone = listItemView.findViewById(R.id.phone_text_view);
        phone.setText(currentPlace.getPlacePhone());

        // Find the TextView in the list_item_layout with the @id website_text_view
        TextView website = listItemView.findViewById(R.id.website_text_view);
        website.setText(currentPlace.getPlaceWebsite());

        // Return the entire list_item_layout (containing 1 ImageView and 6 TextViews) in ListView
        return listItemView;
    }
}

