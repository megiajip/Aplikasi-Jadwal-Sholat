package com.example.jadwalsholat.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.R;
import com.example.jadwalsholat.adapter.ItemListAdapter;
import com.example.jadwalsholat.adapter.JumuahDelayListAdapter;

/**
 * This fragment let the user choose a delay for first call of Jumu'ah in the settings
 */
public class JumuahDelayListFragment extends AbstractItemListFragment{
    @Override
    public ItemListAdapter getAdapter(RecyclerView recyclerView) {
        return new JumuahDelayListAdapter(recyclerView, getMainActivity());
    }

    @Override
    public int getTitleResId() {
        return R.string.jumuah_first_call;
    }
}
