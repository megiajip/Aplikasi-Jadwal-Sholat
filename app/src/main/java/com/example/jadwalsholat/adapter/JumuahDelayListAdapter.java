package com.example.jadwalsholat.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.jadwalsholat.MainActivity;
import com.example.jadwalsholat.R;
import com.example.jadwalsholat.utils.AlarmUtils;
import com.example.jadwalsholat.utils.SharedPreferencesUtils;

/**
 * This class is used as adapter for list of delay before Jumuah in the settings.
 */
public class JumuahDelayListAdapter extends ItemListAdapter {
    /**
     * Instantiates a new adapter
     * @param recyclerView The RecyclerView on which the adapter is applied
     * @param activity     The parent activity
     */
    public JumuahDelayListAdapter(RecyclerView recyclerView, MainActivity activity) {
        super(recyclerView, activity);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    @Override
    public boolean isSelected(int position) {
        return (SharedPreferencesUtils.getJumuahFirstCallDelay(activity)-10)/5 == position;
    }

    @Override
    public String getText(int position) {
        return activity.getString(R.string.minutes_before_jumuah, (position*5)+10);
    }

    @Override
    public boolean onClick(int position) {
        SharedPreferencesUtils.putJumuahFirstCallDelay(activity, (position*5)+10);

        new Thread(new Runnable() {
            @Override
            public void run() {
                AlarmUtils.notifyAndSetNextAlarm(activity, false);
            }
        }).start();
        return true;
    }
}
