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

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HTemplesFragment extends Fragment {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    static View.OnClickListener myOnClickListener;
    LinearLayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_htemples, container, false);


        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.img.length; i++) {
            data.add(new DataModel(
                    MyData.templePlaces[i],
                    MyData.img[i]
            ));
        }
        adapter = new TemplesAdapter(data);
        recyclerView.setAdapter(adapter);
        return v;
    }


    private class MyOnClickListener implements View.OnClickListener
    {

        private final HTemplesFragment context;

        private MyOnClickListener(HTemplesFragment context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int position = recyclerView.getChildPosition(v);
            RecyclerView.ViewHolder viewHolder
                    = recyclerView.findViewHolderForPosition(position);
            if (position == 0)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }

            else  if (position == 1)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                //myIntent.putExtra("patha",2);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }

            else if (position == 2)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                //myIntent.putExtra("surendra",3);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id",position);
                startActivityForResult(myIntent, 0);
            }

            else if (position == 3)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id",position);
                startActivityForResult(myIntent, 0);
            }
            else if (position == 4)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }
            else if (position == 5)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }
            else if (position == 6)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }
            else if (position == 7)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }
            else if (position == 8)
            {
                Intent myIntent = new Intent(v.getContext(),TempleDetail.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                myIntent.putExtra("id", position);
                startActivityForResult(myIntent, 0);
            }

        }


    }
}