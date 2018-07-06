package com.example.android.kidfriendlyaustin;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


// CategoryAdapter is a FragmentPagerAdapter that can provide the layout for each list item based
// on a data source which is a list of Place objects
public class CategoryAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context cContext;

    /**
     * Create a new CategoryAdapter object
     *
     * @param context         is the context of the app
     * @param fragmentManager will keep each fragment's state in the adapter across swipes
     */

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        cContext = context;
    }

    // Return the Fragment that should be displayed for the given page number

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new PlayFragment();
        } else if (position == 2) {
            return new LearnFragment();
        } else {
            return new NatureFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return cContext.getString(R.string.category_food);
        } else if (position == 1) {
            return cContext.getString(R.string.category_play);
        } else if (position == 2) {
            return cContext.getString(R.string.category_learn);
        } else {
            return cContext.getString(R.string.category_nature);
        }
    }

    // Return the total number of pages

    @Override
    public int getCount() {
        return 4;
    }
}




