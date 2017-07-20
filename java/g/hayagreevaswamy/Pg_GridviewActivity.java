package g.hayagreevaswamy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Pg_GridviewActivity extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    int logos[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8,R.drawable.image9,R.drawable.image10};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pggridview);
        Intent i= getIntent();
        int p= i.getIntExtra("image",0);
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new Pg_ViewPagerAdapter(this,logos,p);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(p);
    }
}


