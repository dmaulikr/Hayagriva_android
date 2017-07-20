package g.hayagreevaswamy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NewsTab extends Fragment  {
public NewsTab() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onSaveInstanceState(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_news_tab2, container, false);

        return v;
      }
}
