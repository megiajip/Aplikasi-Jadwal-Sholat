package com.example.jadwalsholat.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.R;
import com.example.jadwalsholat.adapter.ItemListAdapter;
import com.example.jadwalsholat.adapter.NotificationSoundListAdapter;

/**
 * This fragment let the user choose a notification sound in the settings
 */
public class NotificationSoundListFragment extends AbstractItemListFragment{
    @Override
    public ItemListAdapter getAdapter(RecyclerView recyclerView) {
        return new NotificationSoundListAdapter(recyclerView, getMainActivity());
    }

    @Override
    public int getTitleResId() {
        return R.string.prayer_notification_sound;
    }
}