package com.akhilamadari.andriod.thetourguideofohio;

/**
 * Created by akhilamadari on 10/25/17.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new RestaurentFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_places);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurent);
        } else {
            return mContext.getString(R.string.category_shopping);
        }
    }
}
