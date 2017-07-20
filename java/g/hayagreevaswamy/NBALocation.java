package g.hayagreevaswamy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hewlett packard on 12-05-2017.
 */

public class NBALocation extends AppCompatActivity {
    TextView stxt;
    ImageView iv;
    int temp;
    ImageButton ib;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nba_location);
        stxt = (TextView) findViewById(R.id.ytxt);
        iv = (ImageView) findViewById(R.id.yimage);
        ib=(ImageButton) findViewById(R.id.mapmarker);
        Intent i = getIntent();
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            temp = extras.getInt("id");
        if (temp == 0) {
            getSupportActionBar().setTitle("Yadgirigutta");
            iv.setImageResource(R.drawable.yadgiri);
            stxt.setText(R.string.about_yadagiri_gutta);
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                    intent.putExtra("d",temp);
                    startActivity(intent);
                }
            });
        }
        else if (temp == 1) {
            getSupportActionBar().setTitle("Pathagutta");
            iv.setImageResource(R.drawable.pathagutta);
            stxt.setText(R.string.about_patha_gutta);
            //assert actionBar != null;
            //actionBar.setTitle("Pathagutta");
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                    intent.putExtra("d",temp);
                    startActivity(intent);

                }
            });
        }
        else if (temp == 2) {
            getSupportActionBar().setTitle("Surendrapuri");
            iv.setImageResource(R.drawable.surendrapuri);
            stxt.setText(R.string.about_suredrapuri);
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                    intent.putExtra("d",temp);
                    startActivity(intent);

                }
            });
        }
        else if (temp == 3) {
            getSupportActionBar().setTitle("Bhongiri");
            iv.setImageResource(R.drawable.bhongir);
            stxt.setText(R.string.about_bhonagiri_fort);
            ib.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
                    intent.putExtra("d",temp);
                    startActivity(intent);
                }
            });
        }
    }
}