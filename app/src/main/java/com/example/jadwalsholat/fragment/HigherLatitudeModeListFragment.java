package com.example.jadwalsholat.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.R;
import com.example.jadwalsholat.adapter.HigherLatitudeListAdapter;
import com.example.jadwalsholat.adapter.ItemListAdapter;

/**
 * This fragment let the user choose a method for higher latitudes in the settings
 */
public class HigherLatitudeModeListFragment extends AbstractItemListFragment{
    @Override
    public ItemListAdapter getAdapter(RecyclerView recyclerView) {
        return new HigherLatitudeListAdapter(recyclerView, getMainActivity());
    }

    @Override
    public int getTitleResId() {
        return R.string.higher_latitude_method;
    }
}
