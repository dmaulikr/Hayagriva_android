package g.hayagreevaswamy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

;

/**
 * A simple {@link Fragment} subclass.
 */
public class RitualsFragment extends Fragment {
    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private static ArrayList<RitualsDataModel> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    public RitualsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View rootView = inflater.inflate(R.layout.fragment_rituals, container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.my_recycler_view2);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<RitualsDataModel>();
        for (int i = 0; i < RitualsMyData.nameArray.length; i++) {
            data.add(new RitualsDataModel(
                    RitualsMyData.nameArray[i],
                    RitualsMyData.timeArray[i],
                    RitualsMyData.id_[i],
                    RitualsMyData.drawableArray[i]
            ));
        }


        adapter = new RitualsCustomAdapter(data);
        recyclerView.setAdapter(adapter);

        return rootView;


    }
}

