package com.example.jose.preferenceactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by manjusha on 2/24/2015.
 */
public class Preferance extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.user_settings);
    }
}
