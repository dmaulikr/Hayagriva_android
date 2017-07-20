package g.hayagreevaswamy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NearByAttractionsFragment extends Fragment {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    private static ArrayList<NBdatamodel> data;
    static View.OnClickListener myOnClickListener;
    LinearLayoutManager mLayoutManager;



    public NearByAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_near_by_attractions, container, false);
        myOnClickListener = new NearByAttractionsFragment.MyOnClickListener(this);

        recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view4);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<NBdatamodel>();
        for (int i = 0; i < NbData.images.length; i++) {
            data.add(new NBdatamodel(
                    NbData.places[i],
                    NbData.images[i]
            ));
        }
        adapter = new NBAPlacesAdapter(data);
        recyclerView.setAdapter(adapter);
        return v;
    }
    private class MyOnClickListener implements View.OnClickListener
    {

        private final NearByAttractionsFragment context;

        private MyOnClickListener(NearByAttractionsFragment context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int position = recyclerView.getChildPosition(v);
            RecyclerView.ViewHolder viewHolder
                    = recyclerView.findViewHolderForPosition(position);

                int itemposition=position;

                if (position == 0)
                {
                    Intent myIntent = new Intent(v.getContext(),NBALocation.class);
                    myIntent.putExtra("id", itemposition);
                    startActivityForResult(myIntent, 0);
                }

                else  if (position == 1)
                {
                    Intent myIntent = new Intent(v.getContext(), NBALocation.class);
                    //myIntent.putExtra("patha",2);
                    myIntent.putExtra("id", itemposition);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 2)
                {
                    Intent myIntent = new Intent(v.getContext(), NBALocation.class);
                    //myIntent.putExtra("surendra",3);
                    myIntent.putExtra("id", itemposition);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 3)
                {
                    Intent myIntent = new Intent(v.getContext(),NBALocation.class);
                    myIntent.putExtra("id", itemposition);
                    startActivityForResult(myIntent, 0);
                }
            }
        }

    }


