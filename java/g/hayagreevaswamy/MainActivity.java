package g.hayagreevaswamy;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static View.OnClickListener myOnClickListener;
    private FragmentManager fragmentManager;
    private Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new HomeFragment();
        fragmentTransaction.replace(R.id.fragment_replaces, fragment);
        fragmentTransaction.commit();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.language_english:
                setLocale("en");
                return true;

            case R.id.language_telugu:
                setLocale("te");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void setLocale(String lang) {

        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        // i=1;
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        finish();
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        CharSequence title = item.getTitle();
        if (id == R.id.nav_home)
        {
            getSupportActionBar().setTitle(title);
            fragment = new HomeFragment();
        }
        else
        if (id == R.id.nav_history) {
            // Handle the camera action
            fragment = new HistoryFragment();
            getSupportActionBar().setTitle(title);
        } else if (id == R.id.nav_photo_gallery) {

            fragment = new PhotoGalleryFragment();
            getSupportActionBar().setTitle(title);

        } else if (id == R.id.nav_audio_gallery) {
            fragment = new AudioGalleryFragment();
            getSupportActionBar().setTitle(title);
        } else if (id == R.id.nav_rituals) {
            fragment = new RitualsFragment();
            getSupportActionBar().setTitle(title);
        }
        else if (id == R.id.nav_temples) {
            getSupportActionBar().setTitle(title);
            fragment = new HTemplesFragment();
        } else if (id == R.id.nav_moreinfo) {
            fragment = new MoreinfoFragment();
        }

        else if (id == R.id.nav_share) {
            fragment = new ShareFragment();
            //getSupportActionBar().setTitle(title);

        }
        //getSupportActionBar().setTitle(title);
        else if (id == R.id.nav_nearby_attractions) {
            getSupportActionBar().setTitle(title);

            fragment = new NearByAttractionsFragment();
        }
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_replaces, fragment);
        transaction.commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public View getTabView(int position){
        View tab = LayoutInflater.from(MainActivity.this).inflate(R.layout.content_main, null);
        TextView tv = (TextView)tab.findViewById(R.id.fragment_replaces);
        return tab;
    }
}
