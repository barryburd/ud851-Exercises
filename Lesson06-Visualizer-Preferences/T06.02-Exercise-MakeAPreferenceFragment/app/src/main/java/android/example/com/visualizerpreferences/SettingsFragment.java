package android.example.com.visualizerpreferences;

/**
 * Created by barryburd on 2/18/18.
 */

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
