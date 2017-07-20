package g.hayagreevaswamy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hewlett packard on 15-05-2017.
 */

class NBAPlacesAdapter extends RecyclerView.Adapter<NBAPlacesAdapter.MyViewHolder> {
        private ArrayList<NBdatamodel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textViewName;
    ImageView imageViewIcon;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.textViewName = (TextView) itemView.findViewById(R.id.vName);
        this.imageViewIcon = (ImageView) itemView.findViewById(R.id.vImage);
    }
}

    public NBAPlacesAdapter(ArrayList<NBdatamodel> data) {
        this.dataSet = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nba_list_item, parent, false);

        view.setOnClickListener(NearByAttractionsFragment.myOnClickListener);

        NBAPlacesAdapter.MyViewHolder myViewHolder = new NBAPlacesAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TextView textViewName = holder.textViewName;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(position).getName());
        imageView.setImageResource(dataSet.get(position).getImage());


    }

    public int getItemCount() {
        return dataSet.size();
    }
}