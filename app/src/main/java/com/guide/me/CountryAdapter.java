package com.guide.me;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CountryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CountryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new Cairo();
        else if (position == 1)
            return new Luxor();
        else if (position == 2)
            return new Alex();
        else
            return new Giza();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cairo_catogry);
        } else if (position == 1) {
            return mContext.getString(R.string.luxor_catogry);
        } else if (position == 2) {
            return mContext.getString(R.string.alex_catogry);
        } else {
            return mContext.getString(R.string.giza_catogry);
        }
    }
}
