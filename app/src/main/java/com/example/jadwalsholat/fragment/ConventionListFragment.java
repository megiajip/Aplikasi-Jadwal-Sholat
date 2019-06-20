package com.example.jadwalsholat.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.R;
import com.example.jadwalsholat.adapter.ConventionListAdapter;
import com.example.jadwalsholat.adapter.ItemListAdapter;
import com.example.jadwalsholat.utils.PrayerTimesUtils;

/**
 * This fragment let the user choose a convention in the settings
 */
public class ConventionListFragment extends AbstractItemListFragment{
    /** The parent convention of conventions to display */
    PrayerTimesUtils.Convention parentConvention = null;

    /**
     * Set the parent convention of the conventions to display.
     * @param parentConvention The parent convention of the conventions to display to set
     */
    public void setParentConvention(PrayerTimesUtils.Convention parentConvention){
        this.parentConvention = parentConvention;
    }

    @Override
    public ItemListAdapter getAdapter(RecyclerView recyclerView) {
        ConventionListAdapter conventionListAdapter =  new ConventionListAdapter(recyclerView, getMainActivity());
        conventionListAdapter.setParentConvention(parentConvention);
        return conventionListAdapter;
    }

    @Override
    public int getTitleResId() {
        return R.string.convention;
    }
}
