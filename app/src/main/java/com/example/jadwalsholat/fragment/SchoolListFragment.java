package com.example.jadwalsholat.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.R;
import com.example.jadwalsholat.adapter.ItemListAdapter;
import com.example.jadwalsholat.adapter.SchoolListAdapter;

/**
 * This fragment let the user choose a school for asr in the settings
 */
public class SchoolListFragment extends AbstractItemListFragment{
    @Override
    public ItemListAdapter getAdapter(RecyclerView recyclerView) {
        return new SchoolListAdapter(recyclerView, getMainActivity());
    }

    @Override
    public int getTitleResId() {
        return R.string.asr_juristic_method;
    }
}