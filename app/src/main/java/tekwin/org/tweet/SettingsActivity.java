package tekwin.org.tweet;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by adamdebbagh on 2/17/15.
 */
public class SettingsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {

            SettingsFragment fragment = new SettingsFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content,
                    fragment,fragment.getClass().getSimpleName()).commit();
        }


    }
}
