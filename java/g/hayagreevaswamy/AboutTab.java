package g.hayagreevaswamy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Naren on 20-Apr-17.
 */

public class AboutTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_about,container,false);
        TextView tex=(TextView)v.findViewById(R.id.textView2);
        tex.setText(Html.fromHtml("<h1>About the god</h1>"+
                "<p>Shri Lakshmi Hayagreeva swamy Temple located in YadagiriGutta of the Nalgonda distict, was build on 27 July 2002 (Jeshta Bahula Tadiya) is privately managed by a Trust Headed by Sri N Lakshmi NaraSimhaCharyulu. The Architechture of the temple is very modern with a Pandyal Design.</p>"+
        "<p1>In Hinduism, Lord Hayagriva is an avatar of shri Vishnu.He is worshipped as the God of knowledge and wisdom, with a human body and a horse's head, brilliant white in color, with white garments and seated on a white lotus.</p1>"+
        "<p2> Hayagriva is one of the prominent deity in Vaishnava tradition.His blessings are sought when beginning study of both sacred and secular subjects.</p2> "+
        "<p3>Special worship is conducted on the day of the full moon in August (Śravaṇa-Paurṇamī) (his avatāra-dina) and on Mahanavami, the ninth day of the Navaratri festival. He is also hailed as \"Hayasirsa\".[4] Hayaśirṣa means haya=Horse, śirṣa=Head.</p>"+
        "<p4>This verse is originally from the Pañcarātra Agamas but is now popularly prefixed to the Hayagriva Stotram of the 13th-century poet-philosopher Vedanta Desika. It is very popular among devotees of Hayagrīva.</p>"));

        return v;

    }
}
