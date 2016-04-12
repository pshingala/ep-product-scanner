package com.epages.epagesproductscanner;


import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;


public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

    public SettingsFragment() {
    }


}
