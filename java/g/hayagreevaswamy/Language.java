package g.hayagreevaswamy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;


public class Language extends Activity
{
    Button b;
    Locale myLocale;
    private RadioGroup radio_Language;
    private RadioButton radio_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_language);


        b=(Button)findViewById(R.id.button1);

        radio_Language=(RadioGroup)findViewById(R.id.radioGroup);

        b.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                int selectedId=radio_Language.getCheckedRadioButtonId();
                radio_selected=(RadioButton)findViewById(selectedId);

                //Toast.makeText(getApplicationContext(), "Selected="+radio_selected.getText()+" "+getResources().getString(R.string.lang_en)+" "+getResources().getString(R.string.lang_te), 2000).show();

                if(radio_selected.getText().equals(getResources().getString(R.string.lang_en)))
                {//Toast.makeText(getApplicationContext(), "0 Selected english", 2000).show();
                    setLocale("en");
                }else if(radio_selected.getText().equals(getResources().getString(R.string.lang_te)))
                {//Toast.makeText(getApplicationContext(), "0 Selected telgu", 2000).show();
                    setLocale("te");
                }
            }
        });
    }


    public void setLocale(String lang) {

        //Toast.makeText(getApplicationContext(), "0 Selected lang-"+lang, 2000).show();
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        // i=1;

        
        // Toast.makeText(getApplicationContext(), "1 Selected="+lang, 2000).show();
        Intent refresh = new Intent(this,MainActivity.class);
        // Toast.makeText(getApplicationContext(), "2 Selected="+lang, 2000).show();
        startActivity(refresh);
        // Toast.makeText(getApplicationContext(), "3 Selected="+lang, 2000).show();
        finish();
    }


}
