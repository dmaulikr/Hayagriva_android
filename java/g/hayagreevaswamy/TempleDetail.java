package g.hayagreevaswamy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TempleDetail extends AppCompatActivity {
TextView tv;
    ImageView iv;
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temple_detail);
        iv=(ImageView)findViewById(R.id.Timage);
        tv=(TextView)findViewById(R.id.Ttxt);
        Intent i = getIntent();
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            temp = extras.getInt("id");
        if (temp == 0) {
            getSupportActionBar().setTitle("Yadgirigutta");
            iv.setImageResource(R.drawable.yadgiri);
            tv.setText(R.string.ht_about_yadagiri_gutta);
        }
        else if (temp == 1) {
            getSupportActionBar().setTitle("Machilipatnam");
            iv.setImageResource(R.drawable.hmachilipatnam);
            tv.setText(R.string.ht_about_machilipatnam);

        }
        else if (temp == 2) {
            getSupportActionBar().setTitle("Mahabubnagar");
            iv.setImageResource(R.drawable.hmahabubnagar);
            tv.setText(R.string.ht_about_mahabubnagar);
            }

        else if (temp == 3) {
            getSupportActionBar().setTitle("Bangalore");
            iv.setImageResource(R.drawable.hblore);
        tv.setText(R.string.ht_about_bangolore);
    }
        else if (temp == 4) {
            getSupportActionBar().setTitle("Madurai");
            iv.setImageResource(R.drawable.hmadurai);
            tv.setText(R.string.ht_about_madhurai);
        }
        else if (temp == 5) {
            getSupportActionBar().setTitle("Pondicherry");
            iv.setImageResource(R.drawable.hpondicherry);
            tv.setText(R.string.ht_about_pondicherry);
            //actionBar.setTitle("Pondicherry");
        }
        else if (temp == 6) {
            getSupportActionBar().setTitle("Chennai");
            iv.setImageResource(R.drawable.hchennai);
            tv.setText(R.string.ht_about_chennai);
        }
        else if (temp == 7) {
            getSupportActionBar().setTitle("Chettypunyam");
            iv.setImageResource(R.drawable.hchetti);
            tv.setText(R.string.ht_about_chettypunyam);


        }
        else if (temp == 8) {
            getSupportActionBar().setTitle("Thiruvahindrapuram");
            iv.setImageResource(R.drawable.hthiruvahindrapuram);
            tv.setText(R.string.ht_about_thiruvahindrapuram);
        }
    }
}
