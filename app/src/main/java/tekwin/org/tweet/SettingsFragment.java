package tekwin.org.tweet;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * Created by adamdebbagh on 2/17/15.
 */
public class SettingsFragment extends PreferenceFragment {
    private SharedPreferences prefs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       addPreferencesFromResource(R.xml.settings);
    }

    @Override
    public void onStart() {
        super.onStart();

    prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        prefs.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() {
            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

            }
        });
    }


}
