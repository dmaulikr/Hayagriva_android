package g.hayagreevaswamy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Naren on 20-Apr-17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {

            case 0:

                return new AboutTab();
            case 1:

                return new EventsTab();

            case 2:
               return new NewsTab();

        }

        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "ABOUT";
            case 1:
                return "EVENTS";
            case 2:
                return "NEWS";
        }
        return null;
    }

}
